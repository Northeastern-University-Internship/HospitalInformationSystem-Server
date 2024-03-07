package com.neuedu.His02.controller.outpatientDoctorWorkStation;

import com.neuedu.His02.entity.*;
import com.neuedu.His02.service.outpatientDoctorWorkStationService.PatentPrescriptionService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class PatentPrescriptionController {

    @Autowired
    private PatentPrescriptionService service;


    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/initPatients")
    public ResultUtil initPatients(@RequestBody User user) {
        System.out.println("Starting to initialize the patient, came the doctor's message:" + user);
        List<Register> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Patient data initialized successfully";
        try {
            result = service.initPatients(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to initialize patient data";
        }
        return new ResultUtil(code, msg, result);
    }


    @RequestMapping("/outpatientDoctorWorkStation/patentPrescription/searchByName")
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


    @RequestMapping("/outpatientDoctorWorkStation/patentPrescription/searchByNumber")
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


    @RequestMapping("/outpatientDoctorWorkStation/patentPrescription/initPrescription")
    public ResultUtil initRecord(MedicalRecord user) {
        System.out.println("Initialized Medical Records Patients：" + user);
        List<Prescription> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "A list of patient prescription drugs has been loaded";
        try {

            Integer medicalID = service.findMedicalID(user);
            Integer registID = service.findRegistID(user);

            System.out.println("Medical ID and Registid：" + medicalID + "," + registID);
            result = service.initPrescription(medicalID, registID);
            System.out.println(result);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to load patient prescription list";
        }


        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/tempPrescription")
    public ResultUtil tempPrescription(@RequestBody Prescription prescription) {
        System.out.println("Prescriptions to be temporarily held：" + prescription);
        Integer code = EnumCode.OK.getValue();
        String msg = "Staging success";
        try {

            if (service.prescriptionIsExist(prescription) == null) {
                System.out.println("No New Prescription, Insert");

                service.insertPrescription(prescription);
            } else {

                System.out.println("a new prescription, update");
                service.updatePrescription(prescription);
            }
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Staging failure";
        }

        return new ResultUtil(code, msg);
    }


    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/sendPrescription")
    public ResultUtil sendPrescription(@RequestBody Prescription prescription) {
        System.out.println("Prescriptions to be sent：" + prescription);
        Integer code = EnumCode.OK.getValue();
        String msg = "Sent successfully";
        try {
            service.updatePrescription(prescription);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to send";
        }

        return new ResultUtil(code, msg);
    }


    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/commitPrescription")
    public ResultUtil commitPrescription(@RequestBody Prescription prescription) {
        System.out.println("Prescriptions to be filled：" + prescription);
        Integer code = EnumCode.OK.getValue();
        String msg = "Opened successfully";
        try {
            service.updatePrescription(prescription);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to Open";
        }

        return new ResultUtil(code, msg);
    }


    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/deletePrescription")
    public ResultUtil deletePrescription(@RequestBody Prescription prescription) {
        System.out.println("Prescriptions to be deleted：" + prescription);
        Integer code = EnumCode.OK.getValue();
        String msg = "Deleted successfully";
        try {
            service.deletePrescription(prescription);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Delete Failed";
        }

        return new ResultUtil(code, msg);
    }


    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/cancelPrescription")
    public ResultUtil cancelPrescription(@RequestBody Prescription prescription) {
        System.out.println("A prescription is about to expire：" + prescription);
        Integer code = EnumCode.OK.getValue();
        String msg = "Nullified successfully";
        try {
            service.updatePrescription(prescription);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Invalidate failure";
        }

        return new ResultUtil(code, msg);
    }


    @RequestMapping("/outpatientDoctorWorkStation/patentPrescription/getMedicalID")
    public ResultUtil getMedicalID(MedicalRecord medicalRecord) {
        System.out.println("From caseNumber：" + medicalRecord);
        Integer result = null;
        Integer code = EnumCode.OK.getValue();
        String msg = "Conversion Successful";
        try {
            result = service.getMedicalID(medicalRecord);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Conversion failure";
        }
        System.out.println(" ID found：" + result);
        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/addPrescription")
    public ResultUtil addPrescription(@RequestBody Prescription prescription) {
        System.out.println("Upcoming New Prescriptions：" + prescription);
        Integer code = EnumCode.OK.getValue();
        String msg = "Additional Success";
        try {
            service.insertPrescription(prescription);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Additional Failure";
        }

        return new ResultUtil(code, msg);
    }



    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/initDetail")
    public ResultUtil initDetail(@RequestBody Prescription prescription) {
        System.out.println("Prescriptions to be Queried：" + prescription);

        List<PrescriptionDetailed> temp = service.initDetail(prescription);

        class NewPrescriptionDetailed extends PrescriptionDetailed {
            private String DrugsName;

            public String getDrugsName() {
                return DrugsName;
            }

            public void setDrugsName(String drugsName) {
                DrugsName = drugsName;
            }

            public NewPrescriptionDetailed(String drugsName) {
                DrugsName = drugsName;
            }

            public NewPrescriptionDetailed() {
            }
        }
        List<NewPrescriptionDetailed> newPrescriptionDetaileds = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Initializing prescription details successfully";
        try {
            for (int i=0; i<temp.size(); i++) {
                NewPrescriptionDetailed t = new NewPrescriptionDetailed();
                t.setDrugsName(service.initName(temp.get(i).getDrugsID()));
                System.out.println("ID:" + temp.get(i).getDrugsID() + ", Name:" + t.getDrugsName());
                t.setID(temp.get(i).getID());
                t.setPrescriptionID(temp.get(i).getPrescriptionID());
                t.setDrugsID(temp.get(i).getDrugsID());
                t.setDrugsUsage(temp.get(i).getDrugsUsage());
                t.setDosage(temp.get(i).getDosage());
                t.setFrequency(temp.get(i).getFrequency());
                t.setAmount(temp.get(i).getAmount());
                t.setState(temp.get(i).getState());
                newPrescriptionDetaileds.add(t);
            }

            System.out.println("Results to be returned：" + newPrescriptionDetaileds);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to initialize prescription details";
        }

        return new ResultUtil(code, msg, newPrescriptionDetaileds);
    }

    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/initDrugsPrepare")
    public ResultUtil initDrugsPrepare() {
        List<Map<Integer, String>> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Production of drugs successfully";
        try {
            result = service.initDrugsPrepare();
            System.out.println("The drugs found：" + result);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to Generate Drugs";
        }

        return new ResultUtil(code, msg, result);
    }


    @RequestMapping("/outpatientDoctorWorkStation/patentPrescription/addDrugs")
    public ResultUtil addDrugs(PrescriptionDetailed prescriptionDetailed) {
        System.out.println("Drugs to be added：" + prescriptionDetailed);
        Integer code = EnumCode.OK.getValue();
        String msg = "Drug increase successful";
        try {
            service.addDrugs(prescriptionDetailed);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Drug enhancement failed";
        }

        return new ResultUtil(code, msg);
    }


    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/deleteDrugs")
    public ResultUtil deleteDrugs(@RequestBody PrescriptionDetailed prescriptionDetailed) {
        System.out.println("Drugs to be deleted：" + prescriptionDetailed);
        Integer code = EnumCode.OK.getValue();
        String msg = "Deleted successfully";
        try {
            service.deleteDrugs(prescriptionDetailed);
        } catch (Exception e) {
            code = EnumCode.INTERNAL_SERVER_ERROR.getValue();
            msg = "Drug deletion failed";
        }

        return new ResultUtil(code, msg);
    }

    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/getDrugsTemplatePersonally")
    public ResultUtil getDrugsTemplatePersonally(@RequestBody User user) {
        System.out.println("user = " + user);
        List<DrugsTemplate> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Generate Personal Drug Template Success";
        try {
            result = service.getDrugsTemplatePersonally(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to generate Personal Medicine Template";
        }
        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/getDrugsTemplateByDepartment")
    public ResultUtil getDrugsTemplateByDepartment(@RequestBody User user) {
        System.out.println("user = " + user);
        List<DrugsTemplate> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Generate Department Patent Medicine Template Successfully";
        try {
            result = service.getDrugsTemplateByDepartment(user);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to generate department patent drug template";
        }
        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/getDrugsTemplateByHospital")
    public ResultUtil getDrugsTemplateByHospital() {
        List<DrugsTemplate> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Generate the whole hospital patent medicine template successfully";
        try {
            result = service.getDrugsTemplateByHospital();
        } catch (Exception e) {
            code = EnumCode.INTERNAL_SERVER_ERROR.getValue();
            msg = "Failed to generate hospital-wide patent drug template";
        }
        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/chooseTemplate")
    public ResultUtil chooseTemplate(@RequestBody DrugsTemplate drugsTemplate) {
        System.out.println("Selected Templates：" + drugsTemplate);
        List<DrugsDetailed> result = new ArrayList<>();
        Integer code = EnumCode.OK.getValue();
        String msg = "Generate Patent Medicine Details Successfully";
        try {
            result = service.chooseTemplate(drugsTemplate);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Failed to generate patent drug details";
        }

        return new ResultUtil(code, msg, result);
    }


    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/deleteTemplate")
    public ResultUtil deleteTemplate(@RequestBody DrugsTemplate drugsTemplate) {
        System.out.println("Deleted templates：" + drugsTemplate);
        Integer code = EnumCode.OK.getValue();
        String msg = "Deleted successfully";
        try {
            service.deleteTemplate(drugsTemplate);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Delete Failed";
        }

        return new ResultUtil(code, msg);
    }


    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/addTemplateConfirm")
    public ResultUtil addTemplateConfirm(@RequestBody DrugsTemplate drugsTemplate) {
        System.out.println("Templates to be added：" + drugsTemplate);
        Integer code = EnumCode.OK.getValue();
        String msg = "Deleted successfully";
        try {
            service.addTemplateConfirm(drugsTemplate);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Delete Failed";
        }

        return new ResultUtil(code, msg);
    }


    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/deleteTemplateDetail")
    public ResultUtil deleteTemplateDetail(@RequestBody DrugsDetailed drugsDetailed) {
        System.out.println("Details of templates to be deleted：" + drugsDetailed);
        Integer code = EnumCode.OK.getValue();
        String msg = "Deleted successfully";
        try {
            service.deleteTemplateDetail(drugsDetailed);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Delete Failed";
        }

        return new ResultUtil(code, msg);
    }


    @PostMapping("/outpatientDoctorWorkStation/patentPrescription/addTemplateDetailConfirm")
    public ResultUtil addTemplateDetailConfirm(@RequestBody DrugsDetailed drugsDetailed) {
        System.out.println("Detail templates to be added：" + drugsDetailed);
        Integer code = EnumCode.OK.getValue();
        String msg = "Added Success";
        try {
            service.addTemplateDetailConfirm(drugsDetailed);
        } catch (Exception e) {
            code = EnumCode.EXCPTION_ERROR.getValue();
            msg = "Added Failed";
        }

        return new ResultUtil(code, msg);
    }
}
