package com.yedam.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(//
				new Student("Hong", 90)//
				, new Student("Hwang", 92)//
				, new Student("Park", 92)//
		);
		double avg = list.stream()//
				.mapToInt((Student s) -> { // ToIntFunction
					return s.getScore();
				})//
				.average()//
				.getAsDouble();

		Stream<Student> stream = list.stream();
		IntStream intStream = stream.mapToInt((Student s) -> { // ToIntFunction
			return s.getScore();
		});
		OptionalDouble odbl = intStream.average();
		avg = odbl.getAsDouble();

		System.out.println(avg);
	}
}
