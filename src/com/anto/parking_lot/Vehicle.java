package com.anto.parking_lot;

import lombok.Data;

@Data
public abstract class Vehicle {
    private String number;
    private ParkingTicket parkingTicket;
    private VehicleType vehicleType;

    Vehicle(VehicleType vehicleType){
        this.vehicleType = vehicleType;
    }
}

