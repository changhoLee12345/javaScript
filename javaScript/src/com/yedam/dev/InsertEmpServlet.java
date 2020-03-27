package com.yedam.dev;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertEmpServlet")
public class InsertEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertEmpServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String fName = request.getParameter("firstname");
		String lName = request.getParameter("lastname");
		System.out.println("fname: " + fName + ", lname: " + lName);
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String jobid = request.getParameter("jobid");
		System.out.println("lastname:" + lastname
				+ ",email: " + email
				+ ",jobid: " + jobid);
		// 데이터베이스 입력처리 
		Employee emp = new Employee();
		emp.setLastName(lastname);
		emp.setEmail(email);
		emp.setJobId(jobid);
		
		EmpDAO dao = new EmpDAO();
		dao.insertEmp(emp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
