package com.java8.features;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatmapUsage {

	public static void main(String[] args) {
		Stream<List<Integer>> data = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5), Arrays.asList(6, 7, 8, 9));
		data.flatMap(Collection::stream).forEach(System.out::println);;
	}

}
