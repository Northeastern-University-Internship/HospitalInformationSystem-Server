package com.neuedu.His02.mapper.outpatientDoctorWorkStationMapper;

import com.neuedu.His02.entity.MedicalRecord;
import com.neuedu.His02.entity.Register;
import com.neuedu.His02.entity.User;
import com.neuedu.His02.entity.recordTemplate.RecordTemplate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OutpatientMedicalRecordHomePageMapper {
    public List<Register> initPatients(User user);
    public List<Register> initHistoryPatients(User user);
    public List<Register> searchByName(Register user);
    public List<Register> searchByNumber(Register user);
    public void saveRecord(MedicalRecord user);
    public MedicalRecord recordIsExist(MedicalRecord user);
    public void insertRecord(MedicalRecord user);
    public void updateRecord(MedicalRecord user);
    public void updateRegister(MedicalRecord medicalRecord);
    public MedicalRecord getRecord(MedicalRecord user);
    public List<RecordTemplate> getRecordTemplatePersonally(User user);
    public List<RecordTemplate> getRecordTemplateByDepartment(User user);
    public List<RecordTemplate> getRecordTemplateByHospital();
    public void deleteRecordTemplate(RecordTemplate record);
    public void commitTemplate(RecordTemplate record);
    public String searchIDNumber(Register register);
    public List<Register> searchRegister(String s);
    public MedicalRecord searchHostory(Register register);
    public String searchDeptName(Register register);
    public MedicalRecord historyRegisterDetail(Register register);
}
