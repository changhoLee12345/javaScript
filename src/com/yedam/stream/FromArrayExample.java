package com.yedam.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strArr = { "Hong", "Hwang", "Choi" };
		Stream<String> strStream = Arrays.stream(strArr);
		int[] intArr = { 3, 4, 5, 6, 2 };
		IntStream intStream = Arrays.stream(intArr);

		strStream.forEach(s -> System.out.println(s));
		intStream.forEach(i -> System.out.println(i));
		System.out.println("======================");
		IntStream rangeStream = IntStream.rangeClosed(1, 10);
		rangeStream.forEach(r -> System.out.println(r));
	}
}
