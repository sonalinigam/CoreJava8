/**
 * 
 */
package com.practise.hackerearth;

import java.util.Scanner;

/**
 * @author sonali
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter limit for Fibonacci Series:");
		Integer input = scan.nextInt();
		int sum =0;
		System.out.println("Series is: ");
		for(int i = 1; i <=input;i++) {
			if(i == 1 || i == 2) {
				sum = 1;
				System.out.print(sum + " ");
			} else if(i<=input) {
				sum += i;
				System.out.print(sum + " ");
			}
		}
	}

}
