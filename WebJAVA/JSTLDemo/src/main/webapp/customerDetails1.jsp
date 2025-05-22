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
<td>
<c:choose>
<c:when test="${temp.status }">
Gold
</c:when>
<c:otherwise>
-----
</c:otherwise>
</c:choose>

</c:forEach>




</table>

</body>
</html>