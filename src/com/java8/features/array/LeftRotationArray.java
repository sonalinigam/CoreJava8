package com.java8.features.array;

public class LeftRotationArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int d = 2;
		int[] newArr = new int[a.length];
		int startIndex = 0;
		for(int i = d; i<a.length; i++) {
			newArr[startIndex] = a[i];
			startIndex++;
		}
		for(int j = 0; j<d; j++) {
			newArr[startIndex] = a[j];
			startIndex++;
		}
		for(int k =0; k<newArr.length; k++) {
			System.out.print(newArr[k] + " ");
		}
	}
}
