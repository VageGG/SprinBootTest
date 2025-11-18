package org.example.springboottest.service;

import org.example.springboottest.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveOrUpdateUser(User user);
    void deleteUser(Long id);
}