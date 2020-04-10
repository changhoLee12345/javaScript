package com.yedam.stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java8 lambda", "stream mapping");
		list.stream() // 반환형(return type) Stream<String>
				.flatMap(str -> Arrays.stream(str.split(" "))) // Stream<String>
				.forEach(s -> System.out.println(s.toString()));
	}
}
