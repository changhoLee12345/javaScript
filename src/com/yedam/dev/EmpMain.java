package com.yedam.dev;

import java.util.List;

public class EmpMain {
	public static void main(String[] args) {
		EmpDAO e = new EmpDAO();
		List<Employee> elist = e.getEmpList();
		for (Employee emp : elist) {
			System.out.println(emp);
		}
	}
}
