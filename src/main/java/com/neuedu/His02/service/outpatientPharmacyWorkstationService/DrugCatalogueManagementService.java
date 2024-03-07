package com.neuedu.His02.service.outpatientPharmacyWorkstationService;

import com.neuedu.His02.entity.Drugs;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: ZJH
 * @Date: 2021/12/19/15:12
 * @Description:
 */
public interface DrugCatalogueManagementService {
    public List<Drugs> selectAll(Drugs u);
    public Drugs selectById(Drugs u);
    public int add(Drugs u);
    public int update(Integer ID, String DrugsCode, String DrugsName, String DrugsFormat, String DrugsUnit, String Manufacturer, Integer DrugsDosageID, Integer DrugsTypeID, BigDecimal DrugsPrice, String MnemonicCode,String LastUpdateDate);
    public int delete(String id);
}
