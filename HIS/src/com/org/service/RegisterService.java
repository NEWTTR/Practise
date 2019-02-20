package com.org.service;

import java.util.List;

import com.org.pojo.Register;

public interface RegisterService {
	List<Register> list();
    void add(Register patient); 
    void update(Register patient);
    Register get(int m_num);
    void delete(int m_num); 
}
