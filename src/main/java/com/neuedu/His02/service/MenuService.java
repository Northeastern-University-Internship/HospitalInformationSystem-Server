package com.neuedu.His02.service;

import com.neuedu.His02.entity.User;
import com.neuedu.His02.entity.menu.Menu;

import java.util.List;

public interface MenuService {
    public List<Menu> selectAll(User u);
}
