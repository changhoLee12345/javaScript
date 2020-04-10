package com.yedam.stream;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList( //
				new Student("Hong", 10, Student.Gender.MALE), //
				new Student("Hwang", 9, Student.Gender.FEMALE), //
				new Student("Choi", 8, Student.Gender.MALE), //
				new Student("Park", 7, Student.Gender.FEMALE));
//		Collector<, >;
		list.stream().filter(s -> s.getGender() == Student.Gender.MALE) // filter
				.collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);

	}
}
