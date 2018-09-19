package by.volosevich.mystore.dao.impl;

import by.volosevich.mystore.dao.UserDAO;
import by.volosevich.mystore.dao.sql_statement.Statements;
import by.volosevich.mystore.model.Login;
import by.volosevich.mystore.model.User;
import by.volosevich.mystore.model.UserStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAOImpl implements UserDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void register(User user) {
//jdbcTemplate.update(Statements.SQL_INSERT_USER,new Object[]{
//        user.getUserLoggin(),
//        user.getPassword(),
//        user.getEmail()
}

    @Override
    public User validateUser(Login login) {
        return null;
    }

    @Override
    public boolean changePassword(User user) {
        return false;
    }
}
