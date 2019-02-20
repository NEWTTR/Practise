package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.pojo.Medicine;
import com.org.service.MedicineService;




// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class MedicineController {
	@Autowired
    MedicineService medicineservice;
 
    @RequestMapping("listMedicine")
    public ModelAndView listMedicine(){
        ModelAndView mav = new ModelAndView();
        List<Medicine> cs= medicineservice.list();
         
        // 放入转发参数
        mav.addObject("cs", cs);
        // 放入jsp路径
        mav.setViewName("listMedicine");
        return mav;
    }
    
    @RequestMapping("toAddMedicine")
    public String toAddMedicine(){
    	return "addMedicine";
    }
    
   
     
    @RequestMapping("home")
    public String tohome(){
    	return "home";
    }
    
    @RequestMapping("addMedicine") 
    public String addMedicine(Model model,Medicine medicine){
        if(medicine != null){
            medicineservice.add(medicine);
        }
        return "redirect:/listMedicine";
    }
    
    @RequestMapping("queryMedicine") 
    public String queryMedicine(Model model,int m_num){
    	model.addAttribute("c",medicineservice.get(m_num));
        return "/updateMedicine";
    }
    
    @RequestMapping("updatemedicine")
    public String uodateMedicine(Model model,Medicine medicine){
    		medicineservice.update(medicine);
    		return "redirect:/listMedicine"; 
    }
    
    @RequestMapping("deleteMedicine") 
    public String deleteMedicine(int m_num){
    	medicineservice.delete(m_num);
        return "redirect:/listMedicine";
    }
    
    @RequestMapping("querysingle") 
    public String querysingle(Model model,int m_num){
    	model.addAttribute("c",medicineservice.get(m_num));
        return "/queryMedicine";
    }
}


