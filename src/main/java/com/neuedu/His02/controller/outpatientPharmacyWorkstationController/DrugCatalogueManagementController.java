package com.neuedu.His02.controller.outpatientPharmacyWorkstationController;

import com.neuedu.His02.entity.Drugs;
import com.neuedu.His02.service.outpatientPharmacyWorkstationService.DrugCatalogueManagementService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;


@RestController
@RequestMapping("/outpatientPharmacyWorkstation/drugCatalogueManagement")
public class DrugCatalogueManagementController {
@Autowired
private DrugCatalogueManagementService service;

@RequestMapping("/selectAll")
public ResultUtil selectAll(Drugs u){
	System.out.println(u);
	List<Drugs> list = service.selectAll(u);
	if(list != null){
		System.out.println("Query statement executed");
		return  new ResultUtil(EnumCode.OK.getValue(),"Query successfully",service.selectAll(u));
	}
	return new ResultUtil(EnumCode.UNAUTHORIZED.getValue(), "Query failure");
}

@RequestMapping("/add")
public ResultUtil add(Drugs u) {
	System.out.println(u);
	int res = service.add(u);
	if(res == 1){
		System.out.println("Increment statement executed");
		return  new ResultUtil(EnumCode.OK.getValue(),"Add Drug Information Success");
	}
	return new ResultUtil(EnumCode.UNAUTHORIZED.getValue(), "Failure to Add Drug Information");
}

@RequestMapping("/update")
public ResultUtil update(@RequestParam Integer id, @RequestParam String drugsCode, @RequestParam String drugsName, @RequestParam String drugsFormat, @RequestParam String drugsUnit,@RequestParam  String manufacturer, @RequestParam Integer drugsDosageID, @RequestParam Integer drugsTypeID,@RequestParam  BigDecimal drugsPrice,@RequestParam String mnemonicCode,@RequestParam String lastUpdateDate) {
	System.out.println("---u="+id + "555555555"+drugsDosageID);
	int res = service.update(id,drugsCode,drugsName,drugsFormat,drugsUnit,manufacturer,drugsDosageID,drugsTypeID,drugsPrice,mnemonicCode,lastUpdateDate);
	if(res == 1){
		System.out.println("Modified statement executed");
		return  new ResultUtil(EnumCode.OK.getValue(),"Updated Drug Information Successfully");
	}
	return new ResultUtil(EnumCode.UNAUTHORIZED.getValue(), "Failed to update drug information");
}

@RequestMapping("/delete")
public ResultUtil delete(@RequestParam String id) {
	System.out.println("come in ''Delete statement");
	int res = service.delete(id);
	System.out.println("-------------"+id);
	if(res == 1){
		System.out.println("Delete statement executed");
		return  new ResultUtil(EnumCode.OK.getValue(),"Drug information removed successfully");
	}
	return new ResultUtil(EnumCode.UNAUTHORIZED.getValue(), "Drug Information Deletion Failure");
}


}
