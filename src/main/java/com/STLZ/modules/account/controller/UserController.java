package com.STLZ.modules.account.controller;

import com.STLZ.commons.Results;
import com.STLZ.modules.account.entity.User;
import com.STLZ.modules.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    /**
     * @param user localhost:8080/userApi/insertUser ---post
     *          {"name":"a", "password":"123, "userType":"1", "tel":"13812345678", "email":"914@qq.com"}
     * @return Results
     */
    @PostMapping(value = "/insertUser", consumes = "application/json")
    public Results<User> insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }
}
