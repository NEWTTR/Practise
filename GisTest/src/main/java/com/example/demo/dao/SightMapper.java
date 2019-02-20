package com.example.demo.dao;

import com.example.demo.entity.Sight;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SightMapper {
    int deleteByPrimaryKey(Integer sightId);

    int insert(Sight record);

    Sight selectByPrimaryKey(Integer sightId);

    List<Sight> selectAll();

    int updateByPrimaryKey(Sight record);

    List<Sight> selectAllbysightClicks();

    List<Sight> selectOnebyName(String sightName);

    Sight selectbylonglat(Double sightLongitude,Double sightLatitude);

    Sight selectbyName(String sightName);
}