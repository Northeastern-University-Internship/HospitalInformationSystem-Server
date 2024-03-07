package com.neuedu.His02.controller.OutpatientDoctorTemplate;

import com.neuedu.His02.entity.PatientCosts;
import com.neuedu.His02.service.OutpatientDoctorTemplate.IPatientcostsService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PatientcostsController {
    @Autowired
    IPatientcostsService service;

    @RequestMapping("/getPatientCostAll")
    public ResultUtil getCheckTemplateAll(PatientCosts patientCosts) {
        List<PatientCosts> patientCostsList = service.selectAll(patientCosts);
        if (patientCostsList != null) {
            return new ResultUtil(EnumCode.OK.getValue(), "Success", patientCostsList);
        }
        return new ResultUtil(EnumCode.GONE.getValue(), "not available");
    }

}
