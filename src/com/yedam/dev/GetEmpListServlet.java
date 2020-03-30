package com.yedam.dev;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetEmpListServlet")
public class GetEmpListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetEmpListServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath()).append("LCH");
		EmpDAO dao = new EmpDAO();
		List<Employee> empList = dao.getEmpList();
//		[{"id":1,first_name":"Ximenez","last_name":"Naisby","email":"xnaisby0@businessweek.com","gender":"Male","ip_address":"105.81.114.212"},
//		 {"id":10,"first_name":"Clerkclaude","last_name":"Bruhnke","email":"cbruhnke9@dropbox.com","gender":"Male","ip_address":"154.95.102.172"}
//		 ]
		// {"empId":101,"firstName":"scott","lastName":"tiger"}
		String empJson = "[";
		int rCnt = 0;
		int totalCnt = empList.size();
		for (Employee e : empList) {
			empJson += "{\"empId\":" + e.getEmployeeId() //
					+ ",\"firstName\":\"" + e.getFirstName() //
					+ "\",\"lastName\":\"" + e.getLastName() //이메일,급여.
					+ "\"}"; //
			if (++rCnt != totalCnt)
				empJson += ",";
		}
		empJson += "]";
		PrintWriter out = response.getWriter();
		out.print(empJson.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
