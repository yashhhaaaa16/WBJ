<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="next.jsp" method="post" >
		<table border="1">

			<tr>
				<td>Enter First Name :</td>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<td>Enter Last Name  :</td>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<td>Enter Email id  :</td>
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