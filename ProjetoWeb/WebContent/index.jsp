<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
	</head>
<body>
	<form action="${pageContext.request.contextPath}/meuServlet" method="get">
		<label>Login:</label>
		<input type="text" name="login" />
		
		<br />
		<br />
		
		<label>Senha:</label>		
		<input type="password" name="senha">
		
		<br />
		<br />
		
		<input type="submit" value="Enviar">
	</form>
</body>
</html>