package com.org.mapper;

import java.util.List;

import com.org.pojo.Register;


public interface RegisterMapper {
	public void add(Register register); 
	 
    public void delete(int r_num); 
        
    public Register get(int r_num); 
      
    public void update(Register register);  
        
    public List<Register> list();
     
    public int count();
}
