package com.neusoft.his.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.neusoft.his.dto.LoginUserinfoBean;
import com.neusoft.his.dto.Message;
import com.neusoft.his.entity.Users;
import com.neusoft.his.mapper.UsersMapper;
import com.neusoft.his.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yhc
 * @since 2024-01-15
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {
    @Autowired
    UsersMapper usersMapper;
    @Override
    public Message login(Users user) {
        Message message=new Message();
        LoginUserinfoBean loginUserinfoBean=new LoginUserinfoBean();
        loginUserinfoBean.setUsername(user.getUsername());
        loginUserinfoBean.setPassword(user.getPassword());
        QueryWrapper<Users> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("username",loginUserinfoBean.getUsername())
                .eq("password",loginUserinfoBean.getPassword());
        Users userinfoResult=null;
        int flag=0;
        try {
            userinfoResult = usersMapper.selectOne(queryWrapper);
        }catch (Exception e){
            flag=1;
            message.setStatusCode(500);
            message.setMsg(e.getMessage());

        }
        if(flag==1){
            return message;
        }
        if(userinfoResult==null){
            message.setStatusCode(400);
            message.setMsg("Error username or password");
        }else{

            message.setStatusCode(200);
            message.setMsg("ok");
            message.setObj(userinfoResult);
        }


        return message;
    }



    @Override
    public Message insertUser(Users user) {
        Message message=new Message();

        int num = usersMapper.insertIntoUsers(user);

        if(num==1){
            message.setStatusCode(200);
            message.setMsg("ok");
        }else{
            message.setStatusCode(500);
            message.setMsg("error");

        }
        return message;
    }
}
