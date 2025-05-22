<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

	int num = Integer.parseInt(request.getParameter("txtNum"));
int fact = 1;
for (int i = num; i>0; i--)
{
	fact = fact*i;
 } %>
 
 Factorial : <%= fact %>
</body>
</html>