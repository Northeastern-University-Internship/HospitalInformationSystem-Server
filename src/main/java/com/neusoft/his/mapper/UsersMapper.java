package com.neusoft.his.mapper;

import com.neusoft.his.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yhc
 * @since 2024-01-15
 */
@Mapper
@Repository
public interface UsersMapper extends BaseMapper<Users> {
    @Insert(" insert into users(username,fullname,password,userType,department) values(#{username},#{fullname},#{password},#{userType},#{department})")
    public int insertIntoUsers(Users users);
}
