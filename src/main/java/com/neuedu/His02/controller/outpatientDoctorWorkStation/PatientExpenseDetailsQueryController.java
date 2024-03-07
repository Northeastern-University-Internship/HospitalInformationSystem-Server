package com.neuedu.His02.controller.outpatientDoctorWorkStation;

import com.neuedu.His02.entity.PatientCosts;
import com.neuedu.His02.entity.Register;
import com.neuedu.His02.entity.User;
import com.neuedu.His02.service.outpatientDoctorWorkStationService.PatientExpenseDetailsQueryService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class PatientExpenseDetailsQueryController {

    @Autowired
    private PatientExpenseDetailsQueryService service;


    @PostMapping("/outpatientDoctorWorkStation/patientExpenseDetailsQuery/initPatients")
    public ResultUtil initPatients(@RequestBody User user) {
        System.out.println("Begin to initialize the patient to be inquired about the cost details, and the doctor's information:" + user);
        List<Register> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Initialized patient data for query charge details successfully";
        try {
            result = service.initPatients(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to initialize patient data for query charge details";
        }
        return new ResultUtil(code, msg, result);
    }


    @RequestMapping("/outpatientDoctorWorkStation/patientExpenseDetailsQuery/searchByName")
    public ResultUtil searchByName(Register user) {
        System.out.println("The name of the search：" + user);
        List<Register> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Initialized patient data for query charge details successfully";
        try {
            result = service.searchByName(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Search Failure";
        }
        System.out.println("The results of the search：" + result);
        return new ResultUtil(code, msg, result);
    }


    @RequestMapping("/outpatientDoctorWorkStation/patientExpenseDetailsQuery/searchByNumber")
    public ResultUtil searchByNumber(Register user) {
        System.out.println("The name of the search：" + user);
        List<Register> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Search Success";
        try {
            result = service.searchByNumber(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Search Failure";
        }
        System.out.println("The results of the search：" + result);
        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/patientExpenseDetailsQuery/choosePatient")
    public ResultUtil choosePatient(@RequestBody Register register) {
        System.out.println("Patient registration information：" + register);
        List<PatientCosts> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Initialize Cost Breakdown Successfully";
        try {
            result = service.choosePatient(register);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to initialize cost breakdown";
        }
        return new ResultUtil(code, msg, result);
    }

}
