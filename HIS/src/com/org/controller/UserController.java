package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.pojo.User;
import com.org.service.UserService;



//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userservice;
	
	
	  @RequestMapping("toAddUser")
	    public String toAddUser(){
	    	return "addUser";
	    }
	    
	
	@RequestMapping("addUser") 
    public String addUser(Model model,User user){
        if(user != null){
            userservice.add(user);
        }
        return "redirect:/user/login";
    }
	
	
	@RequestMapping("login")
    public String tologin(){
    	return "login";
    }
	@RequestMapping("queryUser") 
    public String queryUser(Model model,String username,String password){
    	model.addAttribute("c",userservice.get(username,password));
        return "redirect:/home";
    }
}
