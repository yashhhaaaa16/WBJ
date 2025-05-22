<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<hr>
<form action="addStudent.jsp" method="post">

<table>
<tr>
<td>Enter First Name : </td>
<td><input type="text" name="firstName"></td>
</tr>

<tr>
<td>Enter Last Name : </td>
<td><input type="text" name="lastName"></td>
</tr>

<tr>
<td>Enter Email Id : </td>
<td><input type="email" name="email"></td>
</tr>


<tr>
<td></td>
<td><input type="submit" value="Submit"></td>
</tr>
</table>
</form>
</body>
</html>