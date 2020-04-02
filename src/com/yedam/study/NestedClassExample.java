package com.yedam.study;

public class NestedClassExample {
	public static void main(String[] args) {
		NestedClass nc = new NestedClass();
//		nc.method();
		NestedClass.InnerClass nic = nc.new InnerClass();
		nic.innerMethod();
	}
}
