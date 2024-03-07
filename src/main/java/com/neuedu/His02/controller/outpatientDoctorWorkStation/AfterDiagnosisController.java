package com.neuedu.His02.controller.outpatientDoctorWorkStation;

import com.neuedu.His02.entity.MedicalRecord;
import com.neuedu.His02.entity.Register;
import com.neuedu.His02.entity.User;
import com.neuedu.His02.service.outpatientDoctorWorkStationService.AfterDiagnosisService;
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
public class AfterDiagnosisController {

    @Autowired
    private AfterDiagnosisService service;


    @PostMapping("/outpatientDoctorWorkStation/afterDiagnosis/initPatients")
    public ResultUtil initPatients(@RequestBody User user) {
        System.out.println("Begin to initialize the patient to be treated, and the doctor's information comes:" + user);
        List<Register> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Patient data initialized successfully";
        try {
            result = service.initPatients(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to initialize pending patient data";
        }
        return new ResultUtil(code, msg, result);
    }


    @RequestMapping("/outpatientDoctorWorkStation/afterDiagnosis/searchByName")
    public ResultUtil searchByName(Register user) {
        System.out.println("Name of the search:：" + user);
        List<Register> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Search Success";
        try {
            result = service.searchByName(user);
            System.out.println("Results of the search：" + result);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Search Failure";
        }
        return new ResultUtil(code, msg, result);
    }


    @RequestMapping("/outpatientDoctorWorkStation/afterDiagnosis/searchByNumber")
    public ResultUtil searchByNumber(Register user) {
        System.out.println("Name of the search：" + user);
        List<Register> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Search Success";
        try {
            result = service.searchByNumber(user);
            System.out.println("results of the search：" + result);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Search Failure";
        }
        return new ResultUtil(code, msg, result);
    }


    @RequestMapping("/outpatientDoctorWorkStation/afterDiagnosis/initRecord")
    public ResultUtil initRecord(MedicalRecord user) {
        System.out.println("Initialized Medical Records Patients：" + user);
        MedicalRecord result = new MedicalRecord();
        Integer code = EnumCode.OK.getValue();
        String msg = "page has been moved to the homepage";
        try {
            result = service.getRecord(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to load the first page of medical records to be diagnosed";
        }
        return new ResultUtil(code, msg, result);
    }




    @RequestMapping("/outpatientDoctorWorkStation/afterDiagnosis/commitEndPatient")
    public ResultUtil commitEndPatient(Register register) {
        System.out.println("Patients who are about to be diagnosed：" + register);
        Integer code = EnumCode.OK.getValue();
        String msg = "Patient is completed.";
        try {
            service.commitEndPatient(register);
        } catch (Exception e) {
            code = EnumCode.INTERNAL_SERVER_ERROR.getValue();
            msg = "patient failed diagnosis.";
        }

        return new ResultUtil(code, msg);
    }


    @RequestMapping("/outpatientDoctorWorkStation/afterDiagnosis/commitEndMedicalRecord")
    public ResultUtil commitEndMedicalRecord(MedicalRecord medicalRecord) {
        System.out.println("Medical record that is about to be diagnosed.：" + medicalRecord);
        Integer code = EnumCode.OK.getValue();
        String msg = "Medical records complete";
        try {
            service.commitEndMedicalRecord(medicalRecord);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failure of medical records";
        }

        return new ResultUtil(code, msg);
    }
}
