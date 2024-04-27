package com.example.springapi.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        // Initialize user list with sample users
        User user1 = new User(1, "Ida", "ida@mail.com", new ArrayList<>()); // Empty list for posts
        User user2 = new User(2, "Hans", "hans@mail.com", new ArrayList<>());
        User user3 = new User(3, "Lars", "lars@mail.com", new ArrayList<>());
        User user4 = new User(4, "Ben", "ben@mail.com", new ArrayList<>());
        User user5 = new User(5, "Eva", "eva@mail.com", new ArrayList<>());
        User user6 = new User(6, "John Doe", "john.doe@mail.com", "johnpassword", new ArrayList<>());
        User user7 = new User(7, "Jane Smith", "jane.smith@mail.com", "janepassword", new ArrayList<>());
        User user8 = new User(8, "Alice Brown", "alice.brown@mail.com", "alicepassword", new ArrayList<>());
        User user9 = new User(9, "Bob Johnson", "bob.johnson@mail.com", "bobpassword", new ArrayList<>());
        User user10 = new User(10, "Mary Davis", "mary.davis@mail.com", "marypassword", new ArrayList<>());


        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    // Method to retrieve a user by email
    public User getUserByEmail(String email) {
        return userList.stream()
                .filter(user -> email.equals(user.getEmail()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User with email " + email + " not found"));
    }

    // Method to retrieve a user by ID
    public Optional<User> getUser(Integer id) {
        return userList.stream()
                .filter(user -> id.equals(user.getUserID()))
                .findFirst();
    }
}
