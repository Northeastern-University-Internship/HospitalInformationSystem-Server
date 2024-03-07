package com.neuedu.His02.controller.outpatientPharmacyWorkstationController;

import com.neuedu.His02.entity.Prescription;
import com.neuedu.His02.service.outpatientPharmacyWorkstationService.OutpatientWithdrawalService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/outpatientPharmacyWorkstation/outpatientWithdrawal")
public class OutpatientWithdrawalController {
@Autowired
private OutpatientWithdrawalService service;

	@RequestMapping("/selectAll")
	public ResultUtil selectAll(Prescription u){
		System.out.println(u);
		List<Prescription> list = service.selectAll(u);
		if(list != null){
			System.out.println("Query statement executed");
			return  new ResultUtil(EnumCode.OK.getValue(),"Query successfully",service.selectAll(u));
		}
		return new ResultUtil(EnumCode.UNAUTHORIZED.getValue(), "Query failure");
	}



	@RequestMapping("/update")
	public ResultUtil update(@RequestParam String id,@RequestParam String amount) {
		System.out.println("---u="+id+amount);
		int res = service.update(id,amount);
		if(res > 0){
			System.out.println("Modified statement executed");
			return  new ResultUtil(EnumCode.OK.getValue(),"Drug withdrawal success");
		}
		return new ResultUtil(EnumCode.UNAUTHORIZED.getValue(), "Failure of drug withdrawal");
	}

	@RequestMapping("/updateAll")
	public ResultUtil updateAll(@RequestParam String caseNumber) {
		System.out.println("---u="+caseNumber);
		Prescription res = service.updateAll(caseNumber);
		System.out.println(res);
		if(res != null){
			System.out.println("Modified statement executed");
			return  new ResultUtil(EnumCode.OK.getValue(),"Drug withdrawal success",res);
		}
		return new ResultUtil(EnumCode.UNAUTHORIZED.getValue(), "Failure of drug withdrawal");
	}



}
