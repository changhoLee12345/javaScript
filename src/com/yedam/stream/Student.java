package com.yedam.stream;

public class Student {

	public enum Gender {
		MALE, FEMALE
	}

	public enum City {
		Seoul, Busan
	}

	String name;
	int score;
	Gender gender; // MALE, FEMALE
	City city; // Seoul, Busan

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public Student(String name, int score, Gender gender) {
		super();
		this.name = name;
		this.score = score;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Gender getGender() {
		return gender;
	}

	public City getCity() {
		return city;
	}

}
