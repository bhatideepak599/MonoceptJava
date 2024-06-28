package com.techlabs.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		
		Consumer<Integer> consumer=(arg)-> {
			int ans=1;
			for(int i=1;i<=arg;i++) ans*=i;
			System.out.println("Factorial of "+arg+" is "+ans);
			
		};
		
		BiConsumer<Integer,Integer> biConsumer=(arg1,arg2)->System.out.println("Addition is :"+(arg1+arg2));
		consumer.accept(6);
		biConsumer.accept(6,12);
		
		BiConsumer<Integer,Integer> swap=(arg1,arg2)->{
			System.out.println("Before Swapping-> Number1 : "+arg1+", Number2 : "+arg2);
			arg1+=arg2;
			arg2=arg1-arg2;
			arg1-=arg2;
			System.out.println("After Swapping-> Number1 : "+arg1+", Number2 : "+arg2);
		};
		swap.accept(5, 10);

	}

}
