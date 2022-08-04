package com.anto.library_management_system;

import lombok.Data;
import lombok.extern.log4j.Log4j;

import java.time.LocalDateTime;
@Data
@Log4j
public class BookItem extends Book{
    private String barCode;
    private boolean referenceOnly;
    private double price;
    private LocalDateTime borrowed;
    private LocalDateTime dueDate;
    private BookFormat format;
    private BookStatus status;
    private LocalDateTime dateOfPurchase;
    private LocalDateTime publishedDate;
    private Rack rack;

    public boolean checkout(String memberId){
        if(this.referenceOnly){
            log.error("This book is reference only, can't be issued");
            return false;
        }
        if(!BookLending.lendBook(this.getBarCode(), memberId)){
            return false;
        };
        this.setStatus(BookStatus.LOANED);
        return true;
    }

}
