<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/mystyle.css">
<meta charset="ISO-8859-1">
</head>
<body>
<h3>${param["greeting"]}</h3>
<h4>Calculator Results</h4>

	<form action="calculator.do" method="get">
		<input name="add1" type="text" class="textBox" readonly  value="${calculator.add1}" />+
		<input name="add2" type="text" class="textBox" readonly value=<c:out value="${calculator.add2}"/>>=
	
 			<input name="sum" type="text" class="textBoxBlue" readonly value=<c:out value="${calculator.sum}"/>>
 
		<br> 	
 
		<input name="mult1" type="text" class="textBox" readonly value=<c:out value="${calculator.mult1}"/>>*
		<input name="mult2" type="text" class="textBox" readonly value=<c:out value="${calculator.mult2}"/>>=
		<input name="product" type="text" class="textBox" readonly value=<c:out value="${calculator.product}"/>>
		<br>

		<br>
			<input type="submit" value="Try Again" />
		</form>
	
</body>
</html>