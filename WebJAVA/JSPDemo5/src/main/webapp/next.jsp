<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="s" class="com.app.bean.Student">
<jsp:setProperty property="*" name="s"/>
Student details : 
<br><br>
First Name : <jsp:getProperty property="firstName" name="s"/>
<br><br>
Last Name : <jsp:getProperty property="lastName" name="s"/>
<br><br>
Email : <jsp:getProperty property="email" name="s"/>
</jsp:useBean>
</body>
</html>