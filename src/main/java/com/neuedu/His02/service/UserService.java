package com.neuedu.His02.service;

import com.neuedu.His02.entity.Department;
import com.neuedu.His02.entity.User;

import java.util.List;

public interface UserService {
    public List<User> selectAll(User u);
    public User selectById(User u);
    public int add(User u);
    public int update(User u);
    public int delete(User u);

    public User login(User u);
    public Department selectDeptByID(User u);
}
