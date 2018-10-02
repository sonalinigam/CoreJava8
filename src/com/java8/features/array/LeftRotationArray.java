package com.java8.features.array;

public class LeftRotationArray {

	public static void main(String[] args) {
		int[]a = {1,2,3,4,5};
		int d = 2;
		int[] newArr = new int[a.length];
        int newIndex= 0;
        for(int i = 0; i<a.length; i++){
            newIndex = i + d;
            if(newIndex >= a.length) {
            		newIndex = Math.floorMod(newIndex, d);
            }
            newArr[i] = a[newIndex];
            System.out.print(newArr[i] + " ");
        }

	}

}
