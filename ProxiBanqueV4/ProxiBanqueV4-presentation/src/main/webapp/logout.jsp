<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    session="true"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" 
	content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>

User '<%=request.getRemoteUser()%>' has been logged out.

<% session.invalidate(); %>

<br/><br/>
<a href="login.jsp">Click here to log again</a>
</body>
</html>