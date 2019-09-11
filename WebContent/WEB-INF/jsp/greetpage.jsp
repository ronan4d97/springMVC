<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greetings</title>
</head>
<body>
	<jsp:include page="/menu.jsp"></jsp:include>
	<h1 style="color: yellow;">${message }</h1>
	<h2 style="color: red;">${name }</h2>
</body>
</html>