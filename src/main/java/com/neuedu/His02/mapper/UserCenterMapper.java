package com.neuedu.His02.mapper;

import com.neuedu.His02.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserCenterMapper {
    public User passwordIsRight(Integer ID, String password);
    public void changePassword(Integer ID, String password);
}
