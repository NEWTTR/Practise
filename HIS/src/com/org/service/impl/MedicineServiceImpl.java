package com.org.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.pojo.Medicine;
import com.org.service.MedicineService;
import com.org.mapper.MedicineMapper;

@Service
public class MedicineServiceImpl implements MedicineService{

	@Autowired
	MedicineMapper medicinemapper;
	
	

	@Override
	public List<Medicine> list() {
		// TODO Auto-generated method stub
		return medicinemapper.list();
	}



	@Override
	public void add(Medicine medicine) {
		// TODO Auto-generated method stub
		medicinemapper.add(medicine);
	}



	@Override
	public void update(Medicine medicine) {
		 medicinemapper.update(medicine);
		
	}



	@Override
	public Medicine get(int m_num) {
		// TODO Auto-generated method stub
		Medicine medicine = medicinemapper.get(m_num);
		return medicine;
	}



	@Override
	public void delete(int m_num) {
		// TODO Auto-generated method stub
		medicinemapper.delete(m_num);
	}

	


}
