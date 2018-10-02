package com.practise.hackerearth;

public class Anagrams {
	
	public static void main(String[] args) {
		String a = "cde";
		String b = "abc";
	        char[]  aString = a.toCharArray();
	        char[]  bString = b.toCharArray();
	        for(char charInA : aString) {
	        	int index = b.indexOf(charInA);
	        		if(index !=  -1) {
	        			b = b.substring(0,index) + b.substring(index + 1, b.length());
	        		}
	        }
	        for(char charInB : bString) {
	        	int index = a.indexOf(charInB);
	        		if(index !=  -1) {
	        			a = a.substring(0,index) + a.substring(index + 1, a.length());
	        		}
	        }
	        
	        System.out.println( b.length() + a.length());

	}

}
