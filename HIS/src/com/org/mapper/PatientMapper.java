package com.org.mapper;

import java.util.List;

import com.org.pojo.Patient;


public interface PatientMapper {
	public void add(Patient patient); 
	 
    public void delete(int p_num); 
        
    public Patient get(int p_num); 
      
    public void update(Patient patient);  
        
    public List<Patient> list();
     
    public int count();
}
