package com.neuedu.His02.mapper.outpatientDoctorWorkStationMapper;

import com.neuedu.His02.entity.MedicalRecord;
import com.neuedu.His02.entity.Register;
import com.neuedu.His02.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AfterDiagnosisMapper {
    public List<Register> initPatients(User user);
    public List<Register> searchByName(Register register);
    public List<Register> searchByNumber(Register register);
    public MedicalRecord getRecord(MedicalRecord medicalRecord);
    public void commitEndPatient(Register register);
    public void commitEndMedicalRecord(MedicalRecord medicalRecord);
}
