package com.neuedu.His02.controller;

import com.neuedu.His02.service.UserCenterService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserCenterController {

    @Autowired
    private UserCenterService service;


    @GetMapping("/userCenter/changePassword")
    public ResultUtil changePassword(@RequestParam Integer ID, @RequestParam String currentPass, @RequestParam String password, @RequestParam String checkPass) {
        System.out.println("The data coming in：" + ID + ", " + currentPass + ", " + password + ", " + checkPass);
        Integer code = EnumCode.OK.getValue();
        String msg = "Change password successfully";
        try {
            if (service.passwordIsRight(ID, currentPass) == null) {
                code = EnumCode.LOGIN_FAIL.getValue();
                msg = "Original password error";
            } else {
                service.changePassword(ID, password);
            }
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to change password";
        }

        return new ResultUtil(code, msg);
    }
}
