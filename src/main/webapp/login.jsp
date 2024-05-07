<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>

<h2> login here...</h2>

<form action = "verifyLogin" method = "post">
UserName: <input type = "text" name = user>
Password: <input type = "password" name = pass>
<input type = "submit" value = "login">

</form>
<%
	if(request.getAttribute("errorMsg")!=null){
		out.println(request.getAttribute("errorMsg"));
	}
%>



</body>
</html>












