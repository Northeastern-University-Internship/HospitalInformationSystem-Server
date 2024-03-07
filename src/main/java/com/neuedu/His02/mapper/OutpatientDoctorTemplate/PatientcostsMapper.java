package com.neuedu.His02.mapper.OutpatientDoctorTemplate;

import com.neuedu.His02.entity.PatientCosts;
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
public interface PatientcostsMapper{
    public List<PatientCosts> selectAll(PatientCosts patientCosts);
    public PatientCosts selectById(PatientCosts patientCosts);
    public int add(PatientCosts patientCosts);
    public int update(PatientCosts patientCosts);
    public int delete(PatientCosts patientCosts);
}
