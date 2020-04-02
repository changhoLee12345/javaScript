package com.yedam.study;

public class ParentExample {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.name = "hong";
		showInfo(new Parent() {
			int age;

			int getAge() {
				return age;
			}

			@Override
			String getName() {
				super.setName("Hwang");
				return super.getName();
			}
		});
		getEmp(new EmpService() {
			@Override
			public void getEmployee(int empId) {
				System.out.println("empId: " + empId);
			}
		});
		
		showInfo(new Parent());
	}

	static void getEmp(EmpService emp) {
		emp.getEmployee(101);
	};

	static void showInfo(Parent p) {
		System.out.println(p.getName());
	}
}
