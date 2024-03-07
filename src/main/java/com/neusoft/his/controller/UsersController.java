package com.neusoft.his.controller;


import com.neusoft.his.dto.Message;
import com.neusoft.his.entity.Users;
import com.neusoft.his.service.IUsersService;
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
 * @since 2024-01-15
 */
@RestController
@RequestMapping("/his/users")
public class UsersController {
    @Autowired
    IUsersService iUsersService;

    @PostMapping("login")
    public Message login3(@RequestBody Users user){
        Message message=iUsersService.login(user);
        return message;
    }
    @PostMapping("signup")
    public Message insertUser(@RequestBody  Users user){
        System.out.println("Register called");
        Message message=iUsersService.insertUser(user);
        System.out.println("Success....");
        return message;
    }
}

