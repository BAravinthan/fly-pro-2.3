<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validate()
{
var m_name           =document.newone.m_name.value;
var m_phone_number   =document.newone.m_phone_number.value;
var m_email_id       =document.newone.m_email_id.value;
var m_password       =document.newone.m_password.value;

if(m_name==null || m_name=="")
	{
alert("first can't be blank");
return false;
	}
else if(m_phone_number==null || m_phone_number=="")
	{
alert("phone number can't be blank");
return false;
	}
else if(m_email_id==null || m_email_id=="")
{
alert("email id can't be blank");
return false;
}
else if(m_password.length<6)
	{
alert("password must be atleast 6 character");
return false;
	}
	}
</script>
</head>
<body>
<center>
<form name="newone" action="adduser" method="post" onsubmit="return validate()">
<div>
<input type="text" placeholder="enter ur name" name="m_name">
</div>
<div>
<input type="number" placeholder="enter ur phone number" name="m_phone_number">
</div><div>
<input type="email" placeholder="enter ur email id" name="m_email_id">
</div><div>
<input type="password" placeholder="enter ur passsword" name="m_password">
</div><div>
<input type="submit" value="register">
</div>
</form>
<div>
<a href="d_redirect">click here to display all user</a>
</div>
<div>
<a href="getuserid.jsp">click here to display based on id</a>
</div>
<div>
<a href="deleteuserdetails.jsp">click here to delete user information based ion id </a>
</div>
<br>
<a href="updateuserdetails.jsp">click here to update the user information</a>

</center>
</body>
</html>