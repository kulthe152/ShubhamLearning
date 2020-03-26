<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");	//http 1.1
	response.setHeader("Pragma", "no-Cache"); 									//http 1.0
	response.setHeader("Expires", "0");											//proxies server


	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
	}
%>

welcome..... ${username}

<a href="videos.jsp">video</a>

<form action="logout">
<input type="submit" value="logout">
</form>

</body>
</html>