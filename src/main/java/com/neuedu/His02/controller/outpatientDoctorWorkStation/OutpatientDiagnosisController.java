package com.neuedu.His02.controller.outpatientDoctorWorkStation;

import com.neuedu.His02.entity.*;
import com.neuedu.His02.entity.diagnosisTemplate.DiagnosisTemplate;
import com.neuedu.His02.service.outpatientDoctorWorkStationService.OutpatientDiagnosisServer;
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
public class OutpatientDiagnosisController {
    @Autowired
    private OutpatientDiagnosisServer service;

    @PostMapping("/outpatientDoctorWorkStation/outpatientDiagnosis/initPatients")
    public ResultUtil initPatients(@RequestBody User user) {
        System.out.println("Starting to initialize the patient, came the doctor's message:" + user);
        List<Register> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Patient data initialized successfully";
        try {

            List<Register> temp = service.initPatients(user);
            for (int i=0; i<temp.size(); i++) {

                if (service.recordIsExist(temp.get(i)) != null) {
                    result.add(temp.get(i));
                }
            }
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to initialize patient data";
        }

        return new ResultUtil(code, msg, result);
    }


    @RequestMapping("/outpatientDoctorWorkStation/outpatientDiagnosis/searchByName")
    public ResultUtil searchByName(Register user) {
        System.out.println("The name of the search：" + user);
        List<Register> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Search Success";
        try {
            result = service.searchByName(user);
            System.out.println("The results of the search：" + result);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Search Failure";
        }

        return new ResultUtil(code, msg, result);
    }


    @RequestMapping("/outpatientDoctorWorkStation/outpatientDiagnosis/searchByNumber")
    public ResultUtil searchByNumber(Register user) {
        System.out.println("The name of the search：" + user);
        List<Register> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Search Success";
        try {
            result = service.searchByNumber(user);
            System.out.println("The results of the search：" + result);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Search Failure";
        }

        return new ResultUtil(code, msg, result);
    }


    @RequestMapping("/outpatientDoctorWorkStation/outpatientDiagnosis/initRecord")
    public ResultUtil initRecord(MedicalRecord user) {
        System.out.println("Initialized Medical Records Patients：" + user);
        MedicalRecord result = new MedicalRecord();
        Integer code = EnumCode.OK.getValue();
        String msg = "Outpatient Medical Records Home Page Loaded";
        try {
            result = service.getRecord(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to load Outpatient Medical Record Front Page";
        }
        return new ResultUtil(code, msg, result);
    }


    @RequestMapping("/outpatientDoctorWorkStation/outpatientDiagnosis/initCheckResult")
    public ResultUtil initCheckResult(MedicalRecord user) {
        System.out.println("Initial Patient Check：" + user);
        List<CheckApply> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "All patient test results loaded";
        try {
            result = service.getCheckResult(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failure to load all patient test results";
        }
        return new ResultUtil(code, msg, result);
    }


    @RequestMapping("/outpatientDoctorWorkStation/outpatientDiagnosis/initDealResult")
    public ResultUtil initDealResult(MedicalRecord user) {
        System.out.println("Initial Patient Check：" + user);
        List<CheckApply> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "All patient test results loaded";
        try {
            result = service.getDealResult(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failure to load all patient test results";
        }
        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/outpatientDiagnosis/getDiagnosisTemplatePersonally")
    public ResultUtil getRecordTemplatePersonally(@RequestBody User user) {
        System.out.println("user = " + user);
        List<DiagnosisTemplate> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Generate Personal Diagnostic Template Successfully";
        try {
            result = service.getDiagnosisTemplatePersonally(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to generate Personal Diagnostic Template";
        }
        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/outpatientDiagnosis/getDiagnosisTemplateByDepartment")
    public ResultUtil getRecordTemplateByDepartment(@RequestBody User user) {
        System.out.println("user = " + user);
        List<DiagnosisTemplate> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Generate department diagnostic template successfully";
        try {
            result = service.getDiagnosisTemplateByDepartment(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to generate department diagnostic template";
        }
        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/outpatientDiagnosis/getDiagnosisTemplateByHospital")
    public ResultUtil getRecordTemplateByHospital() {
        List<DiagnosisTemplate> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Hospital-wide diagnostic template generated successfully";
        try {
            result = service.getDiagnosisTemplateByHospital();
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to generate hospital-wide diagnostic template";
        }
        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/outpatientDiagnosis/deleteDiagnosisTemplate")
    public ResultUtil deleteRecordTemplate(@RequestBody DiagnosisTemplate diagnosisTemplate) {
        Integer code = EnumCode.OK.getValue();
        String msg = "Deleted successfully.";
        try {
            service.deleteDiagnosisTemplate(diagnosisTemplate);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Delete Failed";
        }

        return new ResultUtil(code, msg);
    }


    @RequestMapping("/outpatientDoctorWorkStation/outpatientDiagnosis/commitTemplate")
    public ResultUtil commitTemplate(DiagnosisTemplate diagnosisTemplate) {
        System.out.println("Templates to be added：" + diagnosisTemplate);
        Integer code = EnumCode.OK.getValue();
        String msg = "Added Success";
        try {
            service.commitTemplate(diagnosisTemplate);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Add Failure";
        }

        return new ResultUtil(code, msg);
    }


    @RequestMapping("/outpatientDoctorWorkStation/outpatientDiagnosis/confirm")
    public ResultUtil confirm(MedicalRecord medicalRecord) {
        System.out.println("Medical Record Information to be Updated：" + medicalRecord);
        Integer code = EnumCode.OK.getValue();
        String msg = "Update Successful";
        try {
            service.confirm(medicalRecord);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed update";
        }

        return new ResultUtil(code, msg);
    }

    @PostMapping("/outpatientDoctorWorkStation/outpatientDiagnosis/diseaseCategory")
    public ResultUtil diseaseCategory() {
        List<DiseCategory> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Disease Type Inquiry Successful";
        try {
            result = service.diseaseCategory();
            System.out.println("Type of disease：" + result);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failure to query the type of disease";
        }

        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/outpatientDiagnosis/initDiseasePrepare")
    public ResultUtil initDiseasePrepare() {
        List<String> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Disease generation success";
        try {
            result = service.initDiseasePrepare();
            System.out.println("Diseases found.：" + result);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failure to generate disease";
        }

        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/outpatientDiagnosis/initCategoryDiseasePrepare")
    public ResultUtil initCategoryDiseasePrepare() {
        List<String> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Generation of disease types successfully";
        try {
            result = service.initCategoryDiseasePrepare();
            System.out.println("The type of disease found：" + result);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failure to generate disease type";
        }

        return new ResultUtil(code, msg, result);
    }
}
