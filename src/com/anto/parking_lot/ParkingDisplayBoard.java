package com.anto.parking_lot;

import lombok.Data;
import lombok.extern.log4j.Log4j;

@Data
@Log4j
public class ParkingDisplayBoard {
    private int id;
    private HandicappedSpot handicappedSpot;
    private CompactSpot compactSpot;
    private LargeSpot largeSpot;
    private MotorbikeSpot motorbikeSpot;
    private ElectricSpot electricSpot;

    public void showEmptySpotNumber(){
        StringBuilder stringBuilder = new StringBuilder();
        if(handicappedSpot.isFree()){
            stringBuilder.append("Free Handicapped: "+ handicappedSpot.getNumber());
        }else{
            stringBuilder.append("Handicapped spot is full");
        }
        stringBuilder.append(System.lineSeparator());

        // to do for other types

        log.info(stringBuilder.toString());
    }


}
