<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.yedam.dev.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String bNo = request.getParameter("boardNo");
		EmpDAO dao = new EmpDAO();
		Board b = dao.getBoad(Integer.parseInt(bNo)); // 35 : "35" <- String
	%>
	<h1><a href="getBoardList.html">Board List</a></h1>
	<table border=1>
		<tr><td>BoardNo</td><td><%= bNo %></td></tr>
		<tr><td>Content</td><td><%= b.getContent() %></td></tr>
		<tr><td>Writer</td><td><%= b.getWriter() %></td></tr>
		<tr><td>CreateDate</td><td><%= b.getCreateDate() %></td></tr>
	</table>
</body>
</html>