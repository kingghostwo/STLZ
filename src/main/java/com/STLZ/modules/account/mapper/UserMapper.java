package com.STLZ.modules.account.mapper;

import com.STLZ.modules.account.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    @Insert("insert into user (userId,name,password,userType,tel,email,headIcon,remark) " +
            "values (#{userId},#{name},#{password},#{userType},#{tel},#{email},#{headIcon},#{remark})")
    void insertUser(User user);

    @Select("select * from user where userName = #{userName}")
    User getUserByUserName(String userName);
}
