package com.example.demo.service.impl;

import com.example.demo.dao.HotelMapper;
import com.example.demo.entity.Hotel;
import com.example.demo.service.HotelService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelMapper hotelMapper;

    @Override
    public void insert(Hotel hotel) {
        hotelMapper.insert(hotel);
    }

    @Override
    public void delete(int id) {
        hotelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Hotel hotel) {
        hotelMapper.updateByPrimaryKey(hotel);
    }

    @Override
    public Hotel select(int id) {
        return hotelMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Hotel> selectAll() {
        return hotelMapper.selectAll();
    }

    @Override
    public List<Hotel> selectAllbyPage() {
        //设置当前所在页面和每页数据数目，在调用查询方法前调用
        Page<Object> page = PageHelper.startPage(1,2);
        //page的相关方法
        System.out.println("每页记录数："+page.getPageSize());
        System.out.println("总记录数："+page.getTotal());
        System.out.println("当前页码："+page.getPageNum());
        System.out.println("结果集："+page.getResult());
        List<Hotel> list = hotelMapper.selectAll();
        //pageInfo封装页面信息
        PageInfo pageInfo = new PageInfo(list);
        System.out.println("结果集:"+pageInfo.getList());
        System.out.println("当前页面："+pageInfo.getPageNum());
        System.out.println("总页数："+pageInfo.getPages());
        System.out.println("当前页面显示的数据条目："+pageInfo.getPageSize());
        System.out.println("下一页："+pageInfo.getNextPage());
        System.out.println("上一页："+pageInfo.getPrePage());
        System.out.println("是否有下一页："+pageInfo.isHasNextPage());
        System.out.println("是否有上一页："+pageInfo.isHasPreviousPage());
        return list;
    }

    @Override
    public PageInfo<Hotel> selectHotelList(Integer pageNum, Integer pageSize, Hotel hotel) {
        PageHelper.startPage(pageNum, pageSize);
        List<Hotel> list = hotelMapper.selectAll();
        PageInfo<Hotel> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Hotel selectbyName(String hotelName) {
        return hotelMapper.selectbyName(hotelName);
    }
}
