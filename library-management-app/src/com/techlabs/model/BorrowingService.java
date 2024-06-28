package com.techlabs.model;

public class BorrowingService implements Borrowable{
	@Override
    public void borrowBook(User user) {
        
        System.out.println(user.getName() + " borrowed a book.");
    }

    @Override
    public void returnBook(User user) {
        
        System.out.println(user.getName() + " returned a book.");
    }
}
