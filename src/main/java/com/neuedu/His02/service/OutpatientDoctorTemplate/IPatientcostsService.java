package com.neuedu.His02.service.OutpatientDoctorTemplate;

import com.neuedu.His02.entity.PatientCosts;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author BRThree
 * @since 2021-12-21
 */
public interface IPatientcostsService {
    public List<PatientCosts> selectAll(PatientCosts patientCosts);
    public PatientCosts selectById(PatientCosts patientCosts);
    public int add(PatientCosts patientCosts);
    public int update(PatientCosts patientCosts);
    public int delete(PatientCosts patientCosts);
}
