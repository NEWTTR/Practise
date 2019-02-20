package com.example.demo.control;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/insert")
    public void insert(User user){
        userService.insert(user);
    }
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable("id")  int id){
        userService.delete(id);
    }
    @RequestMapping("/update")
    public void update(User user){
        userService.update(user);
    }
    @RequestMapping("/select/{id}")
    public User select(@PathVariable("id") int id){
        return userService.select(id);
    }
    @RequestMapping("/selectAll")
    public List<User> selectAll(){
        return userService.selectAll();
    }

    private JSONObject result = new JSONObject();

    @RequestMapping("/userLogin")
    public Object login(String username, String password, HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = userService.selectbyname(username);
        if(user == null){
            result.put("msg","用户不存在");
            return result;
        }
        else if(!password.equals(user.getPassword())){
            result.put("msg","密码错误");
            return result;
        }
        result.put("msg","SUCCESS");
        session.setAttribute("user_username",user.getUsername());
        return result;
    }
}
