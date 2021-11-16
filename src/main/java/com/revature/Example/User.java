package com.revature.Example;

import com.revature.annotations.Column;
import com.revature.annotations.NotNull;
import com.revature.annotations.PrimaryKey;
import com.revature.annotations.Unique;

public class User {

    @PrimaryKey
    public int id;
    @Unique
    @NotNull
    private String username;
    @NotNull
    private String password;
    @Column
    private String firstName;
    @Column
    Integer age;

}