package org.example;

public class UserValidator {

    public void validateEmail(String email) {
        if (email == null) {
            throw new NullPointerException("Email cannot be null");
        }
        if (email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email has to contain @");
        }
    }
}