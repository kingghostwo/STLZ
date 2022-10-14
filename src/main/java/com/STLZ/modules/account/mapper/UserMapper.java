package com.STLZ.modules.account.mapper;

import com.STLZ.modules.account.entity.Type;
import com.STLZ.modules.account.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
//    @Results({
//            @Result(id=true,property = "typeId",column = "type_id"),
//            @Result(property = "createTime",column = "create_time"),
//            @Result(property = "type",column = "type",
//                    javaType = Type.class,
//                    one = @One(select = "com.STLZ.modules.account.mapper.TypeMapper.findById"))
//    })
    List<User> getUsers();



    @Insert("insert into user (name,password,type_id,tel,email) " +
            "values (#{name}, #{password}, #{typeId}, #{tel}, #{email})")
//    @Insert("<script>                                  "
//            + "insert into user                    "
//            + "(name, password, userType, tel, email, headIcon)                   "
//            + "values                                  "
//            + "<foreach collection='user' item='item'  "
//            + " index='index' separator=','>           "
//            + "(#{name}, #{password}, #{userType}, #{tel}, #{email}, #{headIcon}) "
//            + "</foreach>                              "
//            + "</script>                               ")
    void insertUser(User user);

    @Select("select * from user where name = #{name}")
    User getUserByUserName(String name);

}
