package com.anto.parking_lot;

import lombok.Data;
import lombok.extern.log4j.Log4j;

import java.util.Map;

@Data
@Log4j
public class ParkingFloor {
    private String name;
    private Map<String, HandicappedSpot> handicappedSpotMap;
    private Map<String, CompactSpot> compactSpotMap;
    private Map<String, LargeSpot> largeSpotMap;
    private Map<String, MotorbikeSpot> motorbikeSpotMap;
    private Map<String, ElectricSpot> electricSpotMap;
    private Map<String, CustomerInfoPanel> customerInfoPanelMap;
    private ParkingDisplayBoard parkingDisplayBoard;

    private int freeHandicappedSpotCount;
    private int freeCompactSpotCount;
    private int freeLargeSpotCount;
    private int freeMotorbikeSpotCount;
    private int freeElectricSpotCount;

    ParkingFloor(String name){
        this.name = name;
    }

    public void addParkingSpot(ParkingSpot parkingSpot){
        // to do
    }

    public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot parkingSpot){
        parkingSpot.assignVehicle(vehicle);
        switch(parkingSpot.getParkingSpotType()){
            case HANDICAPPED:
                freeHandicappedSpotCount--;
                if(parkingDisplayBoard.getHandicappedSpot().getNumber() == parkingSpot.getNumber()){
                    for(HandicappedSpot spot : handicappedSpotMap.values()){
                        if(spot.isFree()){
                            parkingDisplayBoard.setHandicappedSpot(spot);
                        }
                    }
                    parkingDisplayBoard.showEmptySpotNumber();
                }
                break;
            case LARGE:
                freeLargeSpotCount--;
                // to do
                break;
            case COMPACT:
                freeCompactSpotCount--;
                // to do
                break;
            case ELECTRIC:
                freeElectricSpotCount--;
                // to do
                break;
            case MOTORBIKE:
                freeMotorbikeSpotCount--;
                // to do
                break;
            default:
                log.error("Invalid parking spot type");
        }
    }

    public void freeSpot(ParkingSpot parkingSpot){
        parkingSpot.removeVehicle();
        switch(parkingSpot.getParkingSpotType()){
            case HANDICAPPED:
                freeHandicappedSpotCount++;
                break;
            case LARGE:
                freeLargeSpotCount++;
                // to do
                break;
            case COMPACT:
                freeCompactSpotCount++;
                // to do
                break;
            case ELECTRIC:
                freeElectricSpotCount++;
                // to do
                break;
            case MOTORBIKE:
                freeMotorbikeSpotCount++;
                // to do
                break;
            default:
                log.error("Invalid parking spot type");
        }
    }

}
