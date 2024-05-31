package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Account;
import com.techlabs.model.AccountType;

public class ArrayOfAObjects {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Account accounts[]=new Account[4];
		
		for(int i=0;i<4;i++) {
			accounts[i]=new Account();
			System.out.println("Enter Account No:");
			accounts[i].setAccount_number(scanner.next());
			
			System.out.println("Enter Name :");
			accounts[i].setName(scanner.next());
			
			System.out.println("Enter Account type: For savings press 1 and for current press 2:");
			
			int accountType=scanner.nextInt();
			if(accountType==1)accounts[i].setAccount_type(AccountType.savings);
			if(accountType==2)accounts[i].setAccount_type(AccountType.current);
			
			System.out.println("Set Account Balance :");
			accounts[i].setBalance(scanner.nextDouble());
			}
		for(Account account: accounts) {
			System.out.println(account);
		}
	}

}
