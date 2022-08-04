package com.anto.library_management_system;

import lombok.Data;

@Data
public abstract class Account{
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;

//    public boolean resetPassword();
}