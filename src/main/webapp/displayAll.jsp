<%@page import="com.jsp.spring.studentdb.entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
	<%
	List<Student> slist = (List) request.getAttribute("studentList");
	%>

	<table border="">
		<tr>
			<th>StudentId</th>
			<th>StudentName</th>
			<th>Email</th>
			<th>Age</th>
			<th>Marks</th>
			<th>Update</th>
			<th>Delete</th>
			
		</tr>
		<%
		for (Student student : slist) {
		%>
		<tr>
			<td><%=student.getStudentId()%>
			</td>
			<td><%=student.getStudentName()%>
			</td>
			<td><%=student.getEmail()%>
			</td>
			<td><%=student.getAge()%>
			</td>
			<td><%=student.getMarks()%>
			</td>
			<td> <a href="find-by-id?studentId=<%=student.getStudentId() %>">Update</a></td>
			<td> <a href="delete-by-id?studentId=<%=student.getStudentId() %>">Delete</a></td>
		</tr>
		<%
		}
		%>


	</table>

	<h2>
		<a href="index.jsp">Return to HomePage</a>
	</h2>
</body>
</html>