package com.java.basics;
import java.util.HashMap;

public class Executor {

	HashMap<String, String> myMap = new HashMap<>();
	public static void main(String[] args) {
		ImmutableClass iC = new ImmutableClass("Sonali");
		System.out.println("@@"+iC.toString());
	}
	
		
}
