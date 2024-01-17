package com.neusoft.his.controller;


import com.neusoft.his.dto.Message;
import com.neusoft.his.entity.Patient;
import com.neusoft.his.entity.Users;
import com.neusoft.his.service.IPatientService;
import com.neusoft.his.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yhc
 * @since 2024-01-16
 */
@RestController
@RequestMapping("/his/patient")
public class PatientController {

    @Autowired
    IPatientService iPatientService;
    @PostMapping("registerPatient")
    public Message insertUser(@RequestBody Patient patient){
        System.out.println("Register called");
        Message message=iPatientService.registerPatient(patient);
        System.out.println("Success....");
        return message;
    }

    @GetMapping("cancelRegistration")
    public Message deleteEmp(int id_number){
        Message message=iPatientService.canceRegistration(id_number);
        return message;
    }
}

