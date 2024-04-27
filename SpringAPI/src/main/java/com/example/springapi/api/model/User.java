package com.example.springapi.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User {

    private int userID;
    private String name;
    private String email;
    private String password; // Add password field
    private List<Map<String, Object>> posts;

    public User() {
        // Default constructor
    }

    public User(int userID, String name, String email, String password, List<Map<String, Object>> posts) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.posts = posts;
    }

    public <E> User(int i, String ben, String mail, ArrayList<E> es) {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() { // Getter for password
        return password;
    }

    public void setPassword(String password) { // Setter for password
        this.password = password;
    }

    public List<Map<String, Object>> getPosts() {
        return posts;
    }

    public void setPosts(List<Map<String, Object>> posts) {
        this.posts = posts;
    }
}
