package com.example.springapi.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SignupService {

    private List<User> userList;

    public SignupService() {
        userList = new ArrayList<>();
    }

    public boolean addUser(User newUser) {
        // Check if the user already exists
        for (User user : userList) {
            if (user.getEmail().equals(newUser.getEmail())) {
                return false; // User already exists
            }
        }

        // Add the new user
        userList.add(newUser);
        return true; // User added successfully
    }
}
