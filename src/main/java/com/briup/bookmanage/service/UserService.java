package com.briup.bookmanage.service;

import com.briup.bookmanage.bean.User;
import com.briup.bookmanage.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("UserService")
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User findByUsername(User user){
        return userMapper.findByUsername(user.getUsername());
    }
    public User findUserById(String userId) {
        return userMapper.findUserById(userId);
    }

    public User Checker(String userId){
        User username = findUserById(userId);
        return username;
    }

}