package com.org.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.mapper.RegisterMapper;
import com.org.pojo.Register;
import com.org.service.RegisterService;


@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	RegisterMapper registermapper;

	@Override
	public List<Register> list() {
		// TODO Auto-generated method stub
		return registermapper.list();
	}

	@Override
	public void add(Register register) {
		// TODO Auto-generated method stub
		registermapper.add(register);
	}

	@Override
	public void update(Register register) {
		// TODO Auto-generated method stub
		registermapper.update(register);
	}

	@Override
	public Register get(int r_num) {
		// TODO Auto-generated method stub
		return registermapper.get(r_num);
	}

	@Override
	public void delete(int r_num) {
		// TODO Auto-generated method stub
		registermapper.delete(r_num);
	}
	
}
