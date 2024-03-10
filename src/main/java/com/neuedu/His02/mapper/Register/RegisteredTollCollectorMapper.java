package com.neuedu.His02.mapper.Register;

import com.neuedu.His02.entity.PatientCosts;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface RegisteredTollCollectorMapper {

    public List<PatientCosts> selectAll(PatientCosts u);
}
