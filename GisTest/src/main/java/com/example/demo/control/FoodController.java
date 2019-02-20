package com.example.demo.control;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Food;
import com.example.demo.service.FoodService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {

    @Autowired
    private FoodService foodService;

    private JSONObject result = new JSONObject();

    @RequestMapping("/listfood")
    public Object listcenter() {
        List<Food> foodlist = foodService.selectAll();
        result.put("foodlist", foodlist);
        return result;
    }

    @RequestMapping("/pagefood")
    public Object adminIndex(Food food,
                             @RequestParam(required=true,value="pageNum",defaultValue="1") Integer pageNum,
                             @RequestParam(required=true,value="pageSize",defaultValue="3") Integer pageSize){
        PageInfo<Food> foodpageInfo = foodService.selectFoodList(pageNum, pageSize, food);
        result.put("foodpageInfo", foodpageInfo);
        return result;
    }
}
