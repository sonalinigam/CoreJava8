package com.java8.features;

import java.util.HashMap;
import java.util.Map;

public class AlphabeticalDuplicate {

	public static void main(String[] args) {
		String s = "abcAb";
		Map<Character, Integer> map = new HashMap<>();
		char[] arr = s.toCharArray();
		for (Character c : arr) {
			if (map.containsKey(c)) {
				System.out.println(c);
				break;
			} else {
				map.put(c, 1);
			}
		}
	}
}