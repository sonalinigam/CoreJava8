package com.java8.features.array;

public class LeftRotationArrayReshu {

	public static void main(String[] args) {
		int[] q = {1,2,3,4,5};
		int[] arr = rotLeft(q, 1);
		for(int i: arr) {
			System.out.println(i);
		}

	}

	static int[] rotLeft(int[] a, int d) {
		int[] newArr = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			
			if(i+d >a.length-1) {
				int k = (i+d)%a.length;
				newArr[i]= a[k];
			}
			newArr[i] = a[i+d];
			
		}
		return newArr;

	}
}
