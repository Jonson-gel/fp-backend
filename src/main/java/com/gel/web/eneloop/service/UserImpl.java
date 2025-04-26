package com.gel.web.eneloop.service;

import com.gel.web.eneloop.mapper.UserMapper;
import com.gel.web.eneloop.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByName(String name){
        return userMapper.getUserByName(name);
    }

    @Override
    public void updateUserBalance(int userId, int balance){
        userMapper.updateUserBalance(userId, balance);
    }

    @Override
    public User getUserById(int userId){
        return userMapper.getUserById(userId);
    }
}
