package com.anto.parking_lot;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ParkingTicket {
    private String ticketNumber;
    private LocalDateTime issuedAt;
    private LocalDateTime payedAt;
    private double payedAmount;
    private ParkingTicketStatus parkingTicketStatus;
}
