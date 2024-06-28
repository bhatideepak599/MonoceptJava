package com.techlabs.test;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionTest {

	public static void main(String[] args) {
		
		Function<Integer,Integer> function= (arg1)->{
			return 2*arg1;
		};
		BiFunction<Integer,Integer,Double> binaryFunction= (arg1,arg2)->{
			return Double.valueOf(arg1+arg2);
		};
		
		UnaryOperator<Integer> unaryOperator=(number1)->{
			return ++number1;
		};
		BinaryOperator<Integer> binaryOperator= FunctionTest::add;
		
//		System.out.println(function.apply(100));
		System.out.println(binaryFunction.apply(10,20));
//		System.out.println(unaryOperator.apply(10));
		System.out.println(binaryOperator.apply(20,30));

	}
	
	public static Integer add(Integer a,Integer b) {
			return a+b;
}
}
