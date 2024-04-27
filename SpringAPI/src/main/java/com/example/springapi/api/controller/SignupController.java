package com.example.springapi.api.controller;

import com.example.springapi.api.model.SignupRequest;
import com.example.springapi.api.model.User;
import com.example.springapi.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {

    private final SignupService signupService;

    @Autowired
    public SignupController(SignupService signupService) {
        this.signupService = signupService;
    }

    @PostMapping("/signup")
    public String signup(@RequestBody SignupRequest request) {
        // Create a new user
        User newUser = new User();
        newUser.setEmail(request.getEmail());
        newUser.setName(request.getName());
        newUser.setPassword(request.getPassword());

        // Add the new user
        boolean success = signupService.addUser(newUser);

        if (success) {
            return "Account Creation Successful";
        } else {
            return "Forbidden, Account already exists";
        }
    }
}
