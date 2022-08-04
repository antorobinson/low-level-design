package com.anto.parking_lot;

import lombok.Data;
import lombok.extern.log4j.Log4j;

import java.util.Map;

@Data
@Log4j
public class ParkingLot {
    private String name;
    private Address address;
    private ParkingRate parkingRate;

    private int compactSpotCount;
    private int largeSpotCount;
    private int motorbikeSpotCount;
    private int electricSpotCount;

    private final int maxCompactSpotCount;
    private final int maxLargeSpotCount;
    private final int maxMotorbikeSpotCount;
    private final int maxElectricSpotCount;

    private Map<String, ParkingFloor> parkingFloorMap;
    private Map<String, EntrancePanel> entrancePanelMap;
    private Map<String, ExitPanel> exitPanelMap;

    private Map<String, ParkingTicket> parkingTicketMap;

    private static ParkingLot parkingLot = null;

    private ParkingLot(){
        // intialize all fields here
        maxCompactSpotCount = 500;
        maxElectricSpotCount = 300;
        maxLargeSpotCount = 500;
        maxMotorbikeSpotCount = 1000;
    }

    public static ParkingLot getInstance(){
        if(parkingLot != null){
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public boolean isFull(Vehicle vehicle){
        // to do
        return false;
    }

    public synchronized ParkingTicket issueParkingTicket(Vehicle vehicle){
        if(isFull(vehicle)){
            log.error("No parking slots");
        }
        ParkingTicket parkingTicket = new ParkingTicket();
        ParkingSpot spot = null;
        for(ParkingFloor parkingFloor : parkingFloorMap.values()){
            if(parkingFloor.getParkingDisplayBoard().getLargeSpot() != null){
                spot = parkingFloor.getParkingDisplayBoard().getLargeSpot();
                parkingFloor.assignVehicleToSpot(vehicle, spot);
                vehicle.setParkingTicket(parkingTicket);
            }
        }
        return parkingTicket;
    }

    public void addParkingFloor(ParkingFloor parkingFloor){
        // TO DO
    }

    public void addEntrancePanel(EntrancePanel entrancePanel){
        // TO DO
    }

    public void addExitPanel(ExitPanel exitPanel){
        // TO DO
    }
}
