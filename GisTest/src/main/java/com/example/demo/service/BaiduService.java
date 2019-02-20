package com.example.demo.service;

import com.example.demo.entity.Baidutest;

import java.util.List;

public interface BaiduService {
    public void insert(Baidutest baidutest);

    public void delete(int id);

    public void update(Baidutest baidutest);

    public Baidutest select(int id);

    public List<Baidutest> selectAll();
}
