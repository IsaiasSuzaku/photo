package com.isaias.service;

import com.isaias.dao.UserDao;
import com.isaias.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    public UserDao userDao;
    public User login(String name, String password) throws NameException, PasswordException {
        if(name==null||name.trim()==""){
            throw new NameException("用户名不能为空");
        }
        if(password==null||name.trim()==""){
            throw new PasswordException("密码不能为空");
        }
        User user=userDao.findUserByName(name);
        if(user==null){
            throw new NameException("错误");
        }
        if(user.getPassword().equals(password)){
            return user;
        }
        throw new PasswordException("密码错误");
    }
}
