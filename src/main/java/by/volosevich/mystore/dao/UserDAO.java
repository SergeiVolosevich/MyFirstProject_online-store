package by.volosevich.mystore.dao;

import by.volosevich.mystore.model.Users;

import java.util.List;

public interface UserDAO {

    void register(Users user);

    List<String> getAllUserName(String userName);

}
