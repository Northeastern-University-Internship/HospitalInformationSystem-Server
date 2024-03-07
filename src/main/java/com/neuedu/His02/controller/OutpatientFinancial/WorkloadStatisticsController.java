package com.neuedu.His02.controller.OutpatientFinancial;

import com.neuedu.His02.entity.OutpatientFinancial.DeptWorkload;
import com.neuedu.His02.entity.OutpatientFinancial.WorkloadStatistics;
import com.neuedu.His02.service.OutpatientFinancial.IWorkloadStatisticsService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/outpatientFinancial")
public class WorkloadStatisticsController {
    @Autowired
    IWorkloadStatisticsService service;

    @RequestMapping("/getWorkloadStatisticsAll")
    public ResultUtil getWorkloadStatisticsAll(WorkloadStatistics workloadStatistics) {
        List<WorkloadStatistics> workloadStatisticsList = service.selectAll(workloadStatistics);
        if (workloadStatisticsList != null) {
            return new ResultUtil(EnumCode.OK.getValue(), "Success", workloadStatisticsList);
        }
        return new ResultUtil(EnumCode.GONE.getValue(), "Query not available");
    }

    @RequestMapping("/getDepartmentAll")
    public ResultUtil getDepartmentAll (DeptWorkload deptWorkload){
        List<DeptWorkload> departmentList = service.selectDeptList(deptWorkload);

        System.out.println(departmentList);

        if (departmentList != null) {
            return new ResultUtil(EnumCode.OK.getValue(), "Success", departmentList);
        }
        return new ResultUtil(EnumCode.GONE.getValue(), "Query not available");
    }

}
