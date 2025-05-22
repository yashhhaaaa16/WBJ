<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.app.bean.Customer" %>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
    <%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<% 
	List<Customer> l = new ArrayList<Customer> ();
	l.add(new Customer("Rahul", "Pawar", "rahul@gmail.com", true));
	l.add(new Customer("Amit", "Sharma", "amit@gmail.com", true));
	l.add(new Customer("Priya", "Verma", "priya@gmail.com", false));
	l.add(new Customer("Vikram", "Desai", "vikram@gmail.com", true));
	l.add(new Customer("Neha", "Patil", "neha@gmail.com", false));
	l.add(new Customer("Arjun", "Mehta", "arjun@gmail.com", true));
	pageContext.setAttribute("listCustomer",l);
%>

</head>
<body>

<table border="2">
<tr>
<th>First Name</th>
<th>Last Name</th>
</tr>
<c:forEach var="temp" items="${listCustomer }" >

<tr>
<td>${fn:toUpperCase(temp.firstname) }</td>
<td>${fn:toUpperCase(temp.lastname) }</td>
</tr>


</c:forEach>

</table>


</body>
</html>