package com.org.pojo;

import java.util.Date;

public class Medicine {
    private int m_id;
    private int m_num;
    private String m_name;
    private double m_price;
    private int m_quantity;
    private String m_time;
    
	public int getM_id() {
		return m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	
	public double getM_price() {
		return m_price;
	}
	public void setM_price(double m_price) {
		this.m_price = m_price;
	}
	public int getM_quantity() {
		return m_quantity;
	}
	public void setM_quantity(int m_quantity) {
		this.m_quantity = m_quantity;
	}
	public String getM_time() {
		return m_time;
	}
	public void setM_time(String m_time) {
		this.m_time = m_time;
	}
	
  
}
	