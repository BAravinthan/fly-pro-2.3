package com.zomato.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomato.Entity.Entityclass;
import com.zomato.Repository.Repointer;
@Service
public class Servclass implements Servinter {
@Autowired
private Repointer repointer;
	@Override
	public void addtwo(Entityclass entityclass) {
repointer.save(entityclass);
	}
	@Override
	public List<Entityclass> getall() {
		return repointer.findAll();
	}
	@Override
	public Entityclass getid(long m_id) {
		return repointer.findById(m_id).orElse(null);
	}
	@Override
	public boolean userid(long m_id) {
		if(repointer.existsById(m_id))
		{
			repointer.deleteById(m_id);
			return true;
		}
		return false;
	}
	@Override
	public boolean userupd(long m_id, String m_email_id, String m_password) {
		Optional<Entityclass> useroptions=repointer.findById(m_id);
		if(useroptions.isPresent())
		{
			Entityclass entityclass=useroptions.get();
			entityclass.setM_email_id(m_email_id);
			entityclass.setM_password(m_password);
			repointer.save(entityclass);
			return true;
		}
		return false;
	}

}
