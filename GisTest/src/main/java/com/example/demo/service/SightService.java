package com.example.demo.service;


import com.example.demo.entity.Sight;

import java.util.List;

public interface SightService {

    public void insert(Sight sight);

    public void delete(int id);

    public void update(Sight sight);

    public Sight select(int id);

    public List<Sight> selectAll();

    public List<Sight> selectAllbysightClicks();

    public List<Sight> selectOnebyName(String sightName);

    public  Sight selectbylonglat(Double sightLongitude,Double sightLatitude);

    public Sight selectbyName(String sightName);
}
