package com.yedam.lambda;

import java.util.Scanner;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSup = () -> {// getAsInt()
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		int result = intSup.getAsInt();
		System.out.println(result);
		
		BooleanSupplier boolSup = () -> { // getAsBoolean()
			Scanner scn = new Scanner(System.in);
			System.out.println("값을 입력하세요: >");
			int inputValue = scn.nextInt();
			int num = (int) (Math.random() * 3) + 1;
			if(inputValue == num)
				return true;
			else
				return false;
		};
		if(boolSup.getAsBoolean()) {
			System.out.println("같습니다.");
		}else{
			System.out.println("다릅니다.");
		};
	}
}
