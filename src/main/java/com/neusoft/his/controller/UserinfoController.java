package com.neusoft.his.controller;


import com.neusoft.his.dto.Message;
import com.neusoft.his.entity.Userinfo;
import com.neusoft.his.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yhc
 * @since 2024-01-13
 */
@RestController
@RequestMapping("/his/userinfo")
public class UserinfoController {
    @Autowired
    IUserinfoService iUserinfoService;

    @PostMapping("login")
    public Message login3(@RequestBody Userinfo userinfo){
        System.out.println("Function called...");
        Message message=iUserinfoService.verifyUserinfoFun3(userinfo);
        System.out.println("F U");
        return message;
    }
}

