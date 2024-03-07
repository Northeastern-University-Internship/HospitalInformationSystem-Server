package com.neuedu.His02.service.OutpatientFinancial;

import com.neuedu.His02.entity.OutpatientFinancial.DeptWorkload;
import com.neuedu.His02.entity.OutpatientFinancial.WorkloadStatistics;

import java.util.List;

public interface IWorkloadStatisticsService {
    public List<WorkloadStatistics> selectAll(WorkloadStatistics workloadStatistics);
    public List<DeptWorkload> selectDeptList(DeptWorkload department);
}
