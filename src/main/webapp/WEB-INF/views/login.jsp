<%@ include file="/WEB-INF/views/include.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<title><fmt:message key="app.title" /></title>
<c:url value="/css/style.css" var="url" />
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
		<br>
		<br>
		<h1>LOGIN PAGE</h1>
	</section>
	<aside>
		<!-- Sidebar -->
	</aside>
	<footer>
		<!-- Footer -->
<!-- 		<div></div> -->
	</footer>
</body>
</html>
