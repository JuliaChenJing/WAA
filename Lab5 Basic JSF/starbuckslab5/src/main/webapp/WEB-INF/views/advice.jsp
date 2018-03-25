<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Advice List</title>
</head>
<body>
<c:if test="${ not empty user}">
		<h2>Welcome ${user.name}  <a href='<spring:url value="/logout"></spring:url>'>Logout</a></h2>
		</c:if>
		<form action='<spring:url value="/home"></spring:url>' method="get">
		Starbuck's ${roast} Roast Coffees:
		<table>
			<c:forEach var="roaste" items="${roastList}" varStatus="status">
				<c:choose>
					<c:when test="${(status.index)%2 eq 0 }">
						<tr style="background-color: cyan">
							
					</c:when>
					<c:otherwise>
						<tr style="background-color: yellow">
						
					</c:otherwise>
				</c:choose>
				<td>${roaste }</td>
						</tr>

			</c:forEach>

		</table>
		 <input type="submit" value="Back">
		 </form>
</body>
</html>