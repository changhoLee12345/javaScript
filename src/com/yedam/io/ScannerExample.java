package com.yedam.io;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Name 입력하세요:");
		String name = scn.nextLine();
		System.out.println("나이 입력하세요.");
		int age = scn.nextInt();
		System.out.println("키를 입력하세요.");
		double height = scn.nextDouble();

		System.out.println(name + ", " + age + ", " + height);
		scn.close();
	}
}
