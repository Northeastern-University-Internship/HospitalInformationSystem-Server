package com.neuedu.His02.controller.OutpatientMedicalTechnologyWorkstation;

import com.neuedu.His02.entity.CheckApply;
import com.neuedu.His02.service.OutpatientMedicalTechnologyWorkstation.InspectionAndTestRegisterService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InspectionAndTestRegisterController {

       @Autowired
        private InspectionAndTestRegisterService service;


        @RequestMapping("/getCheckApplyAll")
        public ResultUtil getCheckApplyAll(CheckApply CheckApply) {
            List<CheckApply> CheckApplyList = service.selectAll(CheckApply);
            if (CheckApplyList != null) {
                return new ResultUtil(EnumCode.OK.getValue(), "Success", CheckApplyList);
            }
            return new ResultUtil(EnumCode.GONE.getValue(), "Query not available");
        }

        @RequestMapping("/updateCheckApplyState")
        public ResultUtil updateCheckApply(CheckApply CheckApply) {
            System.out.println(CheckApply);
            int i  = service.updateState(CheckApply);
            if (i != 0) {
                return new ResultUtil(EnumCode.OK.getValue(), "Success", i);
            }
            return new ResultUtil(EnumCode.GONE.getValue(), "Query not available");
        }
}
