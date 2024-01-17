package com.neusoft.his.mapper;

import com.neusoft.his.entity.Userinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yhc
 * @since 2024-01-13
 */
@Mapper
@Repository
public interface UserinfoMapper extends BaseMapper<Userinfo> {

}
