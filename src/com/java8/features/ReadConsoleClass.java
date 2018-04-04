package com.java8.features;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsoleClass {

	public static void main(String [] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string");
		String consoleInput = reader.readLine();
		reader.close();
		System.out.println("Input was : " + consoleInput);
	}
}
