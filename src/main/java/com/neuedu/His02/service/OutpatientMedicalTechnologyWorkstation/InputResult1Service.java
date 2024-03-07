package com.neuedu.His02.service.OutpatientMedicalTechnologyWorkstation;

import com.neuedu.His02.entity.CheckApply;
import com.neuedu.His02.entity.MedicalRecord;

import java.util.List;

public interface InputResult1Service {
    public List<CheckApply> selectAllCheckApply(CheckApply checkApply);
    public CheckApply selectByCheckID(int RegistID);
    public int updateCheckApply(CheckApply checkApply);
    public MedicalRecord selectByMedicalID(int ID);
    public int updateMedicalRecord(MedicalRecord medicalRecord);
}
