package com.yedam.stream;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(//
				new Student("Hong", 90)//
				, new Student("Hwang", 92)//
		);
//		Stream<Student> stream = list.stream();
		list.stream().forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + ", " + score);
		});
	}
}
