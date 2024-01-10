package com.zomato.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomato.Entity.Entityclass;
import com.zomato.Service.Servinter;

@Controller
public class Controllerclass {
@Autowired
private Servinter servinter;

@RequestMapping("Register")
public String addtwo()
{
	return "Register";
}
@RequestMapping("adduser")
public String addone(Entityclass entityclass)
{
	servinter.addtwo(entityclass);
	return "Register";
}

@GetMapping("d_redirect")
public String displayone(Model model)
{
	List<Entityclass> li=servinter.getall();
	model.addAttribute("f_redirect",li);
	return "Displayalluser";
}
@GetMapping("basedid")
public String bid(@RequestParam("m_id") long m_id,Model model)
{
	Entityclass entityclass=servinter.getid(m_id);
	model.addAttribute("first",entityclass);
	return "displaybasedonid";
}
@RequestMapping("delid")
public String deteleuser(@RequestParam("m_id") long m_id,Model model)
{
	boolean del=servinter.userid(m_id);
	if(del)
	{
		model.addAttribute("message","Id ="+m_id+" deleted successfully");
	}
	else
	{
		model.addAttribute("message","Id ="+m_id+" is not found");

	}
	return "display";
}
@PostMapping("updateone")
public String updateall(@RequestParam long m_id, @RequestParam String m_email_id,@RequestParam String m_password,Model model)
{
boolean upd=servinter.userupd(m_id,m_email_id,m_password);
{
	if(upd)
	{
		model.addAttribute("up","Id ="+m_id+" has been updated successfully");
	}
	else
	{
		model.addAttribute("up","Id ="+m_id+" not available");
	}
	return "updatedisplay";
}
}
}
