package com.example.demo.control;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Sight;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SightController {

    private JSONObject result = new JSONObject();

    @Autowired
    private SightService sightService;

    @Autowired
    private CenterService centerService;

    @Autowired
    private HotelService hotelService;

    @Autowired
    private FoodService foodService;

    @Autowired
    private TrainService trainService;

    @ResponseBody
    @RequestMapping("/listsightbysightClicks")
    public Object listsightbysightClicks() {
        List<Sight> sightlist = sightService.selectAllbysightClicks();
        result.put("sightlist", sightlist);
        return result;
    }

    @ResponseBody
    @RequestMapping("/listsight")
    public Object listsight() {
        List<Sight> sightlist = sightService.selectAll();
        result.put("sightlist", sightlist);
        return result;
    }

    @ResponseBody
    @RequestMapping("/sightsearch")
    public Object sightsearch(@RequestParam(required=true,value="searchname",defaultValue="平江路") String searchname) {
        List<Sight> sightlist = sightService.selectOnebyName(searchname);
        result.put("sightlist", sightlist);
        return result;
    }

    @ResponseBody
    @RequestMapping("/sightbylonglat")
    public Object sightsearchbylonglat(@RequestParam(required=true,value="sightLongitude",defaultValue="120.635703") Double sightLongitude, @RequestParam(required=true,value="sightLatitude",defaultValue="31.330247") Double sightLatitude) {
        Sight sight = sightService.selectbylonglat(sightLongitude,sightLatitude);
        result.put("sight", sight);
        return result;
    }

    @ResponseBody
    @RequestMapping("/listbyname")
    public Object example(@RequestParam(value = "Names", required = true/*,defaultValue = "平江路,留园,拙政园"*/) String[] Names){
        System.out.println("选中长度为:" + Names.length);
        List sight = new ArrayList();
        List center = new ArrayList();
        List train = new ArrayList();
        if(centerService.selectbyName(Names[0]) == null){
            train.add(trainService.selectbyName(Names[0]));
        }else{
            center.add(centerService.selectbyName(Names[0]));
        }
        for(int i = 1; i < Names.length; i++){
            sight.add(sightService.selectbyName(Names[i]));
        }
        result.put("sight",sight);
        result.put("center",center);
        result.put("train",train);
        return result;
    }

    @ResponseBody
    @RequestMapping("/listbynames")
    public Object listbynames(@RequestParam(value = "Names", required = true/*,defaultValue = "平江路,留园,拙政园"*/) String[] Names,
                              @RequestParam(value = "HotelNames", required = true) String[] HotelNames,
                              @RequestParam(value = "FoodNames", required = true) String[] FoodNames){
        /*System.out.println("选中长度为:" + Names.length);*/
        List sight = new ArrayList();
        List hotel = new ArrayList();
        List food = new ArrayList();
        for(int i = 1; i < Names.length; i++){
            sight.add(sightService.selectbyName(Names[i]));
        }
        for(int i = 0; i < HotelNames.length; i++){
            hotel.add(hotelService.selectbyName(HotelNames[i]));
        }
        for(int i = 0; i < FoodNames.length; i++){
            food.add(foodService.selectbyName(FoodNames[i]));
        }
        result.put("sight",sight);
        result.put("hotel",hotel);
        result.put("food",food);
        return result;
    }
}
