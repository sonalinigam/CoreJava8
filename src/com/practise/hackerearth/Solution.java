package com.practise.hackerearth;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,4,-1,3,2};
		List<Integer> newList = new ArrayList<Integer>();
        int k=0;
        for(int i = 0; i<arr.length-1; i++) {
        		newList.add(arr[k]);
        		k=arr[k];
        		
        }
        //System.out.println(newList(arr, newList));

    }

    @SuppressWarnings("unused")
	private static List<Integer> newList(int[] arr, List <Integer> newList) {
    	int i=0;
        		while(arr[i] != -1) {
        			newList.add(arr[i]);
                int newIndex = newList.get(i);
                i = newIndex;
                System.out.println("New index is : " + newList);
         }
        return newList;
    }
}
