package com.yedam.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	Connection conn = null;

	public EmpDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "hr";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("정상적으로 연결되었습니다.");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("연결중 에러가 발생했습니다.");
			e.printStackTrace();
		}
	}

	public Student getStudent(int sid) {
		String sql = "select first_name, salary, email from emp where employee_id=?";
		Student s = null;
		PreparedStatement psmt;
		try {
			psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {
				s = new Student(rs.getString("first_name"), rs.getInt("salary"), rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;
	}

	public List<Student> getEmpList() {
		// firstName=>name, salary=age, email=>school
		String sql = "select first_name, salary, email from emp";
		List<Student> list = new ArrayList<>();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Student s1 = new Student(rs.getString("first_name"), //
						rs.getInt("salary"), rs.getString("email"));
				list.add(s1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
