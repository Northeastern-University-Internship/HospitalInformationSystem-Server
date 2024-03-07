package com.neuedu.His02.mapper.outpatientDoctorWorkStationMapper;

import com.neuedu.His02.entity.*;
import com.neuedu.His02.entity.diagnosisTemplate.DiagnosisTemplate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OutpatientDiagnosisMapper {
    public List<Register> searchByName(Register register);
    public List<Register> searchByNumber(Register register);
    public List<Register> initPatients(User user);
    public MedicalRecord getRecord(MedicalRecord medicalRecord);
    public List<CheckApply> getCheckResult(MedicalRecord medicalRecord);
    public List<CheckApply> getDealResult(MedicalRecord medicalRecord);
    public List<DiagnosisTemplate> getDiagnosisTemplatePersonally(User user);
    public List<DiagnosisTemplate> getDiagnosisTemplateByDepartment(User user);
    public List<DiagnosisTemplate> getDiagnosisTemplateByHospital();
    public void deleteDiagnosisTemplate(DiagnosisTemplate diagnosisTemplate);
    public void commitTemplate(DiagnosisTemplate diagnosisTemplate);
    public void confirm(MedicalRecord medicalRecord);
    public MedicalRecord recordIsExist(Register register);
    public List<DiseCategory> diseaseCategory();
    public List<String> initDiseasePrepare();
    public List<String> initCategoryDiseasePrepare();
}
