package com.neuedu.His02.mapper.OutpatientMedicalTechnologyWorkstation;

import com.neuedu.His02.entity.CheckApply;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: ZJH
 * @Date: 2021/12/24/12:50
 * @Description:
 */
@Mapper
public interface PersonalWorkloadStatisticsMapper {
    public List<CheckApply> selectAll(CheckApply u);
    public CheckApply selectByID();
}
