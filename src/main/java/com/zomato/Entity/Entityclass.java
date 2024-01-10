package com.zomato.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clone_zomato")
public class Entityclass {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="z_id")
private long m_id;
public long getM_id() {
	return m_id;
}
public void setM_id(long m_id) {
	this.m_id = m_id;
}
@Column(name="z_name")
private String m_name;
public String getM_name() {
	return m_name;
}
public void setM_name(String m_name) {
	this.m_name = m_name;
}
@Column(name="z_phone_number")
private String m_phone_number;
public String getM_phone_number() {
	return m_phone_number;
}
public void setM_phone_number(String m_phone_number) {
	this.m_phone_number = m_phone_number;
}
@Column(name="z_email_id")
private String m_email_id;
public String getM_email_id() {
	return m_email_id;
}
public void setM_email_id(String m_email_id) {
	this.m_email_id = m_email_id;
}
@Column(name="z_password")
private String m_password;
public String getM_password() {
	return m_password;
}
public void setM_password(String m_password) {
	this.m_password = m_password;
}
}
