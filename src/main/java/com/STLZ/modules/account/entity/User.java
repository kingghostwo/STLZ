package com.STLZ.modules.account.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    private String userId;
    @Column(name = "name")
    private String Name;
    @Column(name = "password")
    private String password;
    @Column(name = "tel")
    private String Tel;
    @Column(name = "email")
    private String Email;

    @Column(name = "headIcon")
    private String headIcon;

    @Column(name = "createTime")
    private Date createTime;

    @Column(name = "messageNot")
    private boolean MessageNot;


    @Column(name = "userType")
    private String userType;

}
