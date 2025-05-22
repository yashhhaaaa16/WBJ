<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
    <%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<c:set var="theLocale" value="${not empty param.theLocale?param.theLocale:pageContent.request.locale }"></c:set>
<fmt:setLocale value="${theLocale }"/>
<fmt:setBundle basename="com.app.jsp.internationaliztion.i18n.resources.mylabels"/>
</head>
<body>
<a href="index.jsp?theLocale=en_US">English(US)</a>|
<a href="index.jsp?theLocale=es_ES">Spanish(ES)</a>|
<a href="index.jsp?theLocale=de_DE">German(DE)</a>|
<a href="index.jsp?theLocale=mr_IN">Marathi(IN)</a>|
<br>
<fmt:message key="label.greeting"></fmt:message><br>
<fmt:message key="label.firstname"></fmt:message><i>Yogesh</i><br>
<fmt:message key="label.lastname"></fmt:message><i>Bhapkar</i><br>
<fmt:message key="label.welcome"></fmt:message><br>
<br>
Selected Locale : <c:out value="${theLocale}"></c:out>
</body>
</html>