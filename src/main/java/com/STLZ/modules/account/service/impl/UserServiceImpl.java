package com.STLZ.modules.account.service.impl;

import com.STLZ.commons.Results;
import com.STLZ.modules.account.entity.User;
import com.STLZ.modules.account.entity.UserType;
import com.STLZ.modules.account.mapper.UserMapper;
import com.STLZ.modules.account.mapper.UserTypeMapper;
import com.STLZ.modules.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserTypeMapper userTypeMapper;

    @Override
    public List<User> getUser() {
        return userMapper.getUsers();
    }

    @Override
    public User getUserByUserName(String name) {
        return userMapper.getUserByUserName(name);
    }

    @Override
    @Transactional
    public Results<User> insertUser(User user) {
        Results<User> result = new Results<User>(Results.ResultStatus.SUCCESS.status, "success");

        User userTemp = userMapper.getUserByUserName(user.getName());
        if (userTemp != null) {
            result.setStatus(Results.ResultStatus.FAILED.status);
            result.setMessage("User name is repeat.");
            return result;
        }
        user.setCreateTime(new Date());
        user.setHeadIcon("/static/headImg/"+user.getName());
//        user.setPassword(MD5Util.getMD5(user.getPassword()));
        userMapper.insertUser(user);
        userTypeMapper.insertLine(user);
        return result;
    }
}
