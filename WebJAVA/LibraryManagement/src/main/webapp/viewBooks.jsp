<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, com.app.dao.*, com.app.bean.*" %>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="bookForm.html">Home</a>|
<h1>Books</h1>
<hr>

<%
	List<Books> list = BooksDAO.getAllBooks();
	request.setAttribute("list", list);
%>

<table border="1">
<tr>
<th>ID</th>
<th>Book Name</th>
<th>Author Name</th>
<th>Language</th>
<th>Price</th>
<th>Published Year</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach var="b" items="${list }">
<tr>
<td>${b.getId()}</td>
<td>${b.getBookName()}</td>
<td>${b.getAuthorName()}</td>
<td>${b.getLanguage()}</td>
<td>${b.getPrice() }</td>
<td>${b.getPublishedYear() }</td>
<td><a href="editBooks.jsp?id=${b.getId()}">Edit</a></td>
<td><a href="deleteBook.jsp?id=${b.getId()}">Delete</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>