package com.neuedu.His02.mapper.outpatientDoctorWorkStationMapper;

import com.neuedu.His02.entity.CheckApply;
import com.neuedu.His02.entity.MedicalRecord;
import com.neuedu.His02.entity.Register;
import com.neuedu.His02.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InspectionApplicationMapper {
    public List<Register> initPatients(User user);
    public MedicalRecord initRecords(String s);
    public List<CheckApply> applyIsExist(MedicalRecord medicalRecord);
    public List<CheckApply> getApply(MedicalRecord medicalRecord);
    public CheckApply checkApplyIsExist(CheckApply checkApply);
    public void insertCheckApply(CheckApply checkApply);
    public void updateCheckApply(CheckApply checkApply);
    public void deleteCheckApply(CheckApply checkApply);
    public void cancelApply(CheckApply checkApply);
    public List<?> initItemName();
    public void addApply(CheckApply checkApply);
}
