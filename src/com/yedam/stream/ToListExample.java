package com.yedam.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("Hong", 10, Student.Gender.MALE),
				new Student("Hwang", 9, Student.Gender.FEMALE),
				new Student("Choi", 8, Student.Gender.MALE),
				new Student("Park", 7, Student.Gender.FEMALE)
		);
		// collect(Collectors.toList()) -> List<Student>
		List<Student> maleStudent = list.stream()
				.filter(s -> s.getGender() == Student.Gender.MALE)
				.collect(Collectors.toList()); //Hong, Choi => List
		maleStudent.stream().forEach(s -> System.out.println(s.getName()));

		// collect(Collectors.toSet()) -> Set<Student>
		Set<Student> femaleSet = list.stream()
				.filter(s -> s.getGender() == Student.Gender.FEMALE)
				.collect(Collectors.toSet());
		femaleSet.stream().forEach(s -> System.out.println(s.getName()));
		
		// collect(Collectors.toCollection()) -> HashSet<Student>
		HashSet<Student> hashSet = list.stream()
				.filter(s -> s.getScore() >= 9)
				.collect(Collectors.toCollection(()->new HashSet<Student>())); // HashSet<Student>
		
	}
}
