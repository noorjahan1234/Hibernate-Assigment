package com.learnHibernate3.Hibernate3;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike 
{
	@Id
	int b_engNo;
	String b_brnd;
	float b_cost;
	public Bike(int b_engNo, String b_brnd, float b_cost) {
		super();
		this.b_engNo = b_engNo;
		this.b_brnd = b_brnd;
		this.b_cost = b_cost;
	}
	public int getB_engNo() {
		return b_engNo;
	}
	public void setB_engNo(int b_engNo) {
		this.b_engNo = b_engNo;
	}
	public String getB_brnd() {
		return b_brnd;
	}
	public void setB_brnd(String b_brnd) {
		this.b_brnd = b_brnd;
	}
	public float getB_cost() {
		return b_cost;
	}
	public void setB_cost(float b_cost) {
		this.b_cost = b_cost;
	}
	@Override
	public String toString() {
		return "Bike [b_engNo=" + b_engNo + ", b_brnd=" + b_brnd + ", b_cost=" + b_cost + "]";
	}
}
