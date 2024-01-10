package com.zomato.Service;

import java.util.List;

import com.zomato.Entity.Entityclass;

public interface Servinter {

	void addtwo(Entityclass entityclass);

	List<Entityclass> getall();

	Entityclass getid(long m_id);

	boolean userid(long m_id);

	boolean userupd(long m_id, String m_email_id, String m_password);

}
