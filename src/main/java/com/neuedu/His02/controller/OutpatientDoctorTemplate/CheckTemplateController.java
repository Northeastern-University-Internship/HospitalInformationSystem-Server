package com.neuedu.His02.controller.OutpatientDoctorTemplate;

import com.neuedu.His02.entity.CheckTemplate;
import com.neuedu.His02.service.OutpatientDoctorTemplate.ICheckTemplateService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RestController
public class CheckTemplateController {
    @Autowired
    private ICheckTemplateService service;


    @RequestMapping("/getCheckTemplateAll")
    public ResultUtil getCheckTemplateAll(CheckTemplate checkTemplate) {
        List<CheckTemplate> checkTemplateList = service.selectAll(checkTemplate);
        if (checkTemplateList != null) {
            return new ResultUtil(EnumCode.OK.getValue(), "Success", checkTemplateList);
        }
        return new ResultUtil(EnumCode.GONE.getValue(), "not available");
    }


    @RequestMapping("/getCheckTemplateByID")
    public ResultUtil getCheckTemplateByID(CheckTemplate checkTemplate) {
        CheckTemplate param = service.selectById(checkTemplate);
        if (param != null) {
            return new ResultUtil(EnumCode.OK.getValue(), "Success", param);
        }
        return new ResultUtil(EnumCode.GONE.getValue(), "not available");
    }


    @RequestMapping("/addCheckTemplate")
    public ResultUtil addCheckTemplate(@RequestBody CheckTemplate checkTemplate) {
        // Set the current time as the creation time
        checkTemplate.setCreationTime(new Date());
        // Set Delete Mark as Normal
        checkTemplate.setDelMark(1);

        if (service.add(checkTemplate) == 1) {
            return new ResultUtil(EnumCode.OK.getValue(), "Success");
        }

        return new ResultUtil(EnumCode.BAD_REQUEST.getValue(), "Failed");
    }


    @RequestMapping("/deleteCheckTemplate")
    public ResultUtil deleteCheckTemplate(@RequestBody CheckTemplate checkTemplate) {
        System.out.println(checkTemplate);
        if (checkTemplate.getOperatorID().equals(checkTemplate.getUserID())) {

            checkTemplate.setDelMark(0);

            if (service.update(checkTemplate) == 1) {
                return new ResultUtil(EnumCode.OK.getValue(), "Success");
            }
            return new ResultUtil(EnumCode.BAD_REQUEST.getValue(), "Delete Failed");
        }

        return new ResultUtil(EnumCode.FORBIDDEN.getValue(), "Delete failed, no permissions");
    }

    /**
     * 修改模板
     */
    @RequestMapping("/updateCheckTemplate")
    public ResultUtil updateCheckTemplate(@RequestBody CheckTemplate checkTemplate) {
        if (checkTemplate.getOperatorID().equals(checkTemplate.getUserID())) {
            if (service.update(checkTemplate) == 1) {
                return new ResultUtil(EnumCode.OK.getValue(), "Success");
            }
            return new ResultUtil(EnumCode.BAD_REQUEST.getValue(), "Failed");
        }
        return new ResultUtil(EnumCode.FORBIDDEN.getValue(), "Delete failed, no permissions");
    }
}
