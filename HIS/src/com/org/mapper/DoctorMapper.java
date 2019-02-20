package com.org.mapper;

import java.util.List;

import com.org.pojo.Doctor;


public interface DoctorMapper {
	public void add(Doctor doctor); 
	 
    public void delete(int m_num); 
        
    public Doctor get(int m_num); 
      
    public void update(Doctor doctor);  
        
    public List<Doctor> list();
     
    public int count(); 
}
