package com.neuedu.His02.service.outpatientDoctorWorkStationService;

import com.neuedu.His02.entity.*;

import java.util.List;
import java.util.Map;

public interface PatentPrescriptionService {
    public List<Register> initPatients(User user);
    public List<Register> searchByName(Register user);
    public List<Register> searchByNumber(Register user);
    public Integer findMedicalID(MedicalRecord medicalRecord);
    public Integer findRegistID(MedicalRecord medicalRecord);
    public List<Prescription> initPrescription(Integer medicalID, Integer registID);
    public Prescription prescriptionIsExist(Prescription prescription);
    public void insertPrescription(Prescription prescription);
    public void updatePrescription(Prescription prescription);
    public void deletePrescription(Prescription prescription);
    public Integer getMedicalID(MedicalRecord medicalRecord);
    public List<PrescriptionDetailed> initDetail(Prescription prescription);
    public void addDrugs(PrescriptionDetailed prescriptionDetailed);
    public void deleteDrugs(PrescriptionDetailed prescriptionDetailed);
    public List<Map<Integer, String>> initDrugsPrepare();
    public String initName(Integer integer);
    public List<DrugsTemplate> getDrugsTemplatePersonally(User user);
    public List<DrugsTemplate> getDrugsTemplateByDepartment(User user);
    public List<DrugsTemplate> getDrugsTemplateByHospital();
    public List<DrugsDetailed> chooseTemplate(DrugsTemplate drugsTemplate);
    public void deleteTemplate(DrugsTemplate drugsTemplate);
    public void addTemplateConfirm(DrugsTemplate drugsTemplate);
    public void deleteTemplateDetail(DrugsDetailed drugsDetailed);
    public void addTemplateDetailConfirm(DrugsDetailed drugsDetailed);
}
