package com.java.basics;

import java.util.ArrayList;
import java.util.List;

public class Testing {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Ram");
		myList.add("Shyam");
		myList.add("Geeta");
		System.out.println("Before "+myList);
		myList.removeIf(elem -> elem.equals("Geeta"));
		System.out.println("After "+myList);
	}

}
