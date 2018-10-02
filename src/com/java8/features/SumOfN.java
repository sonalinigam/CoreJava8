package com.java8.features;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int limit = in.nextInt();
		 int sum = 0;
		 if(limit<0) throw new IllegalArgumentException();
		 for(int i = 1; i <= limit; i++) {
			 sum+=i;
		 }
		 System.out.println("Sum: " + sum);

	}

}
