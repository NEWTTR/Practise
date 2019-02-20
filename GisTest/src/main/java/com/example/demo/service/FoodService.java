package com.example.demo.service;

import com.example.demo.entity.Food;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface FoodService {
    public void insert(Food food);

    public void delete(int id);

    public void update(Food food);

    public Food select(int id);

    public List<Food> selectAll();

    PageInfo<Food> selectFoodList(Integer pageNum, Integer pageSize, Food food);

    public Food selectbyName(String foodName);
}
