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
		<fmt:message key="app.where.map" />
		
		<%@ include file ="partials/footer.jsp" %>
		
	</div>
		<script type="text/javascript">
		$(document).ready(function(){
			$("#tab_where").addClass("active");
		});
	</script>		

</body>
</html>
