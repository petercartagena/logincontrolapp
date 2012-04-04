<%@ include file="include.jsp"%>
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
				<fmt:message key="app.singin.title" />
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
		<form action="../../j_spring_security_check" method="post">
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

		<!-- 		<table> -->
		<!-- 			<tr> -->
		<%-- 				<td valign="top"><c:if test="${not empty param.login_error}"> --%>
		<!-- 						<font color="red"> Invalid user name or password, try -->
		<!-- 							again.<br /> <br /> -->
		<!-- 						</font> -->
		<%-- 					</c:if> --%>
		<!-- 					<form name="login_form" -->
		<%-- 						action="<c:url value='j_spring_security_check'/>" method="POST"> --%>
		<!-- 						<div> -->
		<!-- 							<table width="40%" border="0" cellpadding="0" cellspacing="0"> -->
		<!-- 								<tr> -->
		<!-- 									<td valign="top"> -->
		<!-- 										<table border="0" cellspacing="0" cellpadding="4" width="40%"> -->
		<!-- 											<tr> -->
		<!-- 												<td colspan="2">Login -->
		<!-- 													<hr width="100%" size="1" noshade align="left"> -->
		<!-- 												</td> -->
		<!-- 												<td></td> -->
		<!-- 											</tr> -->
		<!-- 											<tr> -->
		<!-- 												<td width="80">Username</td> -->
		<!-- 												<td valign="top" align="left"><input type='text' -->
		<!-- 													id='username' size="30" maxlength="40" name='j_username' -->
		<%-- 													value='<c:if test="${not empty param.login_error}"> --%>
		<%--                                                      <c:out value="${SPRING_SECURITY_LAST_USERNAME}"/> --%>
		<%--                                                      </c:if>' /> --%>
		<!-- 												</td> -->
		<!-- 											</tr> -->
		<!-- 											<tr> -->
		<!-- 												<td width="80">Password</td> -->
		<!-- 												<td valign="top" align="left"><input type='password' -->
		<!-- 													name='j_password' size="30" maxlength="30"></td> -->
		<!-- 											</tr> -->
		<!-- 											<tr> -->
		<!-- 												<td></td> -->
		<!-- 												<td><input type="submit" value="Submit" /></td> -->
		<!-- 											</tr> -->
		<!-- 										</table> -->
		<!-- 									</td> -->
		<!-- 								</tr> -->
		<!-- 							</table> -->
		<!-- 						</div> -->
		<!-- 					</form></td> -->
		<!-- 			</tr> -->
		<!-- 		</table> -->
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