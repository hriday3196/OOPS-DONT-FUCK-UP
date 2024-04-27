package com.example.springapi.service;

import com.example.springapi.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final UserService userService;

    @Autowired
    public LoginService(UserService userService) {
        this.userService = userService;
    }

    public String authenticate(String email, String password) {
        User user = userService.getUserByEmail(email);
        if (user != null) {
            // User exists, check password
            if (password.equals(user.getPassword())) {
                return "Login Successful";
            } else {
                return "Username/Password Incorrect";
            }
        } else {
            return "User does not exist";
        }
    }
}
