package com.neuedu.His02.controller;

import com.neuedu.His02.entity.Department;
import com.neuedu.His02.entity.User;
import com.neuedu.His02.service.UserService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/queryUserAll")
    public ResultUtil getUserAll(User u) {
        List<User> userList = service.selectAll(u);
        if (userList != null) {
            return new ResultUtil(EnumCode.OK.getValue(), "Query successfully", userList);
        }
        return new ResultUtil(EnumCode.BAD_REQUEST.getValue(), "Query failure");
    }

    @RequestMapping("/queryUserDeptByID")
    public ResultUtil getUserDeptByID(User u) {
        Department department = service.selectDeptByID(u);
        if (department != null) {
            return new ResultUtil(EnumCode.OK.getValue(), "Query successfully", department);
        }
        return new ResultUtil(EnumCode.BAD_REQUEST.getValue(), "Query failure");
    }
}
