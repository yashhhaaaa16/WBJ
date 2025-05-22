<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.app.dao.BooksDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="book" class="com.app.bean.Books" ></jsp:useBean>
<jsp:setProperty property="*" name="book"/>

<%
	int i = BooksDAO.saveBooks(book);
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