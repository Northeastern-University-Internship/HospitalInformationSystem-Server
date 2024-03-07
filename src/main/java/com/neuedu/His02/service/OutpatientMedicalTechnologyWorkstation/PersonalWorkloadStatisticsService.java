package com.neuedu.His02.service.OutpatientMedicalTechnologyWorkstation;


import com.neuedu.His02.entity.CheckApply;

import java.util.List;

/**
 * @Author: ZJH
 * @Date: 2021/12/24/12:58
 * @Description:
 */
public interface PersonalWorkloadStatisticsService {
    public List<CheckApply> selectAll(CheckApply u);
    public CheckApply selectByID();
}
