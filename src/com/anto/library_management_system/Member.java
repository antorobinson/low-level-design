package com.anto.library_management_system;

import lombok.Data;
import lombok.extern.log4j.Log4j;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Log4j
public class Member extends Account{
    private LocalDate dateOfMembership;
    private int totalBooksCheckedOut;

//    public boolean resreveBookItem(BookItem bookItem);

    public boolean checkoutBookItem(BookItem bookItem){
        if(getTotalBooksCheckedOut() >= Constants.MAXIMUM_BOOKS_ISSUED_TO_USER){
            log.error("The user has checked out maximum number of book already");
            return false;
        }
        BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarCode());
        if(bookReservation != null && !bookReservation.getMemberId().equals(this.getId())){
            log.error("The book is reserved by another user");
            return false;
        }else if (bookReservation != null){
            bookReservation.setReservationStatus(ReservationStatus.COMPLETED);
        }
        if(!bookItem.checkout(this.getId()))
            return false;
        this.setTotalBooksCheckedOut(this.getTotalBooksCheckedOut()+1);
        return true;
    }

    public void returnBookItem(BookItem bookItem){
        this.checkForFine(bookItem.getBarCode());
        BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarCode());
        if(bookReservation != null ){
            bookItem.setStatus(BookStatus.RESERVED);
            bookReservation.sendNotification();
        }else{
            bookItem.setStatus(BookStatus.AVAILABLE);
        }
        this.setTotalBooksCheckedOut(this.getTotalBooksCheckedOut()-1);
    };

    private void checkForFine(String barcode){
        BookLending bookLending = BookLending.fetchLendingDetails(barcode);

        LocalDateTime dueDate = bookLending.getDueDate();
        LocalDateTime today = LocalDateTime.now();

        if(today.compareTo(dueDate) > 0){
            long diff = today.getDayOfYear() - dueDate.getDayOfYear();
            Fine.collectFine(this.getId(), diff);
        }
    }

    public boolean renewBookItem(BookItem bookItem){
        checkForFine(bookItem.getBarCode());
        BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarCode());
        if(bookReservation != null && bookReservation.getMemberId() != this.getId()){
            log.error("The book item is reserved by another member");
            bookItem.setStatus(BookStatus.RESERVED);
            this.setTotalBooksCheckedOut(this.getTotalBooksCheckedOut()-1);
            bookReservation.sendNotification();
            return false;
        }else if(bookReservation != null){
            bookReservation.setReservationStatus(ReservationStatus.COMPLETED);
        }
        bookItem.setDueDate(LocalDateTime.now().plusDays(Constants.MAXIMUM_LEND_DAYS));
        BookLending.lendBook(bookItem.getBarCode(), this.getId());
        return true;
    }

}
