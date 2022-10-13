package com.STLZ.modules.account.controller;

import com.STLZ.modules.account.entity.User;
import com.STLZ.modules.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userApi")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @return localhost:8080/userApi/users
     */
    @RequestMapping("/users")
    public List<User> getUsers() {
        return userService.getUser();
    }


}
