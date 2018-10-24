package by.volosevich.mystore.dao.impl;

import by.volosevich.mystore.dao.UserDAO;
import by.volosevich.mystore.dao.sql_statement.Statements;
import by.volosevich.mystore.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void register(Users user) {

        jdbcTemplate.update(Statements.SQL_UDATE_USERS, new Object[]{
                user.getUserName(),
                user.getPassword(),
                user.getEmail()

        });

    }

    @Override
    public List<String> getAllUserName(String userName) {
        List<String> userNames = jdbcTemplate.queryForList(Statements.SQL_SELECT_USERNAMES_FROM_USERS_BY_USERNAME,
                new Object[]{userName},String.class);
        return userNames;
    }
}
