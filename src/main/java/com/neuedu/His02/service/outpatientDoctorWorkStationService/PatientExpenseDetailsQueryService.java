package com.neuedu.His02.service.outpatientDoctorWorkStationService;

import com.neuedu.His02.entity.PatientCosts;
import com.neuedu.His02.entity.Register;
import com.neuedu.His02.entity.User;

import java.util.List;

public interface PatientExpenseDetailsQueryService {
    public List<Register> initPatients(User user);
    public List<Register> searchByName(Register register);
    public List<Register> searchByNumber(Register register);
    public List<PatientCosts> choosePatient(Register register);
}
