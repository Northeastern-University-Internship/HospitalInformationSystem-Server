package com.neuedu.His02.service;

import com.neuedu.His02.entity.User;

public interface UserCenterService {
    public User passwordIsRight(Integer ID, String password);
    public void changePassword(Integer ID, String password);
}
