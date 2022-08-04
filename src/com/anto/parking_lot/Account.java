package com.anto.parking_lot;

import lombok.Data;

@Data
public abstract class Account {
    private String userName;
    private String password;
    private AccountStatus accountStatus;
    private Person person;

    public boolean resetPassword(){
        // to do
        return true;
    };
}
