<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index.html</title>
</head>
<body>

	<h1>Show all Names</h1>
	<form action=Name method='get'>
		<input type=submit value='Show Names'>
	</form>

	<c:forEach items="${personList}" var="p">
		<p>key : ${ p.getKey()}</p>
		<p>first name : ${ p.getFirstName()}</p>
		<p>last name : ${ p.getLastName() }</p>
		<br>
	</c:forEach>

	<h1>Add a Name</h1>
	<form action=AddName method='get'>
		Key=<input type=text name=key> <br> First Name=<input
			type=text name=firstName> <br> Last Name=<input
			type=text name=lastName> <input type=submit value='Add'>
	</form>
	<br>
	<h1>Remove a Name</h1>
	<form action=RemoveName method='get'>
		Key=<input type=text name=key> <br> <input type=submit
			value='Remove'>
	</form>
</body>
</html>