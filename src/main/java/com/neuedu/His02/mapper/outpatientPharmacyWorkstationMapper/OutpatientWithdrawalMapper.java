package com.neuedu.His02.mapper.outpatientPharmacyWorkstationMapper;

import com.neuedu.His02.entity.Prescription;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface OutpatientWithdrawalMapper {
    public List<Prescription> selectAll(Prescription u);
    public int add(Prescription u);
    public int update(String id,String amount);
    public int delete(Prescription u);
    public int updateAll(String caseNumber);
    public Prescription count(String caseNumber);
}
