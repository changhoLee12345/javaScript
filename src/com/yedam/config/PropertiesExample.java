package com.yedam.config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Stream;

class Department {
	private int departmentId;
	private String departmentName;

	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}
} // end of Department

public class PropertiesExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		System.out.println(path);
		path = URLDecoder.decode(path, "UTF-8");
		properties.load(new FileReader(path));

		String url = properties.getProperty("url");
		String driver = properties.getProperty("driver");
		String user = properties.getProperty("user");
		String pass = properties.getProperty("passwd");

		System.out.println("url: " + url + "\n driver: " + driver + "\n user: " + user + "\n pass: " + pass);
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			System.out.println("정상적인 드라이버가 아닙니다.");
		} catch (SQLException e) {
			System.out.println("접속정보를 확인하세요.");
		}
		List<Department> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("select department_id, department_name from departments");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new Department(rs.getInt("department_id"), //
						rs.getString("department_name")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Stream<Department> stream = list.stream();
		stream.forEach((s) -> System.out.println(s.getDepartmentId()//
				+ "," + s.getDepartmentName()));
	}
}
