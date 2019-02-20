package com.example.demo.service;

import com.example.demo.entity.Center;

import java.util.List;

public interface CenterService {

    public void insert(Center center);

    public void delete(int id);

    public void update(Center center);

    public Center select(int id);

    public List<Center> selectAll();

    public Center selectbyName(String centerName);
}
