/**
 * 
 */
package com.practise.hackerearth;

/**
 * @author sonali
 *
 */
public class LargeSumOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long[] arr = {1000000001,1000000002,1000000003,1000000004,1000000005};
		long sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("Sum = " + sum);
	}

}
