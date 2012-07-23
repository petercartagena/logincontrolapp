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
		<div class="row">
		  	<div class="span6">
		      <img class="bs-icon" src="#falta_imagen#">
		      <h2>
				<fmt:message key="app.contact.product.support.name" />
			  </h2>
			  <h3>
				<fmt:message key="app.contact.product.support.message" />
			  </h3>
			  <p>
				<fmt:message key="app.contact.product.support.email" />
			  </p>
		   	</div>
		</div>
		<br/>
		<br/>
		<div class="row">
		    <div class="span6">
		      <img class="bs-icon" src="#falta_image#">
		      <h2>
				<fmt:message key="app.contact.business.inquires.name" />
			  </h2>
			  <h3>
				<fmt:message key="app.contact.business.inquires.message" />
			  </h3>
			  <p>
				<fmt:message key="app.contact.business.inquires.email" />
			 </p>
		    </div>
		</div>
		
		<%@ include file ="partials/footer.jsp" %>
			
	</div>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#tab_contact").addClass("active");
		});
	</script>	

</body>
</html>
