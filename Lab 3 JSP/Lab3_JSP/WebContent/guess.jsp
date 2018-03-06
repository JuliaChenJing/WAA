<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Guess A Number</title>
</head>
<body>
	<form method='post' action=Guess>
		<p>Please Choose a number</p>
		number= <input type=text name=number> <input type=submit
			value='Try this number'>
			<p>${output}</p>
	</form>
</body>
</html>