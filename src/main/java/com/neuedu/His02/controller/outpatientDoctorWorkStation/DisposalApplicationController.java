package com.neuedu.His02.controller.outpatientDoctorWorkStation;

import com.neuedu.His02.entity.CheckApply;
import com.neuedu.His02.entity.MedicalRecord;
import com.neuedu.His02.entity.Register;
import com.neuedu.His02.entity.User;
import com.neuedu.His02.service.outpatientDoctorWorkStationService.DisposalApplicationService;
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
public class DisposalApplicationController {

    @Autowired
    private DisposalApplicationService service;


    @PostMapping("/outpatientDoctorWorkStation/disposalApplicationService/initPatients")
    public ResultUtil initPatients(@RequestBody User user) {
        System.out.println("doctor's message：" + user);

        List<Register> caseNumber = new ArrayList<>();
        caseNumber = service.initPatients(user);

        class Temp extends MedicalRecord {
            private String RealName;
            private Integer Age;

            public String getRealName() {
                return RealName;
            }

            public void setRealName(String name) {
                RealName = name;
            }

            public Integer getAge() {
                return Age;
            }

            public void setAge(Integer age) {
                Age = age;
            }

            public Temp(String name, Integer age) {
                RealName = name;
                Age = age;
            }

            public Temp() {
            }
        }
        List<Temp> temp = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Initializing medical records successfully";
        try {
            for (int i=0; i<caseNumber.size(); i++) {
                System.out.println("caseNumber[" + i + "] = " + caseNumber.get(i).getCaseNumber() + caseNumber.get(i).getRealName() + caseNumber.get(i).getAge());

                if (service.initRecords(caseNumber.get(i).getCaseNumber()) != null) {
                    System.out.println("The records that were found：" + service.initRecords(caseNumber.get(i).getCaseNumber()));
                    Temp t = new Temp();
                    t.setRealName(caseNumber.get(i).getRealName());
                    t.setAge(caseNumber.get(i).getAge());
                    t.setCaseNumber(caseNumber.get(i).getCaseNumber());
                    t.setID(service.initRecords(caseNumber.get(i).getCaseNumber()).getID());
                    t.setRegistID(service.initRecords(caseNumber.get(i).getCaseNumber()).getRegistID());
                    t.setReadme(service.initRecords(caseNumber.get(i).getCaseNumber()).getReadme());
                    t.setPresent(service.initRecords(caseNumber.get(i).getCaseNumber()).getPresent());
                    t.setPresentTreat(service.initRecords(caseNumber.get(i).getCaseNumber()).getPresentTreat());
                    t.setHistory(service.initRecords(caseNumber.get(i).getCaseNumber()).getHistory());
                    t.setAllergy(service.initRecords(caseNumber.get(i).getCaseNumber()).getAllergy());
                    t.setPhysique(service.initRecords(caseNumber.get(i).getCaseNumber()).getPhysique());
                    t.setProposal(service.initRecords(caseNumber.get(i).getCaseNumber()).getProposal());
                    t.setCareful(service.initRecords(caseNumber.get(i).getCaseNumber()).getCareful());
                    t.setCheckResult(service.initRecords(caseNumber.get(i).getCaseNumber()).getCheckResult());
                    t.setDiagnosis(service.initRecords(caseNumber.get(i).getCaseNumber()).getDiagnosis());
                    t.setHandling(service.initRecords(caseNumber.get(i).getCaseNumber()).getHandling());
                    t.setCaseState(service.initRecords(caseNumber.get(i).getCaseNumber()).getCaseState());
                    System.out.println("Data that meets the requirements：" + t);
                    temp.add(t);
                }
            }
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to initialize medical record information";
        }


        System.out.println("Data to be returned：" + temp);

        return new ResultUtil(code, msg, temp);
    }


    @RequestMapping("/outpatientDoctorWorkStation/disposalApplicationService/initApply")
    public ResultUtil initApply(MedicalRecord medicalRecord) {
        System.out.println("Patients with pending disposition requests：" + medicalRecord);
        List<CheckApply> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        boolean flag = true;
        String msg = "Disposal Request Information Loaded";
        try {
            if (service.applyIsExist(medicalRecord) == null) {
                flag = false;
                msg = "This patient has no request for information";
            } else {
                result = service.getApply(medicalRecord);
            }
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to load disposal information";
        }
        if (flag) {
            return new ResultUtil(code, msg, result);
        } else {
            return new ResultUtil(code, msg);
        }


    }

    @PostMapping("/outpatientDoctorWorkStation/disposalApplicationService/tempApply")
    public ResultUtil tempApply(@RequestBody CheckApply checkApply) {
        System.out.println("Items to be staged：" + checkApply);
        Integer code = EnumCode.OK.getValue();
        String msg = "Staging success";
        try {

            if (service.checkApplyIsExist(checkApply) == null) {
                System.out.println("No new items, insert");

                service.insertCheckApply(checkApply);
            } else {

                System.out.println("There are new projects, updates");
                service.updateCheckApply(checkApply);
            }
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Staging failure";
        }

        return new ResultUtil(code, msg);
    }


    @PostMapping("/outpatientDoctorWorkStation/disposalApplicationService/commitApply")
    public ResultUtil commitApply(@RequestBody CheckApply checkApply) {
        System.out.println("Projects to be opened soon：" + checkApply);
        Integer code = EnumCode.OK.getValue();
        String msg = "Opened successfully";
        try {
            service.updateCheckApply(checkApply);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Open failure";
        }

        return new ResultUtil(code, msg);
    }


    @PostMapping("/outpatientDoctorWorkStation/disposalApplicationService/deleteApply")
    public ResultUtil deleteApply(@RequestBody CheckApply checkApply) {
        System.out.println("Items to be deleted：" + checkApply);
        Integer code = EnumCode.OK.getValue();
        String msg = "Deleted successfully";
        try {
            service.deleteCheckApply(checkApply);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Delete Failed";
        }

        return new ResultUtil(code, msg);
    }


    @PostMapping("/outpatientDoctorWorkStation/disposalApplicationService/cancelApply")
    public ResultUtil cancelApply(@RequestBody CheckApply checkApply) {
        System.out.println("Projects to be discontinued：" + checkApply);
        Integer code = EnumCode.OK.getValue();
        String msg = "Nullified successfully";
        try {
            service.updateCheckApply(checkApply);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Open failure";
        }

        return new ResultUtil(code, msg);
    }

    @PostMapping("/outpatientDoctorWorkStation/disposalApplicationService/editApply")
    public ResultUtil editApply(@RequestBody CheckApply checkApply) {
        System.out.println("Items to be modified：" + checkApply);
        Integer code = EnumCode.OK.getValue();
        String msg = "Modified successfully";
        try {
            service.updateCheckApply(checkApply);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Modification failure";
        }

        return new ResultUtil(code, msg);
    }


    @PostMapping("/outpatientDoctorWorkStation/disposalApplicationService/initItemName")
    public ResultUtil initItemName() {
        List<?> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Project Name Generated Successfully";
        try {
            result = service.initItemName();
            System.out.println("Items that will be returning：" + result);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Project Name Build Failed";
        }

        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/disposalApplicationService/addApply")
    public ResultUtil addApply(@RequestBody CheckApply checkApply) {
        System.out.println("Items to be added：" + checkApply);
        Integer code = EnumCode.OK.getValue();
        String msg = "Added Success";
        try {
            service.addApply(checkApply);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Add Failure";
        }

        return new ResultUtil(code, msg);
    }
}
