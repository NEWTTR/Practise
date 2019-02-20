package com.example.demo.service.impl;

import com.example.demo.dao.CenterMapper;
import com.example.demo.entity.Center;
import com.example.demo.service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CenterServiceImpl implements CenterService {

    @Autowired
    private  CenterMapper centerMapper;

    @Override
    public void insert(Center center) {
        centerMapper.insert(center);
    }

    @Override
    public void delete(int id) {
        centerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Center center) {
        centerMapper.updateByPrimaryKey(center);
    }

    @Override
    public Center select(int id) {
        return centerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Center> selectAll() {
        return centerMapper.selectAll();
    }

    @Override
    public Center selectbyName(String centerName) {
        return centerMapper.selectbyName(centerName);
    }
}
