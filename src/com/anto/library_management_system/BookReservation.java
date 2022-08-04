package com.anto.library_management_system;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookReservation {
    private String memberId;
    private String bookItemBarcode;
    private ReservationStatus reservationStatus;
    private LocalDateTime createdDate;

    public static BookReservation fetchReservationDetails(String barcode){
        // to be written
        return null;
    };

    public void sendNotification(){

    };
}
