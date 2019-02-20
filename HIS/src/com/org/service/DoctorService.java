package com.org.service;

import java.util.List;

import com.org.pojo.Doctor;


public interface DoctorService {
	 List<Doctor> list();
	 
     void add(Doctor doctor); 
     
     void update(Doctor doctor);
     
     Doctor get(int m_num);
     
     void delete(int m_num); 
}
