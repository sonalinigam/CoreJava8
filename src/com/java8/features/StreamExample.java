/**
 * 
 */
package com.java8.features;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Streams hold no data and do not modify any data. The operations on a stream
 * are always lazy.
 * 
 * @author Rosebot
 *
 */
public class StreamExample {

	/**
	 * This is the main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Filtering Streams and using Predicates
		Stream<String> stream = Stream.of("Sonali", "Nigam", "Wankhade");

		Predicate<String> p1 = s -> s.contains("na");
		Predicate<String> p2 = s -> s.length() > 5;

		stream.filter(p1.or(p2)).forEach(System.out::println);
	}

}
