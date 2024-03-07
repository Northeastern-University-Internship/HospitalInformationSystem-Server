package com.neuedu.His02.mapper.OutpatientMedicalTechnologyWorkstation;


import com.neuedu.His02.entity.CheckApply;
import com.neuedu.His02.entity.MedicalRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InputResult1Mapper {
    public List<CheckApply> selectAllCheckApply(CheckApply checkApply);
    public CheckApply selectByCheckID(int RegistID);
    public int updateCheckApply(CheckApply checkApply);

    public MedicalRecord selectByMedicalID(int ID);
    public int updateMedicalRecord(MedicalRecord medicalRecord);
}
