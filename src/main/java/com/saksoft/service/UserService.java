package com.saksoft.service;

import com.saksoft.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(int id);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(int id);
}
