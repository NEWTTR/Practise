package com.example.demo.service.impl;

import com.example.demo.dao.BaidutestMapper;
import com.example.demo.entity.Baidutest;
import com.example.demo.service.BaiduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BaiduServiceImpl implements BaiduService {

    @Autowired
    private BaidutestMapper baidutestmapper;

    @Override
    public void insert(Baidutest baidutest) {
         baidutestmapper.insert(baidutest);
    }

    @Override
    public void delete(int id) {
        baidutestmapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Baidutest baidutest) {
        baidutestmapper.updateByPrimaryKey(baidutest);
    }

    @Override
    public Baidutest select(int id) {
        return baidutestmapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Baidutest> selectAll() {
        return baidutestmapper.selectAll();
    }
}
