package com.yedam.enumpkg;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

enum Currency implements Runnable {

	DOLLAR(1100) {
		public void showCurrency() {
			System.out.println("dollar change rate is " + getValue());
		}

		@Override
		public void run() {
			System.out.println("run dollar!");
		}
	},
	EURO(1000) {
		public void showCurrency() {
			System.out.println("euro change rate is " + getValue());
		}
	},
	YEN(100) {
		public void showCurrency() {
			System.out.println("yen change rate is " + getValue());
		}
	},
	YUAN(150) {
		@Override
		public void showCurrency() {
			System.out.println("yuan change rate is " + getValue());
		}
	};

	int value;

	private Currency(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public void run() {
		System.out.println("run currency");
	}

	public abstract void showCurrency();

}

public class EnumClass {
	public static void main(String[] args) {
//		callCurrency();
//		LocalDateTime ldt = LocalDateTime.now();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		sdf.format(LocalDate.now());
	}

	public static void callCurrency() {
		Currency curr = Currency.DOLLAR;
		switch (curr) {
		case DOLLAR:
			curr.showCurrency();
			curr.run();
			break;
		case EURO:
			curr.showCurrency();
			curr.run();
			break;
		}
	}
}
