package com.yedam.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class ReductionExample {
	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(new Student("Hong", 92), 
				      new Student("Hwang", 95),
				      new Student("Park", 88));
		// Student.getScore(int) sum() 집계결과를 가져옴.
		int sum = list.stream().mapToInt(s->s.getScore()).sum();
		
		// Student.getScore(int) reduce()
		OptionalInt oi = list.stream()
				         .mapToInt(s -> s.getScore())
				         .filter(n -> n>90)
				         .reduce((a,b) -> a+b);
		if(oi.isPresent()) {
			System.out.println(oi.getAsInt());
		}else {
			System.out.println("요소가 없습니다.");
		}
		
		// Student.getScore(int) reduce(0, 결과값)
		int result = list.stream()
			        .mapToInt(s->s.getScore())
			        .reduce(0, (a,b) -> a+b);
		System.out.println(result);
	}
}
