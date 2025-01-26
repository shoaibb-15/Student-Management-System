<%@page import="com.jsp.spring.studentdb.entity.Student"%>
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
<% Student student=(Student) request.getAttribute("studentObject");   %>
<h1>Enter the details to be updated</h1>
<form action="update-student" method="post" >
<h2><input type="number" value="<%= student.getStudentId() %>" name="studentId" readonly="readonly"></h2><br>
<h2><input type="text" value="<%= student.getStudentName() %>" name="studentName"></h2><br>
<h2><input type="text" value="<%= student.getEmail() %>"  name="email"></h2><br>
<h2><input type="number" value="<%= student.getAge() %>"  name="age"></h2><br>
<h2><input type="number" value="<%= student.getMarks()%>"  name="marks"></h2><br>
<h2><input type="submit" value="update"></h2>
</form>
</body>
</html>