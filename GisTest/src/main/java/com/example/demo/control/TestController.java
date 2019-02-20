package com.example.demo.control;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Baidutest;
import com.example.demo.service.BaiduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    private JSONObject result = new JSONObject();

    @Autowired
    private BaiduService baiduService;

    @RequestMapping("/hello")
    public String hello(){
        return "Test";
    }

    @RequestMapping("/showBaidu")
    public Object showBaidu(){
        List<Baidutest> baidutest= baiduService.selectAll();
        result.put("msg",baidutest);
        return result;
    }
}
