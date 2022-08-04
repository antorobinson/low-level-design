package com.anto.library_management_system;

import lombok.Data;

@Data
public class Person {
    private String name;
    private String emailId;
    private Address address;
    private String phone;
}
