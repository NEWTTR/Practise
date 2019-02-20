package com.example.demo.dao;

import com.example.demo.entity.Baidutest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BaidutestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Baidutest record);

    Baidutest selectByPrimaryKey(Integer id);

    List<Baidutest> selectAll();

    int updateByPrimaryKey(Baidutest record);
}