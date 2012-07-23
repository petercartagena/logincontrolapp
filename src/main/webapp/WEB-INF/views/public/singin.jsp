<%@ include file="/WEB-INF/views/include.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
	<title><fmt:message key="app.title" /></title>
	<%@ include file ="partials/styles.jsp" %>
</head>
<body>
	
	<%@ include file ="partials/navbar.jsp" %>

	
	<div class="container">
		<form action="../../j_spring_security_check" method="post">
			<p>
				<label for="j_username">Username</label> <input id="j_username" name="j_username" type="text" />
			</p>
			<p>
				<label for="j_password">Password</label> <input id="j_password" name="j_password" type="password" />
			</p>
			<input type="submit" value="Login" />
		</form>
		<%@ include file ="partials/footer.jsp" %>
	</div>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#tab_singin").addClass("active");
		});
	</script>	
</body>
</html>