<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator form</title>
</head>
<body>

	<c:if test="${not empty param['greeting'] }">
		<h2>${param['greeting'] }</h2>
	</c:if>

	<c:if test="${not empty formProcessed }">
		<h2>${formProcessed }</h2>
	</c:if>
	<spring:url value="/form" var="url"></spring:url>
	
	<form:form action="${url}" method="POST" modelAttribute="calculator">
		<fieldset>
				<legend>Calculator</legend>
				<form:input path="add1" type="text" size="2"/>+
				<form:input path="add2" type="text"  size="2"/>=
				<form:input path="sum" type="text"  size="2"/><br><br>
				<form:errors path="add*"></form:errors></br>
				<form:input path="mult1" type="text"  size="2"/>+
				<form:input path="mult2" type="text"  size="2"/>=
				<form:input path="product" type="text"  size="2"/><br><br>
				<form:errors path="mult*"></form:errors>
				
				<form:button type="submit"> Calculate</form:button>
				
		</fieldset>
	
	</form:form>	
</body>
</html>