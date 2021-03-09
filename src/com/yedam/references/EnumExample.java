package com.yedam.references;

enum Week {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumExample {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;

		String name = today.name();
		System.out.println(name);
	}
}
