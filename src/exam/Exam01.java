package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

class Employee implements Comparable<Employee> {
	String firstName;
	int salary;

	public Employee(String firstName, int salary) {
		super();
		this.firstName = firstName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employee o) {
		return this.firstName.compareTo(o.firstName);
	}
}

class EmpComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.firstName.compareTo(o2.firstName);
	}

}

public class Exam01 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		List<Employee> list = new Vector<>();
		String sql = "select * from employees";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new Employee(rs.getString("first_name"), rs.getInt("salary")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		list.stream().filter(s -> s.getSalary() >= 1000).sorted()
				.forEach(s -> System.out.println(s.getFirstName()));
	}
}
