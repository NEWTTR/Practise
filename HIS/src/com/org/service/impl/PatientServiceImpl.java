package com.org.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.mapper.PatientMapper;
import com.org.pojo.Patient;
import com.org.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientMapper patientmapper;
	
	@Override
	public List<Patient> list() {
		// TODO Auto-generated method stub
		return patientmapper.list();
	}

	@Override
	public void add(Patient patient) {
		// TODO Auto-generated method stub
		patientmapper.add(patient);
	}

	@Override
	public void update(Patient patient) {
		// TODO Auto-generated method stub
		patientmapper.update(patient);
	}

	@Override
	public Patient get(int p_num) {
		// TODO Auto-generated method stub
		return patientmapper.get(p_num);
	}

	@Override
	public void delete(int p_num) {
		// TODO Auto-generated method stub
		patientmapper.delete(p_num);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return patientmapper.count();
	}

}
