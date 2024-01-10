<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<table border=3px>
<tr>
<th>Id</th>
<th>Name</th>
<th>Phone number</th>
<th>Email id</th>
<th>Password</th>
</tr>
<c:forEach items="${f_redirect}" var="s_redirect">
<tr>
<th>${s_redirect.m_id}</th>
<th>${s_redirect.m_name}</th>
<th>${s_redirect.m_phone_number}</th>
<th>${s_redirect.m_email_id}</th>
<th>${s_redirect.m_password}</th>
</tr>
</c:forEach>
</table>
</center>
</body>
</html>