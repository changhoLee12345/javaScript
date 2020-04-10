package com.yedam.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArr);
		int sum = intStream.filter(n -> n % 2 == 1) // test() 2,4
		         .peek(s -> System.out.println(s))
		         .sum();
		System.out.println("결과값: " + sum);
		
		intStream = Arrays.stream(intArr);
		int sum1 = intStream.filter(n -> n % 2 == 1)
		         .sum();
	}
}
