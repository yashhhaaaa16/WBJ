<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

	int n1 = Integer.parseInt(request.getParameter("txtNum1"));
	int n2 = Integer.parseInt(request.getParameter("txtNum2"));
	
	
	int c = n1/n2;
	
	out.write("Division :"+c);
	out.println();
	out.write("Charcter Encoding : "+request.getCharacterEncoding());
	out.println();
	out.write("Content Length : "+request.getContentLength());
	out.println();
	out.write("Locale address : "+request.getLocalAddr());
	out.println();
	out.write("Locale Name : "+request.getLocalName());
	out.println();
	out.write("Locale : "+request.getLocale());
	out.println();
	out.write("Protcol : "+request.getProtocol());
	out.println();
	out.write("Request URI : "+request.getRequestURI());
	out.println();
	out.write("Server Nme : "+request.getServerName());
	out.println();
	out.write("Server Port : "+request.getServerPort());
	out.println();
	out.print("isSecure : "+request.isSecure());
%>
</body>
</html>