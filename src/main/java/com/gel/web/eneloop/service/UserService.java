package com.gel.web.eneloop.service;

import com.gel.web.eneloop.pojo.User;

public interface UserService {
    public User getUserByName(String name);

    public void updateUserBalance(int userId, int balance);

    public User getUserById(int userId);

}
