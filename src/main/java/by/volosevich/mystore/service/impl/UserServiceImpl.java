package by.volosevich.mystore.service.impl;

import by.volosevich.mystore.dao.UserDAO;
import by.volosevich.mystore.model.User;
import by.volosevich.mystore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    public void registerUser(User user) {
        String hashPassword;
        hashPassword = user.getPassword();
        user.setPassword(encoder.encode(hashPassword));
        userDAO.register(user);
    }
}
