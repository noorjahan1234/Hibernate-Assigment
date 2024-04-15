package com.learnHibernate.Crud1.HibernateCURD;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persion
{
	@Id
	int P_id;
	String P_name;
	int P_age;
	String P_email;
	long P_phone;
	public Persion() {
		super();
	}
	public Persion(int p_id, String p_name, int p_age, String p_email, long p_phone) {
		super();
		P_id = p_id;
		P_name = p_name;
		P_age = p_age;
		P_email = p_email;
		P_phone = p_phone;
	}
	public int getP_id() {
		return P_id;
	}
	public void setP_id(int p_id) {
		P_id = p_id;
	}
	public String getP_name() {
		return P_name;
	}
	public void setP_name(String p_name) {
		P_name = p_name;
	}
	public int getP_age() {
		return P_age;
	}
	public void setP_age(int p_age) {
		P_age = p_age;
	}
	public String getP_email() {
		return P_email;
	}
	public void setP_email(String p_email) {
		P_email = p_email;
	}
	public long getP_phone() {
		return P_phone;
	}
	public void setP_phone(long p_phone) {
		P_phone = p_phone;
	}
	@Override
	public String toString() {
		return "Persion [P_id=" + P_id + ", P_name=" + P_name + ", P_age=" + P_age + ", P_email=" + P_email
				+ ", P_phone=" + P_phone + "]";
	}	
}
