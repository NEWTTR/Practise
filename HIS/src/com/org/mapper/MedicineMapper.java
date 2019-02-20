package com.org.mapper;

import java.util.List;

import com.org.pojo.Medicine;


 public interface MedicineMapper {
	 
	 	public void add(Medicine medicine); 
	 
	    public void delete(int m_num); 
	        
	    public Medicine get(int m_num); 
	      
	    public void update(Medicine medicine);  
	        
	    public List<Medicine> list();
	     
	    public int count(); 
}
