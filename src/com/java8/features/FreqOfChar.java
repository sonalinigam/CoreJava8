package com.java8.features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FreqOfChar {

	public static void main(String[] args) {

//		int num = 630;
//		String numbers = String.valueOf(num);
//		numbers.
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(30);
		list.add(4);
		list.add(40);
		list.add(60);

		List<Integer> ll = new ArrayList<>();
		ll.add(list.get(0));
		for(int i=1; i<list.size();i++) {
			//System.out.println(list.get(i-1));
			System.out.println(list.get(i) );
			//System.out.println(list.get(i+1));
			
			if( list.get(i) > list.get(i-1) ) {
				ll.add(list.get(i));
			}
			
			System.out.println("-----------");
		}
        System.out.println(ll);
	}
}
