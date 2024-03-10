package com.neuedu.His02.service.OutpatientDoctorTemplate;

import com.neuedu.His02.entity.Register;

import java.util.List;


public interface IRegisterService{
    public List<Register> selectAll(Register register);
    public Register selectById(Register register);
    public int add(Register register);
    public int update(Register register);
    public int delete(Register register);
}
