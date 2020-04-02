package com.yedam.study;

import java.util.List;

public class StudentServiceImpl implements StudentService {

	EmpDAO dao = new EmpDAO();

	@Override
	public List<Student> getStudList() {
		return dao.getEmpList();
	}

	@Override
	public Student getStudent(int id) {
		return dao.getStudent(id);
	}

}
