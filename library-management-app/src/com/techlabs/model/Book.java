package com.techlabs.model;

public class Book implements Catalogable, Borrowable {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    @Override
    public void catalogBook() {
        System.out.println("Cataloging book: " + title + " by " + author+".");
    }

    @Override
    public void borrowBook(User user) {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(user.getName() + " borrowed " + title+".");
            return;
        } 
          System.out.println(title + " is already borrowed.");
        
    }

    @Override
    public void returnBook(User user) {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(user.getName() + " returned " + title+".");
            return;
        } 
        
            System.out.println(title + " was not borrowed.");
        
    }
}
