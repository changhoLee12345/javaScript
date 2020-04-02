package com.yedam.lambda;

//import java.awt.Toolkit;

public class BasicExmaple {
	public static void main(String[] args) {
//		RunnableCls rcs = ; // 신규작업 인스턴스.

		Thread thread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("beep()");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}); // 쓰레드 생성.
		thread.start(); // 신규쓰레드작업 시작.

		for (int i = 0; i < 10; i++) {
			System.out.println("print it.=> " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
