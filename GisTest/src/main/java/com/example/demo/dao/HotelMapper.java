package com.example.demo.dao;

import com.example.demo.entity.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface HotelMapper {
    int deleteByPrimaryKey(Integer hotelId);

    int insert(Hotel record);

    Hotel selectByPrimaryKey(Integer hotelId);

    List<Hotel> selectAll();

    int updateByPrimaryKey(Hotel record);

    Hotel selectbyName(String hotelName);
}