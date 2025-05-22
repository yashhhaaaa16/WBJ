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

out.write(request.getParameter("txtUsername"));
out.write(request.getParameter("port"));
out.write(request.getParameter("pwd"));


%>

<%-- UserName  : ${param.uname }
<br>
Password : ${param.pwd } --%>
</body>
</html>