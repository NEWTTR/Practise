package com.example.demo.service.impl;

import com.example.demo.dao.SightMapper;
import com.example.demo.entity.Sight;
import com.example.demo.service.SightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SightServiceImpl implements SightService {


    @Autowired
    private SightMapper sightMapper;

    @Override
    public void insert(Sight sight) {
        sightMapper.insert(sight);
    }

    @Override
    public void delete(int id) {
        sightMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Sight sight) {
        sightMapper.updateByPrimaryKey(sight);
    }

    @Override
    public Sight select(int id) {
        return sightMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Sight> selectAll() {
        return sightMapper.selectAll();
    }

    @Override
    public List<Sight> selectAllbysightClicks() {
        return sightMapper.selectAllbysightClicks();
    }

    @Override
    public List<Sight> selectOnebyName(String sightName) {
        return sightMapper.selectOnebyName(sightName);
    }

    @Override
    public Sight selectbylonglat(Double sightLongitude, Double sightLatitude) {
        return sightMapper.selectbylonglat(sightLongitude,sightLatitude);
    }

    @Override
    public Sight selectbyName(String sightName) {
        return sightMapper.selectbyName(sightName);
    }
}
