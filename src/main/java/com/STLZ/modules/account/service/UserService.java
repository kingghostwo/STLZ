package com.STLZ.modules.account.service;

import com.STLZ.modules.account.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUser();

    User getUserByUserName(String userName);
}
