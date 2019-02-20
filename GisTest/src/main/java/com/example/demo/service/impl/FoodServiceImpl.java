package com.example.demo.service.impl;

import com.example.demo.dao.FoodMapper;
import com.example.demo.entity.Food;
import com.example.demo.service.FoodService;
import com.example.demo.util.Distance;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {




    @Autowired
    private  FoodMapper foodMapper;

    @Override
    public void insert(Food food) {
        foodMapper.insert(food);
    }

    @Override
    public void delete(int id) {
        foodMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Food food) {
        foodMapper.updateByPrimaryKey(food);
    }

    @Override
    public Food select(int id) {
        return foodMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Food> selectAll() {
        return foodMapper.selectAll();
    }

    @Override
    public PageInfo<Food> selectFoodList(Integer pageNum, Integer pageSize, Food food) {
        PageHelper.startPage(pageNum, pageSize);
        List<Food> list = foodMapper.selectAll();
       /* for(int i = 0; i < list.size(); i++){
            Food foodchecked = list.get(i);
            boolean isIN = Distance.isInCircle(foodchecked.getFoodLongitude(),foodchecked.getFoodLatitude(),120.638636,31.32713,"1000");
            if(isIN == false){
                list.remove(i);
            }
        }*/
        /*Food foodone = list.get(0);
        System.out.println(list.get(0));*/
        PageInfo<Food> pageInfo = new PageInfo<>(list);
        /*System.out.println(list);
        System.out.println(pageInfo);*/
        return pageInfo;
    }

    @Override
    public Food selectbyName(String foodName) {
        return foodMapper.selectbyName(foodName);
    }
}
