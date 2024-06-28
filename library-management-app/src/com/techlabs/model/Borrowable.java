package com.techlabs.model;

public interface Borrowable {
	void borrowBook(User user);
    void returnBook(User user);
}
