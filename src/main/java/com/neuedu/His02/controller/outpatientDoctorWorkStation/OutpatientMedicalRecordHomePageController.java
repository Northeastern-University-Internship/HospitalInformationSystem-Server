package com.neuedu.His02.controller.outpatientDoctorWorkStation;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.neuedu.His02.entity.MedicalRecord;
import com.neuedu.His02.entity.Register;
import com.neuedu.His02.entity.User;
import com.neuedu.His02.entity.recordTemplate.RecordTemplate;
import com.neuedu.His02.service.outpatientDoctorWorkStationService.OutpatientMedicalRecordHomePageService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
public class OutpatientMedicalRecordHomePageController {

    @Autowired
    private OutpatientMedicalRecordHomePageService service;


    @PostMapping("/outpatientDoctorWorkStation/outpatientMedicalRecordHomePage/initPatients")
    public ResultUtil initPatients(@RequestBody User user) {
        System.out.println("Starting to initialize the patient, came the doctor's message:" + user);
        List<Register> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Patient data initialized successfully";
        try {
            result = service.initPatients(user);
        } catch (Exception e) {
            code = EnumCode.INTERNAL_SERVER_ERROR.getValue();
            msg = "Failed to initialize patient data";
        }

        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/outpatientMedicalRecordHomePage/initHistoryPatients")
    public ResultUtil initHistoryPatients(@RequestBody User user) {
        System.out.println("After the initial diagnosis of the patient, the doctor sent the following information:" + user);
        List<Register> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Patient data initialized successfully.";
        try {
            result = service.initHistoryPatients(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to initialize patient data";
        }
        return new ResultUtil(code, msg, result);
    }


    @RequestMapping("/outpatientDoctorWorkStation/outpatientMedicalRecordHomePage/searchByName")
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


    @RequestMapping("/outpatientDoctorWorkStation/outpatientMedicalRecordHomePage/searchByNumber")
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

    @RequestMapping("/outpatientDoctorWorkStation/outpatientMedicalRecordHomePage/saveRecord")
    public ResultUtil saveRecord(MedicalRecord user) {
        System.out.println("Information to be staged：" + user);
        Integer code = EnumCode.OK.getValue();
        String msg = "Staging success";
        try {

            if (service.recordIsExist(user) == null) {

                service.insertRecord(user);
            } else {

                service.updateRecord(user);
            }
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Staging failure";
        }

        return new ResultUtil(code, msg);
    }


    @RequestMapping("/outpatientDoctorWorkStation/outpatientMedicalRecordHomePage/commitRecord")
    public ResultUtil commitRecord(MedicalRecord user) {
        System.out.println("Information to be submitted：" + user);
        Integer code = EnumCode.OK.getValue();
        String msg = "Submitted successfully";
        try {

            if (service.recordIsExist(user) == null) {

                System.out.println("This patient does not have a Medical Record and is about to be entered");
                service.insertRecord(user);
            } else {

                System.out.println("This patient has a medical record and will be updated soon");
                service.updateRecord(user);
            }

            service.updateRegister(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failure to commit";
        }

        return new ResultUtil(code, msg);
    }


    @RequestMapping("/outpatientDoctorWorkStation/outpatientMedicalRecordHomePage/initRecord")
    public ResultUtil initRecord(MedicalRecord user) {
        System.out.println("Initialized Medical Records Patients：" + user);
        MedicalRecord result = new MedicalRecord();
        Integer code = EnumCode.OK.getValue();
        String msg = "Temporary Medical Records Home Page Loaded";
        boolean flag = true;
        try {
            if (service.recordIsExist(user) == null) {
                flag = false;
                msg = "There is no temporary medical record information for this patient";
            } else {
                result = service.getRecord(user);
            }
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Loading Temporary Medical Records First Page Failed";
        }
        if (flag) {
            return new ResultUtil(code, msg, result);
        } else {
            return new ResultUtil(code, msg);
        }
    }


    @PostMapping("/outpatientDoctorWorkStation/outpatientMedicalRecordHomePage/getRecordTemplatePersonally")
    public ResultUtil getRecordTemplatePersonally(@RequestBody User user) {
        System.out.println("user = " + user);
        List<RecordTemplate> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Generate personal medical record template successfully";
        try {
            result = service.getRecordTemplatePersonally(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to generate Personal Medical Record template";
        }
        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/outpatientMedicalRecordHomePage/getRecordTemplateByDepartment")
    public ResultUtil getRecordTemplateByDepartment(@RequestBody User user) {
        System.out.println("user = " + user);
        List<RecordTemplate> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Generate Department Medical Record Template Successfully";
        try {
            result = service.getRecordTemplateByDepartment(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to generate department medical record template";
        }
        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/outpatientMedicalRecordHomePage/getRecordTemplateByHospital")
    public ResultUtil getRecordTemplateByHospital() {
        List<RecordTemplate> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Hospital-wide medical record template generated successfully";
        try {
            result = service.getRecordTemplateByHospital();
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to generate hospital-wide medical record template";
        }
        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/outpatientMedicalRecordHomePage/deleteRecordTemplate")
    public ResultUtil deleteRecordTemplate(@RequestBody RecordTemplate record) {
        Integer code = EnumCode.OK.getValue();
        String msg = "Deleted successfully";
        try {
            service.deleteRecordTemplate(record);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Delete Failed";
        }

        return new ResultUtil(code, msg);
    }


    @RequestMapping("/outpatientDoctorWorkStation/outpatientMedicalRecordHomePage/commitTemplate")
    public ResultUtil commitTemplate(RecordTemplate record) {
        System.out.println("Templates to be added：" + record);
        Integer code = EnumCode.OK.getValue();
        String msg = "Added Success";
        try {
            service.commitTemplate(record);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Added Failed";
        }

        return new ResultUtil(code, msg);
    }


    @RequestMapping("/outpatientDoctorWorkStation/outpatientMedicalRecordHomePage/historyRegister")
    public ResultUtil historyRegister(Register register) {
        System.out.println("Patient History Records to Be Queried：" + register);

        System.out.println("Search for patient identification number：" + service.searchIDNumber(register));

        System.out.println("According to the registration number:" + service.searchRegister(service.searchIDNumber(register)));

        List<Register> temp = new ArrayList<>();
        temp = service.searchRegister(service.searchIDNumber(register));
        class Temp{
            private String CaseNumber;
            @JsonFormat(pattern = "yyyy-MM-dd")
            private Date VisitDate;
            private String DeptName;
            private String Diagnosis;

            public Temp(String caseNumber, Date visitDate, Integer deptID, String checkResult) {

            }

            public Temp() {

            }

            public String getCaseNumber() {
                return CaseNumber;
            }

            public void setCaseNumber(String caseNumber) {
                CaseNumber = caseNumber;
            }

            public Date getVisitDate() {
                return VisitDate;
            }

            public void setVisitDate(Date visitDate) {
                VisitDate = visitDate;
            }

            public String getDeptName() {
                return DeptName;
            }

            public void setDeptName(String deptName) {
                DeptName = deptName;
            }

            public String getDiagnosis() {
                return Diagnosis;
            }

            public void setDiagnosis(String diagnosis) {
                Diagnosis = diagnosis;
            }
        }
        List<Temp> result2 = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Query successfully";
        try {
            for (int i=0; i<temp.size(); i++) {
                System.out.println("No." + i + "temp:" + temp.get(i));
                System.out.println("No." + i + "next result:" + service.searchHostory(temp.get(i)));

                if (service.searchHostory(temp.get(i)) != null) {
                    Temp t = new Temp();
                    t.setCaseNumber(temp.get(i).getCaseNumber());
                    t.setVisitDate(temp.get(i).getVisitDate());
                    t.setDiagnosis(service.searchHostory(temp.get(i)).getDiagnosis());
                    t.setDeptName(service.searchDeptName(register));
                    result2.add(t);
                    System.out.println("register = " + register);
                    System.out.println("t = " + t.getVisitDate());
                }
            }

            System.out.println("Result：" + result2);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Query failure";
        }

        return new ResultUtil(code, msg, result2);
    }


    @PostMapping("/outpatientDoctorWorkStation/outpatientMedicalRecordHomePage/historyRegisterDetail")
    public ResultUtil historyRegisterDetail(@RequestBody Register register) {
        System.out.println("details：" + register);
        MedicalRecord result = new MedicalRecord();
        Integer code = EnumCode.OK.getValue();
        String msg = "Query details successfully";
        try {
            result = service.historyRegisterDetail(register);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Query Details Failed";
        }
        return new ResultUtil(code, msg, result);
    }
}
