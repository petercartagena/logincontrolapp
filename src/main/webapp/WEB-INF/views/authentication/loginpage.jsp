<%@ include file="/WEB-INF/views/include.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Login</h1>
	<div id="login-error">${error}</div>
	<form action="logincontrolapp/j_spring_security_check" method="post">
		<p>
			<label for="j_username">Username</label> <input id="j_username"
				name="j_username" type="text" />
		</p>
		<p>
			<label for="j_password">Password</label> <input id="j_password"
				name="j_password" type="password" />
		</p>
		<input type="submit" value="Login" />
	</form>
</body>
</html>