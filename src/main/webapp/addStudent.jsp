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
<h1>Add the Student Details</h1>
<form action="add-student" method="post">
<h2><input type="number" placeholder="Enter student Id" name="studentId"></h2><br>
<h2><input type="text" placeholder="Enter student Name" name="studentName"></h2><br>
<h2><input type="text" placeholder="Enter student email" name="email"></h2><br>
<h2><input type="number" placeholder="Enter student age" name="age"></h2><br>
<h2><input type="number" placeholder="Enter student marks" name="marks"></h2><br>
<h2><input type="submit" value="ADD"></h2>

</form>
</body>
</html>