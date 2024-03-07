package com.neuedu.His02.mapper.OutpatientMedicalTechnologyWorkstation;


import com.neuedu.His02.entity.Fmeditem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FmeditemMapper {
    public List<Fmeditem> selectAll(Fmeditem fmeditem);
}
