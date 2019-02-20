package com.org.service;

import java.util.List;

import com.org.pojo.Patient;


public interface PatientService {
	List<Patient> list();
    void add(Patient patient); 
    void update(Patient patient);
    Patient get(int m_num);
    void delete(int m_num); 
    int count();
}
