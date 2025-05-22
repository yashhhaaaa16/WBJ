<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"  uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
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
<th>Status</th>
</tr>
<c:forEach var="temp" items="${list }">
<tr>
<td>${temp.firstname }</td>
<td>${temp.lastname }</td>
<td>${temp.email }</td>
<c:if test="${not temp.status }">
<td> ------</td>
</c:if>
<c:if test="${temp.status }">
<td>${temp.status }</td>
</c:if>
</tr>
</c:forEach>




</table>
</body>
</html>