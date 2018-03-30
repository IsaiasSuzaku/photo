package com.isaias.dao;
import com.isaias.entity.User;

public interface UserDao {
    void addUser(User user);
    User findUserByName(String name);
}
