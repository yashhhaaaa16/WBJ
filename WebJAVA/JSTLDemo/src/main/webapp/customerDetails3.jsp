<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.app.bean.Customer"%>
    <%@ taglib prefix="c"  uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<%

	List<Customer> list = (List)request.getAttribute("list");
%>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
</tr>
<% 
	for(Customer c:list)
	{
%>
<tr>
<td><%= c.getFirstname() %></td>
<td><%= c.getLastname()%></td>
<td><%= c.getEmail() %></td>
</tr>
<%} %>
</table>

</body>
</html>