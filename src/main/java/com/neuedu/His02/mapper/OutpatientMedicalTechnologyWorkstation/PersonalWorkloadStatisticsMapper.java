package com.neuedu.His02.mapper.OutpatientMedicalTechnologyWorkstation;

import com.neuedu.His02.entity.CheckApply;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface PersonalWorkloadStatisticsMapper {
    public List<CheckApply> selectAll(CheckApply u);
    public CheckApply selectByID();
}
