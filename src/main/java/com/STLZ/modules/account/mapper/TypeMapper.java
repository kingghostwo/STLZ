package com.STLZ.modules.account.mapper;

import com.STLZ.modules.account.entity.Type;
import jdk.internal.instrumentation.InstrumentationMethod;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TypeMapper {

    @Select("select * from type group by type")
    List<Type> getType();

    @Select("select * from type where type_id = #{typeId}")
    Type findById(int typeId);

    @Insert("insert into type (type, create_time)" +
            "values (#{type}, #{createTime})")
    void insertType(Type type);

}
