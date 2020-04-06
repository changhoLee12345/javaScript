package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {
	static List<Student> list = Arrays.asList(//
			new Student("홍길동", 90, 96), //
			new Student("신용권", 95, 93));

	public static void printString(Function<Student, String> func) {
		for (Student student : list) {
			String str = func.apply(student);
			System.out.println("반환값: " + str.toString());
		}
	}

	public static void printInt(ToIntFunction<Student> func) {
		for (Student student : list) {
			int result = func.applyAsInt(student);
			System.out.println("결과값은: " + result);
		}
	}

	public static double avg(ToIntFunction<Student> func) {
		double avg = 0;
		int sum = 0;
		for (Student student : list) {
			sum += func.applyAsInt(student);
		}
		avg = (double) sum / list.size();
		return avg;
	}

	public static void main(String[] args) {

		System.out.println("[학생이름]");
		printString(t -> t.getName());
		System.out.println("[영어성적]");
		printInt((s) -> {
			return s.getEnglishScore(); // int
		});

		double avg = avg(s -> s.getEnglishScore());
		System.out.println("영어평균: " + avg);

		avg = avg(s -> s.getMathScore()); // ToIntFunction을 구현하는 익명객체
		System.out.println("수학평균: " + avg);
	}
}

// ToIntFunction<Student> 를 구현하는 MathIntClass 정의..
class MathIntClass implements ToIntFunction<Student> {
	@Override
	public int applyAsInt(Student value) {
		return value.getMathScore();
	}
}
