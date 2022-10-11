<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Referral List</title>
</head>
<body>
	<div align="center">
		<table border="1" cellpadding="4">
			<caption>
				<h3>List of Referrals</h3>
			</caption>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Age</th>
			</tr>
			<c:forEach var="user" items="${list}">
			<%String name=(String)request.getAttribute("name"); %>
			<h1>
			<%=name %></h1>
				<tr>
					<td><c:out value="${user.id}" /></td>
					<td><c:out value="${user.name}" /></td>
					<td><c:out value="${user.age}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>