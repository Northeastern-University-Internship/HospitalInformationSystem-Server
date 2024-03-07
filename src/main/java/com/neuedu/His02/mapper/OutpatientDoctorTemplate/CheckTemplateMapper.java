package com.neuedu.His02.mapper.OutpatientDoctorTemplate;

import com.neuedu.His02.entity.CheckTemplate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author BRThree
 * @since 2021-12-17
 */
@Mapper
public interface CheckTemplateMapper{
    public List<CheckTemplate> selectAll(CheckTemplate checkTemplate);
    public CheckTemplate selectById(CheckTemplate checkTemplate);
    public int add(CheckTemplate checkTemplate);
    public int update(CheckTemplate checkTemplate);
    public int delete(CheckTemplate checkTemplate);
}
