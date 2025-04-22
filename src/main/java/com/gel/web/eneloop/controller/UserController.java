package com.gel.web.eneloop.controller;

import com.gel.web.eneloop.pojo.User;
import com.gel.web.eneloop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user/name/{name}")
    @ResponseBody
    public User getUserByName(@PathVariable("name") String name){
        return userService.getUserByName(name);
    }

    @PostMapping("/user/balance/{userId}/{balance}")
    @ResponseBody
    public void updateBalance(@PathVariable("userId") int userId, @PathVariable("balance") int balance) {
        userService.updateUserBalance(userId, balance);
    }
}
