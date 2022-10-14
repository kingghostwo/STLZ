package com.STLZ.modules.account.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_type")
@Data
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userTypeId;
    @Column(name = "userId")
    private int userId;
    @Column(name = "typeId")
    private int typeId;
}
