package com.neuedu.His02.service.OutpatientDoctorTemplate;

import com.neuedu.His02.entity.Register;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author BRThree
 * @since 2021-12-21
 */
public interface IRegisterService{
    public List<Register> selectAll(Register register);
    public Register selectById(Register register);
    public int add(Register register);
    public int update(Register register);
    public int delete(Register register);
}
