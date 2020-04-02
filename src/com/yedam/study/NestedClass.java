package com.yedam.study;

public class NestedClass {
	class InnerClass {
		String innerStr;
		int innerInt;
		void innerMethod() {
			System.out.println("call innerMethod()");
		}
	}
	void method() {
		System.out.println("call method()");
		class LocalClass {
			String localStr;
			int localInt;
			void localMethod() {
				System.out.println("call localMethod()");
			}
		}
		LocalClass lc = new LocalClass();
		lc.localMethod();
	}
}
