package com.neusoft.his.mapper;

import com.neusoft.his.entity.Patient;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neusoft.his.entity.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yhc
 * @since 2024-01-16
 */
@Mapper
@Repository
public interface PatientMapper extends BaseMapper<Patient> {
    @Insert(" insert into patient(patientName,patientGender,dob,age,idNumber,address,contactNo,department,consultingPhysician,total) values(#{patientname},#{patientgender},#{dob},#{age},#{id_number},#{address},#{contactno},#{department},#{consultingphysician},#{total})")
    public int registerPatient(Patient patient);


    @Delete("delete from patient where idNumber=#{id_Number}")
    public  int cancelRegisteration(int idno);
}
