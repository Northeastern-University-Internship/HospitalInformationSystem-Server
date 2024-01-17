package com.neusoft.his.service.impl;

import com.neusoft.his.dto.Message;
import com.neusoft.his.entity.Patient;
import com.neusoft.his.mapper.PatientMapper;
import com.neusoft.his.mapper.UsersMapper;
import com.neusoft.his.service.IPatientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yhc
 * @since 2024-01-16
 */
@Service
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements IPatientService {
    @Autowired
    PatientMapper patientMapper;
    @Override
    public Message registerPatient(Patient patient) {
        Message message=new Message();

        int num = patientMapper.registerPatient(patient);

        if(num==1){
            message.setStatusCode(200);
            message.setMsg("ok");
        }else{
            message.setStatusCode(500);
            message.setMsg("error");

        }
        return message;
    }
    @Override
    public Message canceRegistration(int idno) {
        Message message = new Message();

        int num = patientMapper.cancelRegisteration(idno);

        if (num == 1) {
            message.setStatusCode(200);
            message.setMsg("ok");
        } else {
            message.setStatusCode(500);
            message.setMsg("error");

        }
        return message;

    }
}
