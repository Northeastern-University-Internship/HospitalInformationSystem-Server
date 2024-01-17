package com.neusoft.his.service;

import com.neusoft.his.dto.Message;
import com.neusoft.his.entity.Patient;
import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.his.entity.Users;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yhc
 * @since 2024-01-16
 */
public interface IPatientService extends IService<Patient> {
    public Message registerPatient(Patient patient);
    public Message  canceRegistration(int id_number);
}
