<%@ include file="/WEB-INF/views/include.jsp"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">

	<title><fmt:message key="app.title" /></title>
	<%@ include file ="partials/styles.jsp" %>

	<!-- <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script> -->
	<!-- <script src="http://twitter.github.com/bootstrap/1.4.0/bootstrap-modal.js"></script> -->
</head>
<body>

	<div class="container">
		<%@ include file ="partials/navbar.jsp" %>
		
		
		<table class = "table">
			<thead>
				<tr>
			      <th>Userid</th>
			      <th>Username</th>
			      <th>Password</th>
			      <th>Enabled</th>
	    		</tr>
	 		</thead>
   			<tbody>
				<c:forEach items="${model.users}" var="user">
					<tr> 
						<td>
							<c:out value="${user[0]}" />
						</td>
						<td>
							<c:out value="${user[1]}" />
						</td>
						<td>
							<c:out value="${user[2]}" />
						</td>
						<td>
							<c:out value="${user[3]}" />
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>