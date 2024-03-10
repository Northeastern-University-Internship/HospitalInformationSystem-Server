package com.neuedu.His02.service.outpatientPharmacyWorkstationService;

import com.neuedu.His02.entity.Prescription;

import java.util.List;


public interface OutpatientWithdrawalService {
    public List<Prescription> selectAll(Prescription  u);
    public int update(String u,String Amount);
    public int delete(Prescription u);
    public Prescription updateAll(String caseNumber);
    public Prescription count(String caseNumber);
}
