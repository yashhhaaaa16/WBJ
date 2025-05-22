<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="todo-demo.jsp">
Add new Item : <input type="text" name="theItem">
<input type="submit" value="SUBMIT">

<%
	List<String> items = (List<String>)session.getAttribute("myToDoList");

	if(items == null)
	{
		items = new ArrayList<String> ();
		session.setAttribute("myToDoList", items);
	}
	
	String theItem =request.getParameter("theItem");
	if(theItem != "" && theItem != null)
	{
		items.add(theItem);
	}
%>
<br>
<hr><hr>
<b>To List Items : </b><br>
<ol>
<% 
	for(String temp : items)
	{
		out.println("<li>"+temp+"</li>");
	}
%>

</ol>
</form>

</body>
</html>