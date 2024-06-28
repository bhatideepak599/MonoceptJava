package com.techlabs.test;
import java.util.Scanner;

import com.techlabs.model.Book;
import com.techlabs.model.Borrowable;
import com.techlabs.model.BorrowingService;
import com.techlabs.model.User;


public class LibraryManegementTest {

	public static void main(String[] args) {
		Borrowable borrowingService = new BorrowingService();
		
		
		String userName = null,userId = null,bookName = null,bookAuthor = null;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter The Name of User: ");
		userName=scanner.next();
		System.out.print("Enter User ID : ");
		userId=scanner.next();
		
		System.out.print("Enter The Book Name: ");
		bookName=scanner.next();
		System.out.print("Enter The Book Author : ");
		bookAuthor=scanner.next();
		User user = new User(userName, userId, borrowingService);
        
        Book book=new Book(bookName,bookAuthor);
        user.registerUser(); 
        user.borrowBook(book);
        book.catalogBook();
        user.returnBook(book);

	}

}
