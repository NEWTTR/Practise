package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.pojo.Doctor;
import com.org.service.DoctorService;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("doctor")
public class DoctorController {

	@Autowired
	DoctorService doctorservice;
	
	@RequestMapping("listDoctor")
    public String listDoctor(Model model){
        List<Doctor> cs= doctorservice.list();
         
        // 放入转发参数
        model.addAttribute("cs", cs);
        // 放入jsp路径
        return "listDoctor";
    }
    
    @RequestMapping("toAddDoctor")
    public String toAddDoctor(){
    	return "addDoctor";
    }
    
   
     
    @RequestMapping("home")
    public String tohome(){
    	return "home";
    }
    
    @RequestMapping("addDoctor") 
    public String addDoctor(Model model,Doctor doctor){
        if(doctor != null){
            doctorservice.add(doctor);
        }
        return "redirect:/doctor/listDoctor";
    }
    
    @RequestMapping("queryDoctor") 
    public String queryDoctor(Model model,int d_num){
    	model.addAttribute("c",doctorservice.get(d_num));
        return "/updateDoctor";
    }
    
    @RequestMapping("updatedoctor")
    public String uodateDoctor(Model model,Doctor doctor){
    		doctorservice.update(doctor);
    		return "redirect:/doctor/listDoctor"; 
    }
    
    @RequestMapping("deleteDoctor") 
    public String deleteDoctor(int d_num){
    	doctorservice.delete(d_num);
        return "redirect:/doctor/listDoctor";
    }
    
    @RequestMapping("querysingle") 
    public String querysingle(Model model,int d_num){
    	model.addAttribute("c",doctorservice.get(d_num));
        return "queryDoctor";
    }
}
