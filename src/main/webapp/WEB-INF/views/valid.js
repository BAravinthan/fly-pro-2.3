/**
 * 
 */
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
false;
	}
else if(m_email_id==null || m_email_id=="")
{
alert("email id can't be blank");
retrun false;
}
else if(m_password.length<6)
	{
alert("password must be atleast 6 character");
return false;
	}
	}