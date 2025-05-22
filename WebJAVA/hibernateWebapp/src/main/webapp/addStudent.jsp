<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.app.dao.StudentDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="s" class="com.app.entity.Student"></jsp:useBean>
<jsp:setProperty property="*" name="s"/>
<%
	int i = StudentDAO.saveStudent(s);
	if(i>0)
	{
		response.sendRedirect("success.jsp");
	}
	else
	{
		response.sendRedirect("error.jsp");
	}
%>
</body>
</html>