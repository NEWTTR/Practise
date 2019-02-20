package com.org.service;

import java.util.List;

import com.org.pojo.Medicine;

public interface MedicineService {
        
     List<Medicine> list();
     void add(Medicine medicine); 
     void update(Medicine medicine);
     Medicine get(int m_num);
     void delete(int m_num); 
}
