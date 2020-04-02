package com.yedam.lambda;
interface MyInterface {
	void method(int a);
}
interface MyInterfaceReturn {
	int getResult(int a, int b);
}

public class BasicExpressExmaple {
	public static void main(String[] args) {
		// 익명객체...
		MyInterfaceReturn mir = new MyInterfaceReturn() {
			@Override
			public int getResult(int a, int b) {
				return a + b; // 재정의해야함....
			}
		};
		int result = mir.getResult(10, 20);
		
		// 람다표현식...
		mir = (num1, num2) -> {
			return num1 * num2;
		};
		result = mir.getResult(10, 20);
		
		System.out.println("result: " + result);
	}
}
