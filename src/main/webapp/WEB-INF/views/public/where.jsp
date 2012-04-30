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
				<fmt:message key="app.where.title" />
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
	<!-- 	<section id="intro"> -->
	<!-- 	</section> -->
	<section>
		<!-- Main context -->
		<br>
		<br>
		<br>
		
		<fmt:message key="app.where.map" />
		
		
<!-- 	<iframe width="825" height="650" src="http://maps.google.es/maps?f=q&amp;source=s_q&amp;hl=es&amp;geocode=&amp;q=Calle+de+Embajadores,+Madrid&amp;aq=0&amp;oq=calle+em&amp;sll=40.396764,-3.713379&amp;sspn=14.795988,19.753418&amp;t=h&amp;ie=UTF8&amp;hq=&amp;hnear=Calle+de+Embajadores,+Madrid,+Comunidad+de+Madrid&amp;z=14&amp;ll=40.38821,-3.691139&amp;output=embed"></iframe><br /><small><a href="http://maps.google.es/maps?f=q&amp;source=embed&amp;hl=es&amp;geocode=&amp;q=Calle+de+Embajadores,+Madrid&amp;aq=0&amp;oq=calle+em&amp;sll=40.396764,-3.713379&amp;sspn=14.795988,19.753418&amp;t=h&amp;ie=UTF8&amp;hq=&amp;hnear=Calle+de+Embajadores,+Madrid,+Comunidad+de+Madrid&amp;z=14&amp;ll=40.38821,-3.691139" style="color:#0000FF;text-align:left">Ver mapa más grande</a></small> -->
		
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
