// LoginController.java
package com.example.springapi.api.controller;
import com.example.springapi.api.model.LoginRequest;
import com.example.springapi.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        return loginService.authenticate(loginRequest.getEmail(), loginRequest.getPassword());
    }
}
