package com.neuedu.His02.service.Register;

import com.neuedu.His02.entity.PatientCosts;

import java.util.List;

/**
 * @Author: ZJH
 * @Date: 2021/12/22/15:43
 * @Description:
 */
public interface RegisteredTollCollectorService {
    public List<PatientCosts> selectAll(PatientCosts u);
}
