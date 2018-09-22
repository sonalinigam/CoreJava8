package com.java8.features;

public class LambdaExpr {
	public static void main(String[] args) {
		
		//Using Lambda
		Addable numbersToAdd = (a3, a4) -> a3+a4;
		System.out.println(numbersToAdd.sum(10, 20));
	}
}