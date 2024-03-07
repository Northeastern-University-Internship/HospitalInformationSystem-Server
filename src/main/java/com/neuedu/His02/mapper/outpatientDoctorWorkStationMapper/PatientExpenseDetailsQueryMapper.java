package com.neuedu.His02.mapper.outpatientDoctorWorkStationMapper;

import com.neuedu.His02.entity.PatientCosts;
import com.neuedu.His02.entity.Register;
import com.neuedu.His02.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientExpenseDetailsQueryMapper {
    public List<Register> initPatients(User user);
    public List<Register> searchByName(Register register);
    public List<Register> searchByNumber(Register register);
    public List<PatientCosts> choosePatient(Register register);
}
