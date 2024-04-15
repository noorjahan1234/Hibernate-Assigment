package com.learnHibernate3.Hibernate3;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person 
{
	@Id
	int p_id;
	String p_name;
	int p_age;
	public Person(int p_id, String p_name, int p_age) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_age = p_age;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_age() {
		return p_age;
	}
	public void setP_age(int p_age) {
		this.p_age = p_age;
	}
	@Override
	public String toString() {
		return "Person [p_id=" + p_id + ", p_name=" + p_name + ", p_age=" + p_age + "]";
	}
}
