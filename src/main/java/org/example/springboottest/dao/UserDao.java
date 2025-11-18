package org.example.springboottest.dao;

import org.example.springboottest.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(long id);
    void saveOrUpdateUser(User user);
    void deleteUser(long id);
    boolean existsByEmail(String email);
}
