package com.anto.library_management_system;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookLending {
    private String memberId;
    private String bookItemBarcode;
    private LocalDateTime issuedAt;
    private LocalDateTime dueDate;
    private LocalDateTime returnedDate;

    public static boolean lendBook(String barcode, String memberId){
        // to be written
        return true;
    };

    public static BookLending fetchLendingDetails(String barcode){
        // to be written
        return new BookLending();
    }
}
