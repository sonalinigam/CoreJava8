package com.practise.hackerearth;

public class Rev {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		rev(arr);
	}
	
	private static void rev(int[] arr) {
		for(int a: arr) {
			System.out.print(a);
		}
		System.out.println();
		for(int i=0; i <arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length -1 -i];
			arr[arr.length -1-i] = temp;
		}
		for(int a: arr) {
			System.out.print(a);
		}
	}

}
