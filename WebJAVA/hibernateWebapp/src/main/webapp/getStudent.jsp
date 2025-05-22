<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.app.entity.Student, com.app.dao.StudentDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
  int id = Integer.parseInt(request.getParameter("id"));
	Student stud = StudentDAO.getStudentById(id);
	if(stud != null)
		out.print(stud);
	else
		out.print("Student Does Not Exists");
%>
</body>
</html>