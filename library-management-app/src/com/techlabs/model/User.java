package com.techlabs.model;

public class User {
    private String name;
    private String userId;
    private Borrowable borrowingService;

    public User(String name, String userId, Borrowable borrowingService) {
        this.name = name;
        this.userId = userId;
        this.borrowingService = borrowingService;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public void registerUser() {
        System.out.println("Registering user: " + name+".");
    }

    public void borrowBook(Book book) {
        borrowingService.borrowBook(this);
        book.borrowBook(this);
    }

    public void returnBook(Book book) {
        borrowingService.returnBook(this);
        book.returnBook(this);
    }
}
