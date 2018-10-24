package by.volosevich.mystore.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource datasource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .jdbcAuthentication()
                .dataSource(datasource)
                .passwordEncoder(passwordEncoder())
                .groupAuthoritiesByUsername("select g.id, g.group_name, ga.authority from store.groups g," +
                        " store.group_members gm, store.group_authorities " +
                        "ga where gm.username = ? and g.id = ga.group_id and g.id = gm.group_id")
                .getUserDetailsService()
                .setEnableGroups(true);
        auth.jdbcAuthentication().getUserDetailsService().setEnableAuthorities(false);
    }


    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .exceptionHandling()
                .accessDeniedPage("/invalidAccess")
                .and()
                .authorizeRequests()
                .antMatchers("/resources/**")
                .permitAll()
                .antMatchers("/admin**").hasAuthority("ADMIN")
                .antMatchers("/user**").hasAuthority("USER")
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/LogedIn", true)
                .usernameParameter("user")
                .passwordParameter("password")
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout")
                .deleteCookies("JSESSIONID")
                .and()
                .csrf()
                .and()
                .rememberMe()
                .alwaysRemember(true)
                .tokenValiditySeconds(300)
                .useSecureCookie(false)
                .rememberMeCookieName("Kuzma_cookie")
                .tokenRepository(repository());
    }

    @Bean
    public PersistentTokenRepository repository(){
        JdbcTokenRepositoryImpl jdbcTokenRepository = new JdbcTokenRepositoryImpl();
        jdbcTokenRepository.setDataSource(datasource);
        return jdbcTokenRepository;
    }
}
