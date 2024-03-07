package com.neuedu.His02.mapper.outpatientPharmacyWorkstationMapper;

import com.neuedu.His02.entity.Prescription;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: ZJH
 * @Date: 2021/12/19/15:18
 * @Description:
 */
@Mapper
public interface OutpatientDispensingMapper {
    public List<Prescription> selectAll(Prescription u);
    public int add(Prescription u);
    public int update(String id);
    public int delete(Prescription u);
    public Prescription selectById(Prescription u);
}
