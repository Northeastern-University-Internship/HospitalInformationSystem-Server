package com.neusoft.his.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.neusoft.his.dto.LoginUserinfoBean;
import com.neusoft.his.dto.Message;
import com.neusoft.his.entity.Userinfo;
import com.neusoft.his.mapper.UserinfoMapper;
import com.neusoft.his.service.IUserinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yhc
 * @since 2024-01-13
 */
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements IUserinfoService {

    @Autowired
    UserinfoMapper userinfoMapper;
    @Override
    public Message verifyUserinfoFun3(Userinfo userinfo) {
        Message message=new Message();
        LoginUserinfoBean loginUserinfoBean=new LoginUserinfoBean();
        loginUserinfoBean.setUsername(userinfo.getUsername());
        loginUserinfoBean.setPassword(userinfo.getPassword());
        QueryWrapper<Userinfo> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("username",loginUserinfoBean.getUsername())
                .eq("password",loginUserinfoBean.getPassword()).eq("status",1);
        Userinfo userinfoResult=null;
        int flag=0;
        try {
            userinfoResult = userinfoMapper.selectOne(queryWrapper);
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
}
