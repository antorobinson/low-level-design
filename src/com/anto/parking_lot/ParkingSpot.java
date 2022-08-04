package com.anto.parking_lot;

import lombok.Data;

@Data
public abstract class ParkingSpot {
    private ParkingSpotType parkingSpotType;
    private boolean free;
    private Vehicle vehicle;
    private String number;

    ParkingSpot(ParkingSpotType parkingSpotType){
        this.parkingSpotType = parkingSpotType;
    }

    public boolean assignVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        free = false;
        return true;
    }

    public boolean removeVehicle(){
        this.vehicle = null;
        free = true;
        return true;
    }

}
