package com.example.demo.control;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Hotel;
import com.example.demo.service.HotelService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    private JSONObject result = new JSONObject();

    @Autowired
    private HotelService hotelService;

    @RequestMapping("/listhotel")
    public Object listhotel() {
        List<Hotel> hotellist = hotelService.selectAll();
        result.put("hotellist", hotellist);
        return result;
    }

    /*@RequestMapping("/pagehotel")
    public Object selectAllbyPage() {
        List<Hotel> list = hotelService.selectAllbyPage();
        PageInfo pageInfo = new PageInfo(list);
        //利用pageInfo封装的信息，向前台传输数据
        result.put("pageInfo", pageInfo);
        return result;
    }*/

    @RequestMapping("/pagehotel")
    public Object adminIndex(Hotel hotel,
                             @RequestParam(required=true,value="pageNum",defaultValue="1") Integer pageNum,
                             @RequestParam(required=true,value="pageSize",defaultValue="3") Integer pageSize){
        PageInfo<Hotel> pageInfo = hotelService.selectHotelList(pageNum, pageSize, hotel);
        result.put("pageInfo", pageInfo);
        return result;
    }

    @RequestMapping("/selecthotelbyid")
    public Object listhotel(@RequestParam(required=true,value="id")Integer HotelId) {
        Hotel hotel = hotelService.select(HotelId);
        result.put("hotel", hotel);
        return result;
    }

}
