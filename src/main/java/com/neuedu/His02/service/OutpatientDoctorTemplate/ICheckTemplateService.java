package com.neuedu.His02.service.OutpatientDoctorTemplate;

import com.neuedu.His02.entity.CheckTemplate;

import java.util.List;

public interface ICheckTemplateService {
    public List<CheckTemplate> selectAll(CheckTemplate checkTemplate);
    public CheckTemplate selectById(CheckTemplate checkTemplate);
    public int add(CheckTemplate checkTemplate);
    public int update(CheckTemplate checkTemplate);
    public int delete(CheckTemplate checkTemplate);
}
