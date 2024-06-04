package com.techlabs.model;

public class TestBoyMan {

	public static void main(String[] args) {
		Men men=new Men();
		Boy boy=new Boy();
		men.eat();
		men.play();
		men.work();
		
		boy.eat();
		boy.play();
		boy.work();
		
		Men men1=new Boy();
		men1.eat();
		men1.play();
		
		

	}

}
