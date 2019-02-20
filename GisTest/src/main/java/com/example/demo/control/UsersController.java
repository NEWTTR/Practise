package com.example.demo.control;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Users;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    private JSONObject result = new JSONObject();

    @RequestMapping("/selectbyuserName")
    public Object selectbyuserName(@RequestParam(required = true,value = "userName") String userName){
        Users user = usersService.selectbyuserName(userName);
        result.put("user",user);
        return result;
    }
}
