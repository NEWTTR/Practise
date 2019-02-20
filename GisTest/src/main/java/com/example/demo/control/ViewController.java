package com.example.demo.control;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/GisMarkerTest")
    public String  toGisMarkerTest(){
        return "GisMarkerTest";
    }

    @RequestMapping("/home")
    public String  toHome(){
        return "home";
    }

    @RequestMapping("/touristspots")
    public String  toTouristspots(){
        return "touristspots";
    }

    @RequestMapping("/rhconfirm")
    public String  toRhconfirm(){
        return "rhconfirm";
    }

    @RequestMapping("/deeplydiy")
    public String  toDeeplydiy(){
        return "deeplydiy";
    }

    @RequestMapping("/success")
    public String  toSuccess(){
        return "success";
    }

    @RequestMapping("/login")
    public String  toLogin(){
        return "login";
    }

    @RequestMapping("/finalcheck")
    public String  toFinalcheck(){
        return "finalcheck";
    }

    @RequestMapping("/personorder")
    public String toPersonorder(){
        return "personorder";
    }
}
