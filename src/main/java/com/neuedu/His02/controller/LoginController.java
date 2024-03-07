package com.neuedu.His02.controller;

import com.neuedu.His02.entity.User;
import com.neuedu.His02.service.UserService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserService service;

    // http://localhost:8866/login?UserName=root&Password=root
    @RequestMapping("/login")
    public ResultUtil login(User u) {
        System.out.println("Receiving data from the front："+ u);
        System.out.println("Signed in");
//        return service.login(u);
        User loginUser = service.login(u);
        System.out.println("User read from database：" + loginUser);
        if (loginUser != null) {
            System.out.println("executed if");
            return new ResultUtil(EnumCode.OK.getValue(), "Login successfully", service.login(u));
        }
        return new ResultUtil(EnumCode.UNAUTHORIZED.getValue(), "Login Failed");
    }

    @RequestMapping("/logout")
    public ResultUtil logout() {
        return new ResultUtil(EnumCode.OK.getValue(), "Log out successfully");
    }
}
