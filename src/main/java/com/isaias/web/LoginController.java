package com.isaias.web;

import com.isaias.entity.User;
import com.isaias.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class LoginController {
    @Resource
    private UserService userService;

    @RequestMapping("/login.do")
    public Object login(String name,String password){
        try {
            User user=userService.login(name, password);
            return "/index.jsp";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
