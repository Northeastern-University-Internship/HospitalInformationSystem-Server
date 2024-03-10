package com.neuedu.His02.service.outpatientPharmacyWorkstationService;

import com.neuedu.His02.entity.Prescription;

import java.util.List;


public interface OutpatientDispensingService {
    public List<Prescription> selectAll(Prescription  u);
    public int update(String u);
}
