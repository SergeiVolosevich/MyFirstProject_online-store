package by.volosevich.mystore.service;

import by.volosevich.mystore.model.Users;

public interface UserService {

    void registerUser(Users user) throws Exception;

    int sizeOfListUsernames(String username);
}
