<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:forward page="next.jsp">

<jsp:param value="3306" name="port"/>
<jsp:param value="${param.txtPassword }" name="pwd"/>


</jsp:forward>
</body>
</html>