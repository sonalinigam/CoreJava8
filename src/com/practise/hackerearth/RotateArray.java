/**
 * 
 */
package com.practise.hackerearth;

import java.util.Arrays;

/**
 * @author sonali
 *
 */
public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		sqArr(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sqArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i] * arr[i];
		}
	}

}
