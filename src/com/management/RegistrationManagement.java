package com.management;

	import java.util.HashMap;
import java.util.Map;

public class RegistrationManagement {
    private Map<String, User> registeredUsers;  // Map to store registered users

    public RegistrationManagement() {
        this.registeredUsers = new HashMap<>();
    }

    // Method to register a new user
    public void registerUser(String username, String password, String fullName, String email) {
        // Check if the username is already taken
        if (!registeredUsers.containsKey(username)) {
            // Create a new user object and add it to the map
            User newUser = new User(username, password, fullName, email);
            registeredUsers.put(username, newUser);
            System.out.println("Registration successful for user: " + username);
        } else {
            System.out.println("Username already taken. Please choose another username.");
        }
    }

    // Method to authenticate a user
    public boolean authenticateUser(String username, String password) {
        // Check if the username exists and the password is correct
        if (registeredUsers.containsKey(username)) {
            User user = registeredUsers.get(username);
            return user.getPassword().equals(password);
        }
        return false;
    }

    // Other methods for user management can be added as needed

    // Inner class representing a user
    private static class User {
        private String username;
        private String password;
        private String fullName;
        private String email;

        public User(String username, String password, String fullName, String email) {
            this.username = username;
            this.password = password;
            this.fullName = fullName;
            this.email = email;
        }

        // Getters for user attributes
        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getFullName() {
            return fullName;
        }

        public String getEmail() {
            return email;
        }
    }
}


