package com.neusoft.his.service;

import com.neusoft.his.dto.Message;
import com.neusoft.his.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yhc
 * @since 2024-01-15
 */
public interface IUsersService extends IService<Users> {
    public Message login(Users user);
    public Message  insertUser(Users user);
}
