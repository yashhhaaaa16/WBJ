<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, com.app.bean.*,com.app.dao.*" %>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="employeeForm.html">Home</a>|
<h1>Employees</h1>
<hr>
<%
	List<Employee> list = EmployeeDAO.getAllEmployees();
	request.setAttribute("list", list);
%>

<table border="1">
<tr>
<th>ID</th>
<th>NAME</th>
<th>PASSWORD</th>
<th>EMAIL</th>
<th>GENDER</th>
<th>COUNTRY</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>
<c:forEach var="e" items="${list }">
<tr>
<td>${e.getId()}</td>
<td>${e.getName()}</td>
<td>${e.getPassword()}</td>
<td>${e.getEmail()}</td>
<td>${e.getGender() }</td>
<td>${e.getCountry() }</td>
<td><a href="editEmployee.jsp?id=${e.getId()}">Edit</a></td>
<td><a href="deleteEmp.jsp?id=${e.getId()}">Delete</a></td>
</tr>
</c:forEach>

</table>

</body>
</html>