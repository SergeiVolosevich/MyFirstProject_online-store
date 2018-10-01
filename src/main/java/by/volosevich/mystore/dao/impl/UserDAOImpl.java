package by.volosevich.mystore.dao.impl;

import by.volosevich.mystore.dao.UserDAO;
import by.volosevich.mystore.dao.sql_statement.Statements;
import by.volosevich.mystore.model.Login;
import by.volosevich.mystore.model.User;
import by.volosevich.mystore.model.UserStatusEnum;
import com.sun.prism.j2d.J2DPipeline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void register(User user) {

        jdbcTemplate.update(Statements.SQL_UDATE_USERS, new Object[]{
                user.getUserName(),
                user.getPassword(),
                user.getEmail()

        });

        jdbcTemplate.update(Statements.SQL_UPDATE_USER_INFO, new Object[]{
                user.getUserName(),
                user.getName(),
                user.getSurname(),
                user.getPatronymic(),
                user.getSex(),
                user.getBirthdayDate()
        });
    }
}
