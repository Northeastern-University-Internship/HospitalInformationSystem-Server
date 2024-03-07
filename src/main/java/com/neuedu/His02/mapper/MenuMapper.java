package com.neuedu.His02.mapper;

import com.neuedu.His02.entity.User;
import com.neuedu.His02.entity.menu.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    public List<Menu> selectAll(User u);
}
