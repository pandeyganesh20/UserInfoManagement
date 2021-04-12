package com.user.userinfomanagment.model;

import lombok.Data;
import org.springframework.data.annotation.Reference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user_tbl")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private String gender;
    private String nationality;
    private String hobbies;
    private String comments;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;
    private long mobileNo;
    private String email;
    @OneToOne(cascade = CascadeType.MERGE)
    private Role role;
    @Transient
    private int roleId;




}

