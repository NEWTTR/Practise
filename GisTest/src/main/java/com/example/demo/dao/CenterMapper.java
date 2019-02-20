package com.example.demo.dao;

import com.example.demo.entity.Center;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface CenterMapper {
    int deleteByPrimaryKey(Integer centerId);

    int insert(Center record);

    Center selectByPrimaryKey(Integer centerId);

    List<Center> selectAll();

    int updateByPrimaryKey(Center record);

    Center selectbyName(String centerName);
}