/**
 * 
 */
package com.practise.hackerearth;

import java.util.Scanner;

/**
 * @author sonali
 *
 */
public class SeriesCreation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		if (q <= 500) {
			for (int i = 0; i < q; i++) {
				int a = in.nextInt();
				int b = in.nextInt();
				int n = in.nextInt();
				int equation = 0;
					for(int power = 0; power< n; power++) {
						equation+=(int) (Math.pow(2, power)*b);
						System.out.print( a + equation + " ");
					}
			}
		}
		in.close();
	}
}
