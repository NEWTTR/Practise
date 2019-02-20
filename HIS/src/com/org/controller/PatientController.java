package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.pojo.Doctor;
import com.org.pojo.Patient;
import com.org.service.PatientService;


//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("patient")
public class PatientController {

	@Autowired
	PatientService patientservice;
	
	@RequestMapping("listPatient")
    public String listPatient(Model model){
        List<Patient> cs= patientservice.list();
         
        // 放入转发参数
        model.addAttribute("cs", cs);
        // 放入jsp路径
        return "listPatient";
    }
    
    @RequestMapping("toAddPatient")
    public String toAddPatient(){
    	return "addPatient";
    }
    
    
     
    @RequestMapping("home")
    public String tohome(){
    	return "home";
    }
    
    @RequestMapping("addPatient") 
    public String addPatient(Model model,Patient patient){
        if(patient != null){
            patientservice.add(patient);
        }
        return "redirect:/patient/listPatient";
    }
    
    @RequestMapping("queryPatient") 
    public String queryPatient(Model model,int p_num){
    	model.addAttribute("c",patientservice.get(p_num));
        return "/updatePatient";
    }
    
    @RequestMapping("updatepatient")
    public String uodatePatient(Model model,Patient patient){
    		patientservice.update(patient);
    		return "redirect:/patient/listPatient"; 
    }
    
    @RequestMapping("deletePatient") 
    public String deletePatient(int p_num){
    	patientservice.delete(p_num);
        return "redirect:/patient/listPatient";
    }
    
    @RequestMapping("querysingle") 
    public String querysingle(Model model,int p_num){
    	model.addAttribute("c",patientservice.get(p_num));
        return "queryPatient";
    }
    
    @RequestMapping("queryTotal") 
    public String querytotal(Model model,Patient patient){
    	int m = patientservice.count();
    	model.addAttribute("c",m);	
		return "listTotal";  	
    }
    
    @RequestMapping("listTotal")
    public String listTotal(Model model){
    	int m = patientservice.count();
    	model.addAttribute("c",m);	
        // 放入jsp路径
        return "listTotal";
    }
}
