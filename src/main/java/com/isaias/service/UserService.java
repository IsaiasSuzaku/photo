package com.isaias.service;

import com.isaias.entity.User;

/**
 * 业务层接口
 * 声明软件业务功能方法
 */
public interface UserService {
    User login(String name, String password) throws NameException,PasswordException;
}
