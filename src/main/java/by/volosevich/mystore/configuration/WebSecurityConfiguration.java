//package by.volosevich.mystore.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import javax.sql.DataSource;
//
//
////@Configuration
////@EnableWebSecurity
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
////    @Autowired
////    private DataSource datasource;
////
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth
////                .jdbcAuthentication()
////                .dataSource(datasource)
////                .passwordEncoder(passwordEncoder())
////                .getUserDetailsService()
////                .setEnableGroups(true);
////        auth.jdbcAuthentication().getUserDetailsService().setEnableAuthorities(false);
////    }
////
////    @Bean
////    public BCryptPasswordEncoder passwordEncoder() {
////        return new BCryptPasswordEncoder();
////    }
////
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http
////                .exceptionHandling()
////                .accessDeniedPage("/invalidAccess")
////                .and()
////                .authorizeRequests()
////                .antMatchers("/resources/**").permitAll()
////                .antMatchers("/admin**").hasAuthority("ADMIN")
////                .antMatchers("/admin**").hasAuthority("USER")
////                .and()
////                .formLogin()
////                .loginPage("/login")
////                .defaultSuccessUrl("/userLogedIn", true)
////                .usernameParameter("user")
////                .passwordParameter("password")
////                .and()
////                .logout()
////                .logoutUrl("/logout")
////                .logoutSuccessUrl("/login?logout")
////                .deleteCookies("JSESSIONID")
////                .and()
////                .rememberMe()
////                .tokenValiditySeconds(300);
////    }
//}
