package com.neuedu.His02.controller.outpatientPharmacyWorkstationController;

import com.neuedu.His02.entity.Prescription;
import com.neuedu.His02.service.outpatientPharmacyWorkstationService.OutpatientDispensingService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/outpatientPharmacyWorkstation/outpatientDispensing")
public class OutpatientDispensingController{
	@Autowired
	private OutpatientDispensingService service;

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
	public ResultUtil update(@RequestParam String id) {
		System.out.println("---u="+id);
		int res = service.update(id);
		if(res > 0){
			System.out.println("Modified statement executed");
			return  new ResultUtil(EnumCode.OK.getValue(),"Medication successfully");
		}
		return new ResultUtil(EnumCode.UNAUTHORIZED.getValue(), "Medication failed");
	}



}
