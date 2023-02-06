package com.kiran.UserManagement.ExceptionHandling;

public class UserNotFound extends RuntimeException{

    public UserNotFound(String message) {
        super(message);
    }
}
