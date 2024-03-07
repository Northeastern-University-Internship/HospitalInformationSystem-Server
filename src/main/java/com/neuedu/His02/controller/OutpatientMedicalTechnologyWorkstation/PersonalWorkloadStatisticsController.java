package com.neuedu.His02.controller.OutpatientMedicalTechnologyWorkstation;

import com.neuedu.His02.entity.CheckApply;
import com.neuedu.His02.service.OutpatientMedicalTechnologyWorkstation.PersonalWorkloadStatisticsService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/outpatientMedicalTechnologyWorkstation/personalWorkloadStatistics")
public class PersonalWorkloadStatisticsController {
    @Autowired
    private PersonalWorkloadStatisticsService service;

    @RequestMapping("/selectAll")
    public ResultUtil selectAll(CheckApply u){
        System.out.println(u);
        List<CheckApply> list = service.selectAll(u);
        if(list != null){
            System.out.println("Query statement executed");
            return  new ResultUtil(EnumCode.OK.getValue(),"Query successfully",service.selectAll(u));
        }
        return new ResultUtil(EnumCode.UNAUTHORIZED.getValue(), "Query failure");
    }

    @RequestMapping("/selectByID")
    public ResultUtil selectAll(){
        CheckApply res = service.selectByID();
        if(res != null){
            System.out.println("Query statement executed");
            return  new ResultUtil(EnumCode.OK.getValue(),"Refresh Successful",service.selectByID());
        }
        return new ResultUtil(EnumCode.UNAUTHORIZED.getValue(), "Query failure");
    }
}
