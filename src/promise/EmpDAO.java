package promise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.dev.Employee;

import common.DAO;

public class EmpDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public List<Employee> getEmpListByDept(String dept) {
		conn = DAO.getConnection();
		List<Employee> employees = new ArrayList<>();
		String sql = "select * from employees where department_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));

				employees.add(emp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}

	public List<Employee> getEmpOverAverage(double avg) {

		return null;
	}
}
