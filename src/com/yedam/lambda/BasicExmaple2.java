package com.yedam.lambda;

import java.util.function.Consumer;

@FunctionalInterface
interface MyInterface1<T> {
	void get(T t);
}

@FunctionalInterface
interface MyInterface2 {
	String get(String str, String str1);
}

class Students {
	String name;
	int age;
	Students(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void getInfo() {
		System.out.println("이름: " + this.name + ", 나이: " + this.age);
	}
}

public class BasicExmaple2 {
	public static void main(String[] args) {
//		Consumer<String> conString = new ConsumerClsses<String>();
//		conString.accept("Hello");

		Consumer<Students> conStudents = (t) -> {
			t.getInfo();
		};
		Students s1 = new Students("Hong", 20);
		conStudents.accept(s1);
	}
}
