<%@ include file="/WEB-INF/views/include.jsp"%>
<html lang="es">
<head>
<meta charset="utf-8">

	<title><fmt:message key="app.title" /></title>
	<%@ include file ="partials/styles.jsp" %>

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
		
		<canvas id="draw" width="200" height="200">
			<p>Your browser doesn't support canvas.</p>
		</canvas>
		
	</div>
	
	<a href="www.google.es">Hola</a>
	
	<script type="text/javascript">
		var drawingCanvas = document.getElementById('draw');
		if(drawingCanvas.getContext) {
			var context = drawingCanvas.getContext('2d');
			context.fillStyle   = "#00ff00"; 
			context.strokeStyle = "#000000";
			context.beginPath();
			context.arc(100,100,50,0,Math.PI*2,true);
			context.closePath();
			context.stroke();
			context.fill();
		}
	</script>
</body>
</html>