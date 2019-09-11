<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<jsp:include page="/menu.jsp"></jsp:include>
	<h1>Welcome!!</h1>
	<form action="login.do" method="post">
		<p>
			UserName: <input type="text" name="user" />
		</p>
		<p>
			Password: <input type="password" name="password" />
		</p>
		<input type="submit" value="Login" />
	</form>
	<p style="color: red;">${error}</p>
</body>
</html>