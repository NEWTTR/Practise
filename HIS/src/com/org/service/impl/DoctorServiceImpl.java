package com.org.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.mapper.DoctorMapper;
import com.org.pojo.Doctor;
import com.org.service.DoctorService;


@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	DoctorMapper doctormapper;
	
	@Override
	public List<Doctor> list() {
		// TODO Auto-generated method stub
		return doctormapper.list();
	}

	@Override
	public void add(Doctor doctor) {
		// TODO Auto-generated method stub
		doctormapper.add(doctor);
	}

	@Override
	public void update(Doctor doctor) {
		// TODO Auto-generated method stub
		doctormapper.update(doctor);
	}

	@Override
	public Doctor get(int m_num) {
		// TODO Auto-generated method stub
		return doctormapper.get(m_num);
	}

	@Override
	public void delete(int m_num) {
		// TODO Auto-generated method stub
		doctormapper.delete(m_num);
	}

}
