package com.anto.library_management_system;

import lombok.Data;

@Data
public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String pinCode;
    private String country;
}
