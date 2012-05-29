<%@ include file="/WEB-INF/views/include.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<title><fmt:message key="app.title" /></title>
<%-- <c:url value="/css/style.css" var="url" /> --%>
<c:url value="/css/bootstrap.min.css" var="url" />
<link rel="stylesheet" href="${url}" type="text/css" media="screen, projection">
</head>
<body>
	<header>
		<hgroup>
			<h1>
				<fmt:message key="app.title" />
			</h1>
			<h2>
				<fmt:message key="app.main.title" />
			</h2>
		</hgroup>
	</header>

	<nav>
		<ul>
			<li><a href="main.html"><fmt:message key="app.main.title" /></a></li>			
			<li><a href="singin.html"><fmt:message key="app.singin.title" /></a></li>
			<li><a href="join.html"><fmt:message key="app.join.title" /></a></li>
			<li><a href="where.html"><fmt:message key="app.where.title" /></a></li>
			<li><a href="about.html"><fmt:message key="app.about.title" /></a></li>
			<li><a href="contact.html"><fmt:message key="app.contact.title" /></a></li>
<!-- 			<li class="subscribe"><a href="#">Subscribe-RSS</a></li> -->
		</ul>
	</nav>
	<section id="intro">
		<!-- Introduction -->
		<div id="intro-left">
			<header>
			
				<h2>Cansado de seguimientos infructosos?</h2>
			</header>
			<p>Permite a tu médico, tener un seguimiento de tus niveles de
				control con valores exactos y en tiempo real. Intenta mejorar tu
				calidad de vida. Desde cualquier lugar, en el momento que quieras
				siempre a mano.</p>
		</div>
			   <c:url value="/css/intro_flower.png" var="image_url" />
				<img src="${image_url}" alt="Flower" />
	</section>
	<section>
<!-- 		<p> -->
<!-- 			<br> -->
<%-- 			<c:forEach items="${model.users}" var="user"> --%>
<%-- 				userid:<c:out value="${user[0]}" /> --%>
<%-- 				username:<c:out value="${user[1]}" /> --%>
<%-- 				password:<c:out value="${user[2]}" /> --%>
<%-- 				enabled:<c:out value="${user[3]}" /> --%>
<!-- 				<br> -->
<!-- 				<br> -->
<%-- 			</c:forEach> --%>

<!-- 		</p> -->
	</section>
	<aside>
		<!-- Sidebar -->
	</aside>
	<footer>
		<!-- Footer -->
<!-- 		<div></div> -->
	</footer>


	<!-- 		<p> -->
	<!-- 			<br> -->
	<%-- 			<c:forEach items="${model.users}" var="user"> --%>
	<%-- 				userid:<c:out value="${user[0]}" /> --%>
	<%-- 				username:<c:out value="${user[1]}" /> --%>
	<%-- 				password:<c:out value="${user[2]}" /> --%>
	<%-- 				enabled:<c:out value="${user[3]}" /> --%>
	<!-- 				<br> -->
	<!-- 				<br> -->
	<%-- 			</c:forEach> --%>

	<!-- 			<br> <a href="singin.html">Sing in</a> <br> <a -->
	<!-- 				href="join.html">Joinin</a> <br> -->
	<!-- 		</p> -->
</body>
</html>
