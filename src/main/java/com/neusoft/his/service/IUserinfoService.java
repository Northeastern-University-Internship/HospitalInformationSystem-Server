package com.neusoft.his.service;

import com.neusoft.his.dto.Message;
import com.neusoft.his.entity.Userinfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yhc
 * @since 2024-01-13
 */
public interface IUserinfoService extends IService<Userinfo> {
    public Message verifyUserinfoFun3(Userinfo userinfo);
}
