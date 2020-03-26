<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="str" value="Shubham kulthe is a java programmer "/>

Length : ${fn:length(str)}

<br>
<br>
<br>

<c:forEach items="${fn:split(str,' ')}" var="s">
<br> ${s}
</c:forEach>

<br>
<br>
<br>


index: ${fn:indexOf(str,'is')}

<br>
<br>
<br>

is there : ${fn:contains(str,"java")}

<br>
<br>
<br>

<c:if test = "${fn:contains(str,'java')}">
java is der
</c:if>

<br>
<br>
<br>

<c:if test="${fn.endsWith(str,'programmer')}">
you are right buddy
</c:if>

<br>
<br>
<br>

${fn:toUpperCase(str)}

</body>
</html>