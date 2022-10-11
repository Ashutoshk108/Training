<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Referral Successful</title>
</head>
<body>
	<%
		String msg=(String)request.getAttribute("message");
		Integer id=(Integer)request.getAttribute("id1");
		String name=(String)request.getAttribute("name");
		String mobile=(String)request.getAttribute("mobile");
		Integer age=(Integer)request.getAttribute("age");
		Integer code=(Integer)request.getAttribute("code");

	%>
	<h2>
		<%=msg%>
	</h2>
	<br>
	<h2>Referral List</h2>
	<h2>
	<%=id%>
	<%=name%>
	<%=mobile%>
	<%=age%>
	<%=code%>
	</h2>
	
</body>
</html>