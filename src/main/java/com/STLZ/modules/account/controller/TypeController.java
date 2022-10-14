package com.STLZ.modules.account.controller;

import com.STLZ.commons.Results;
import com.STLZ.modules.account.entity.Type;
import com.STLZ.modules.account.service.TypeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/typeApi")
public class TypeController {

    @Autowired
    TypeService typeService;

    /**
     * @return localhost:8080/typeApi/types
     */
    @RequestMapping("/types")
    List<Type> getType(){
        return typeService.getType();
    }

    /**
     * @param typeId localhost:8080/typeApi/findOne/{typeId}
     * @return
     */
    @RequestMapping("/findOne/{typeId}")
    Type findById(@PathVariable int typeId){
        return typeService.findById(typeId);
    }

    /**
     * @param type localhost:8080/typeApi/insert    ----post
     *             {"type":"admin"}
     * @return
     */
    @PostMapping(value = "/insert", consumes = "application/json")
    Results<Type> insertType(@RequestBody Type type){
        return typeService.insertType(type);
    }

}
