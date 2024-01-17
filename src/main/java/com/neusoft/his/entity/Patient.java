package com.neusoft.his.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yhc
 * @since 2024-01-16
 */
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("patientName")
    private String patientname;

    @TableField("patientGender")
    private String patientgender;

    private String dob;

    private String age;

    @TableField("idNumber")
    private Integer id_number;

    private String address;

    @TableField("contactNo")
    private String contactno;

    private String department;

    @TableField("consultingPhysician")
    private String consultingphysician;

    private Integer total;


    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getPatientgender() {
        return patientgender;
    }

    public void setPatientgender(String patientgender) {
        this.patientgender = patientgender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getId_number() {
        return id_number;
    }

    public void setId_number(Integer id_number) {
        this.id_number = id_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getConsultingphysician() {
        return consultingphysician;
    }

    public void setConsultingphysician(String consultingphysician) {
        this.consultingphysician = consultingphysician;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Patient{" +
        "patientname=" + patientname +
        ", patientgender=" + patientgender +
        ", dob=" + dob +
        ", age=" + age +
        ", idnumber=" + id_number +
        ", address=" + address +
        ", contactno=" + contactno +
        ", department=" + department +
        ", consultingphysician=" + consultingphysician +
        ", total=" + total +
        "}";
    }
}
