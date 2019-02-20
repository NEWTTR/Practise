package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.pojo.Register;
import com.org.service.RegisterService;


//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("register")
public class RegisterController {

	@Autowired
	RegisterService registerserivce;
	
	@RequestMapping("listRegister")
    public String listRegister(Model model){
        List<Register> cs= registerserivce.list();
         
        // 放入转发参数
        model.addAttribute("cs", cs);
        // 放入jsp路径
        return "listRegister";
    }
    
    @RequestMapping("toAddRegister")
    public String toAddRegister(){
    	return "addRegister";
    }
    
   
    @RequestMapping("home")
    public String tohome(){
    	return "home";
    }
    
    @RequestMapping("addRegister") 
    public String addRegister(Model model,Register register){
        if(register != null){
        	registerserivce.add(register);
        }
        return "redirect:/register/listRegister";
    }
    
    @RequestMapping("queryRegister") 
    public String queryRegister(Model model,int r_num){
    	model.addAttribute("c",registerserivce.get(r_num));
        return "/updateRegister";
    }
    
    @RequestMapping("updateregister")
    public String uodateRegister(Model model,Register register){
    	registerserivce.update(register);
    		return "redirect:/register/listRegister"; 
    }
    
    @RequestMapping("deleteRegister") 
    public String deleteRegister(int p_num){
    	registerserivce.delete(p_num);
        return "redirect:/register/listRegister";
    }
    
    @RequestMapping("querysingle") 
    public String querysingle(Model model,int r_num){
    	model.addAttribute("c",registerserivce.get(r_num));
        return "queryRegister";
    }
}
