package com.neuedu.His02.service.OutpatientMedicalTechnologyWorkstation;

import com.neuedu.His02.entity.CheckApply;

import java.util.List;

public interface InspectionAndTestRegisterService {
    public List<CheckApply> selectAll(CheckApply CheckApply);
    public int updateState(CheckApply CheckAppl);
}
