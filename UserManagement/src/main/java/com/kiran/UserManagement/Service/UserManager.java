package com.kiran.UserManagement.Service;

import com.kiran.UserManagement.Model.User;

import java.util.List;

public interface UserManager {
    User create(User user);

    User getUserById(int id);

    List<User> getAllUSers();

    String updateUserInfo(int id, User user);

    String deleteUser(int id);
}
