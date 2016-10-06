<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" 
	content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
<%
String username = request.getRemoteUser();
String role = "";
if (request.isUserInRole("conseiller"))
	role = "conseiller";
if (request.isUserInRole("gerant"))
	role = "gérant";
%>
<span>Bonjour <%= username %>. Vous êtes connecté en tant que <%= role %>. </span>
<br />
<a href="user/gerant/index2.jsp">gerant</a>
<a href="logout.jsp">Logout</a>
</body>
</html>