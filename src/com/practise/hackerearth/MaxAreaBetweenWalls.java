/**
 * 
 */
package com.practise.hackerearth;

import java.util.Scanner;

/**
 * @author sonali
 *
 */
public class MaxAreaBetweenWalls {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0; i<t; i++) {
			int lengthOfInputArr = in.nextInt();
			int arr[] = new int[lengthOfInputArr];
			for(int j=0; j<lengthOfInputArr; j++) {
				arr[j] = in.nextInt();
			}
			System.out.println("Max are between 2 walls: " +calculateMaxArea(arr));
		}
		in.close();
	}

	private static int calculateMaxArea(int[] arr) {
		int left = 0;
		int right = arr.length-1;
		int maxArea = 0;
		while(left<right) {
			maxArea = Math.max(maxArea, Math.min(arr[left], arr[right])*(right-left-1));
			if(arr[left]<arr[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}

}
