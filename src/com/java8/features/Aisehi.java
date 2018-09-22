package com.java8.features;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Aisehi {

	public static void main(String[] args) {
		Map<String, Integer> hMap = new HashMap<>();
		Set<String> mySet = new HashSet<>();
		
		hMap.put(null, 1);
		hMap.put(null, 2);
		System.out.println("hmap.get ....." +hMap.get(null));
	}

}
