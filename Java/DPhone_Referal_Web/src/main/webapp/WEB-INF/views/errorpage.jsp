<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
</head>
<body>
	
	<%
		String msg=(String)request.getAttribute("message");
	%>
	<h1><%=msg%>
		<br> <br>
		<jsp:include page="/WEB-INF/views/register.jsp"></jsp:include></h1>
</body>
</html>