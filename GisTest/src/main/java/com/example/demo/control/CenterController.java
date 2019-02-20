package com.example.demo.control;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.CenterMapper;
import com.example.demo.entity.Center;
import com.example.demo.service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CenterController {

    @Autowired
    private CenterService centerService;

    private JSONObject result = new JSONObject();

    @RequestMapping("/listcenter")
    public Object listcenter() {
        List<Center> centerlist = centerService.selectAll();
        result.put("centerlist", centerlist);
        return result;
    }
}
