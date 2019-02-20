package com.example.demo.dao;

import com.example.demo.entity.Food;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface FoodMapper {
    int deleteByPrimaryKey(Integer foodId);

    int insert(Food record);

    Food selectByPrimaryKey(Integer foodId);

    List<Food> selectAll();

    int updateByPrimaryKey(Food record);

    Food selectbyName(String foodName);
}