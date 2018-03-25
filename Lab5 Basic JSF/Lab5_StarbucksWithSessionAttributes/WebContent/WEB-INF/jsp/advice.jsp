<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
<title>Starbuck's</title>
</head>
<body>
	<form action="logout" method="get">
		<input type="submit" value="logout" /><br />
		<br />
	</form>
	<h2>${user.name} Ask for advice about your favorite roast:</h2>
	<p />
	<form action="advice.do" method="post">
		<select name="roast">
			<option value="-">--Choose Roast--</option>
			<c:forEach var="roast" items="${roasts}">
				<option value="${roast.key}">${roast.value}</option>
			</c:forEach>
		</select>
		<p>
			<input type="submit" value="Submit" />
		</p>
	</form>

</body>
</html>