package com.neuedu.His02.service.Register;

import com.neuedu.His02.entity.PatientCosts;

import java.util.List;


public interface RegisteredTollCollectorService {
    public List<PatientCosts> selectAll(PatientCosts u);
}
