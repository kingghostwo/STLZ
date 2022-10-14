package com.STLZ.modules.account.service;

import com.STLZ.commons.Results;
import com.STLZ.modules.account.entity.Type;

import java.util.List;

public interface TypeService {

    List<Type> getType();

    Type findById(int typeId);

    Results<Type> insertType(Type type);
}
