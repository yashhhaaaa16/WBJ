<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.app.bean.*,com.app.dao.*"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int id = Integer.parseInt(request.getParameter("id"));
	Books b = BooksDAO.getBookId(id);
	%>
	<h1>Edit Books</h1>
	<hr>
	<form action="editBOOK.jsp" method="post">
		<input type="hidden" name="id" value="<%=b.getId()%>">
		<table>
			<tr>
				<td>Book Name:</td>
				<td><input type="text" name="bookName" value="<%=b.getBookName()%>"></td>
			</tr>
			<tr>
				<td>Author Name:</td>
				<td><input type="text" name="authorName"
					value="<%=b.getAuthorName()%>"></td>
			</tr>
			<tr>
				<td>Language :</td>
				<td><input type="text" name="language"
					value="<%=b.getLanguage()%>"></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><input type="text" name="price"
					value="<%=b.getPrice()%>"></td>
			</tr>

			<tr>
				<td>Published Year :</td>
				<td><input type="text" name="publishedYear"
					value="<%=b.getPublishedYear()%>"></td>
			</tr>
			<tr>
				<td></td>		
				<td><input type="submit" value="Edit"></td>
			</tr>

		</table>
	</form>
</body>
</html>