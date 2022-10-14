package com.STLZ.modules.account.service.impl;

import com.STLZ.commons.Results;
import com.STLZ.modules.account.entity.Type;
import com.STLZ.modules.account.entity.User;
import com.STLZ.modules.account.mapper.TypeMapper;
import com.STLZ.modules.account.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    TypeMapper typeMapper;

    @Override
    public List<Type> getType() {
        return typeMapper.getType();
    }

    @Override
    public Type findById(int typeId) {
        return typeMapper.findById(typeId);
    }

    @Override
    public Results<Type> insertType(Type type) {
        Results<Type> result = new Results<Type>(Results.ResultStatus.SUCCESS.status, "success");

        Type typeTemp = typeMapper.findById(type.getTypeId());
        if (typeTemp != null) {
            result.setStatus(Results.ResultStatus.FAILED.status);
            result.setMessage("User name is repeat.");
            return result;
        }
        type.setCreateTime(new Date());
//        user.setPassword(MD5Util.getMD5(user.getPassword()));
        typeMapper.insertType(type);
        return result;
    }
}
