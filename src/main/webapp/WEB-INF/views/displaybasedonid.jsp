<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<c:if test="${first!=null}">
<th>${first.m_id}</th>
<th>${first.m_name}</th>
<th>${first.m_phone_number}</th>
<th>${first.m_email_id}</th>
<th>${first.m_password}</th>
</c:if>
<c:if test="${first==null}">
<p>Sorry!!! Id not found</p>
</c:if>
</table>
</center>
</body>
</html>