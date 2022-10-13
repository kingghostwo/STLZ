package com.STLZ.modules.account.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_type")
@Data
public class UserType {

    @Id
    private int userTypeId;
    @Column(name = "userId")
    private int userId;
    @Column(name = "typeId")
    private int typeId;
}
