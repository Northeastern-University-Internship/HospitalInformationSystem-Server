package com.neuedu.His02.service.OutpatientMedicalTechnologyWorkstation;


import com.neuedu.His02.entity.CheckApply;

import java.util.List;


public interface PersonalWorkloadStatisticsService {
    public List<CheckApply> selectAll(CheckApply u);
    public CheckApply selectByID();
}
