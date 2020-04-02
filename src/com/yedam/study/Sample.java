package com.yedam.study; // com.yedam.study.Sample

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int minus(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();
		// 여러건 조회.
		List<Student> list = service.getStudList();
		for (Student s : list) {
			System.out.println(s.toString());
		}
		// 한건 조회.
		Student s1 = service.getStudent(101);
		System.out.println(s1.toString());
	}
}
