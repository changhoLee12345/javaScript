package study;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Employee> list = ScannerExample.getEmpList();
		JSONObject obj = new JSONObject();
		JSONArray ary = new JSONArray();
		for (Employee emp : list) {
			obj.put("firstName", emp.getFirstName());
			obj.put("salary", emp.getSalary());
			ary.add(obj);
		}
		PrintWriter out = response.getWriter();
		out.print(ary.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
