package com.neusoft.his;

import com.neusoft.his.dto.LoginUserinfoBean;
import com.neusoft.his.dto.Message;
import com.neusoft.his.entity.Userinfo;
import com.neusoft.his.mapper.UserinfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@SpringBootTest
class HisApplicationTests {
    @Autowired
    UserinfoMapper userinfoMapper;
    private LoginUserinfoBean inputUsernamePassword(){
        LoginUserinfoBean loginUserinfoBean=new LoginUserinfoBean();
        Scanner scanner=new Scanner(System.in);
        String username="tom";
        String password="123456";
//        System.out.println("Input Username:");
//        username=scanner.next();
//        System.out.println("Input Password:");
//        password=scanner.next();
        loginUserinfoBean.setUsername(username);
        loginUserinfoBean.setPassword(password);
        return loginUserinfoBean;
    }

    @Test
    void contextLoads() {
    }
    @Test
    public void test1004(){
        Message message=new Message();
        LoginUserinfoBean loginUserinfoBean=inputUsernamePassword();
        Map loginUserinfoMap=new HashMap();
        loginUserinfoMap.put("username",loginUserinfoBean.getUsername());
        loginUserinfoMap.put("password",loginUserinfoBean.getPassword());

        //
        List<Userinfo> list=userinfoMapper.selectByMap(loginUserinfoMap);

        if(list.size()<1){
            message.setStatusCode(400);
            message.setMsg("Error username or password");
        }else if(list.size()==1){
            Userinfo u1=list.get(0);
            if(u1.getStatus()==1){
                message.setStatusCode(200);
                message.setMsg("ok");
                message.setObj(u1);
            }else if(u1.getStatus()==0){
                message.setStatusCode(501);
                message.setMsg("Contact to system admin");
                message.setObj(u1);
            }
        }else{
            message.setStatusCode(500);
            message.setMsg("system error");
        }

        System.out.println(message);

    }

}
