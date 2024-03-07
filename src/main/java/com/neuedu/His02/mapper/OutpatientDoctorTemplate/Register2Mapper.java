package com.neuedu.His02.mapper.OutpatientDoctorTemplate;

import com.neuedu.His02.entity.Register;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author BRThree
 * @since 2021-12-21
 */
@Mapper
public interface Register2Mapper {
    public List<Register> selectAll(Register register);
    public Register selectById(Register register);
    public int add(Register register);
    public int update(Register register);
    public int delete(Register register);

}
