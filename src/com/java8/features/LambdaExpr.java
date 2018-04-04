/**
 * 
 */
package com.java8.features;

import java.io.File;
import java.io.FileFilter;

/**
 * @author sonali
 *
 */
public class LambdaExpr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FileFilter filterLambda = (File pathName) -> pathName.getName().endsWith(".PDF");
		
		File dir = new File("/Users/sonali/Desktop");
		File[] files = dir.listFiles(filterLambda);
		
		for (File file : files) {
			System.out.println("Files: " + file);
		}
	}

}
