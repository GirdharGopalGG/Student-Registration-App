<%@ include file =  "menu.jsp" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Registration</title>
</head>
<body>
<h2> New Registration</h2>
<form action = "saveRegistration" method = "post">
	<pre>
		Name:   <input type = "text" name = "name">
		Course: <input type = "text" name = "course">
		Email:	<input type = "email" name = "email">
		Mobile 	<input type = "text" name = "mobile">
		<input type = "submit" value = "save">
		</pre>
</form>
<%
	if(request.getAttribute("msg")!=null)
		out.println(request.getAttribute("msg"));

	
%>
</body>
</html>











