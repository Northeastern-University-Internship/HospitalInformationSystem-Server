package com.neuedu.His02.mapper.OutpatientFinancial;

import com.neuedu.His02.entity.OutpatientFinancial.DeptWorkload;
import com.neuedu.His02.entity.OutpatientFinancial.WorkloadStatistics;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface WorkloadStatisticsMapper {
    public List<WorkloadStatistics> selectAll(WorkloadStatistics workloadStatistics);
    public List<DeptWorkload> selectDeptList(DeptWorkload department);
}
