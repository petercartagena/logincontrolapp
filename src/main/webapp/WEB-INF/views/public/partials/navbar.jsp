<%@ include file="/WEB-INF/views/include.jsp"%>

<!-- CONVENCION DE NOMBRES: Particula "To" antes como prefijo de nombre, significa que su funcionamiento va a ser ajustado -->
<!-- por alguna accion dentro del código. -->

<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<a class="brand" href="main.html"><fmt:message key="app.title" /></a>
			<ul id="toActive" class="nav">
				<li id="tab_main"><a href="main.html"><fmt:message key="app.main.title" /></a></li>			
				<li id="tab_singin"><a href="singin.html"><fmt:message key="app.singin.title" /></a></li>
				<li id="tab_join"><a href="join.html"><fmt:message key="app.join.title" /></a></li>
				<li id="tab_where"><a href="where.html"><fmt:message key="app.where.title" /></a></li>
				<li id="tab_about"><a href="about.html"><fmt:message key="app.about.title" /></a></li>
				<li id="tab_contact"><a href="contact.html"><fmt:message key="app.contact.title" /></a></li>
			</ul>
		</div>
	</div>