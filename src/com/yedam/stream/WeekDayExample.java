package com.yedam.stream;

public class WeekDayExample {
	public static void main(String[] args) {
		WeekDay today = WeekDay.MONDAY;
		WeekDay yday = WeekDay.TUESDAY;
		System.out.println(today);
		if(today == WeekDay.TUESDAY) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	}
}
