package com.STLZ.modules.account.mapper;

import com.STLZ.modules.account.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserTypeMapper {

    @Insert("insert into user_type (user_id,type_id) values (#{userId}, #{typeId})")
    void insertLine(User user);

}
