package com.example.demo.service;

import com.example.demo.entity.Hotel;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface HotelService {
    public void insert(Hotel hotel);

    public void delete(int id);

    public void update(Hotel hotel);

    public Hotel select(int id);

    public List<Hotel> selectAll();

    //分页方法一
    public List<Hotel> selectAllbyPage();

    //分页方法二
    PageInfo<Hotel> selectHotelList(Integer pageNum, Integer pageSize, Hotel hotel);

    public Hotel selectbyName(String hotelName);
}
