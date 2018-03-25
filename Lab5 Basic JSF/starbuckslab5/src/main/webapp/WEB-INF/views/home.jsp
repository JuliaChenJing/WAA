<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Starbuckk's</title>
</head>
<body>


	<c:if test="${ empty user}">
		<form action="action/advice" method="get">
			<select name="roast" disabled="disabled">
				<option value="-">--Choose Roast--</option>
				<option value="dark">Dark</option>
				<option value="medium">Medium</option>
				<option value="light">Light</option>
			</select> <br /> <br /> <input type="submit" value="Submit"
				disabled="disabled" />
		</form>
		<div id='advice'></div>
	
		Login:
	<form:form action="login" method="post" modelAttribute="userForm">
		Name: <form:input type="text" path="name" size="9" />
			<br /> Password: <form:input type="password" path="password" size="9" />
			<br />
			<br />
			<form:button type="submit">Log in</form:button>
		</form:form>

	</c:if>
	
	<c:if test="${ not empty user}">
		<h2>Welcome ${user.name}  <a href='<spring:url value="/logout"></spring:url>'>Logout</a></h2>
	<h2>Ask for advice about your favorite roast:</h2>
		<form action='<spring:url value="/advicelist"></spring:url>'" method="get">
			<select name="roast" items="${items}">
				<option value="-">--Choose Roast--</option>
				<c:forEach var ="roast" items="${roasts}">
					<option value="${roast.value }">${roast.key}</option>
				</c:forEach>
			</select> <br /> <br /> <input type="submit" value="Submit" />
		</form>
		<div id='advice'></div>
	</c:if>


</body>
</html>