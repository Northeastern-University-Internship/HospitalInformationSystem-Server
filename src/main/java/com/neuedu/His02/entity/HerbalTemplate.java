package com.neuedu.His02.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;;

// Table：Herbal Prescription Template Sheet
public class HerbalTemplate {
    private Integer ID;
    private String Name;
    private Integer DoctorID;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date CreationTime;
    private String PrescriptioType;// Prescription Type Decoction / Wine Bubble / Powder / Pill / Capsule etc.
    private Integer PayNumber;// Pay number
    private String DrugsUsage;// usage
    private String Therapy;// Therapeutic method
    private String Detailed;// Treatment in detail
    private String Advice;// prescription
    private String Scope;// Hospital / Department / Individual
    private Integer DelMark;// Delete Mark 1 - Normal 0 - Deleted

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(Integer doctorID) {
        DoctorID = doctorID;
    }

    public Date getCreationTime() {
        return CreationTime;
    }

    public void setCreationTime(Date creationTime) {
        CreationTime = creationTime;
    }

    public String getPrescriptioType() {
        return PrescriptioType;
    }

    public void setPrescriptioType(String prescriptioType) {
        PrescriptioType = prescriptioType;
    }

    public Integer getPayNumber() {
        return PayNumber;
    }

    public void setPayNumber(Integer payNumber) {
        PayNumber = payNumber;
    }

    public String getDrugsUsage() {
        return DrugsUsage;
    }

    public void setDrugsUsage(String drugsUsage) {
        DrugsUsage = drugsUsage;
    }

    public String getTherapy() {
        return Therapy;
    }

    public void setTherapy(String therapy) {
        Therapy = therapy;
    }

    public String getDetailed() {
        return Detailed;
    }

    public void setDetailed(String detailed) {
        Detailed = detailed;
    }

    public String getAdvice() {
        return Advice;
    }

    public void setAdvice(String advice) {
        Advice = advice;
    }

    public String getScope() {
        return Scope;
    }

    public void setScope(String scope) {
        Scope = scope;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    @Override
    public String toString() {
        return "HerbalTemplate{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", DoctorID=" + DoctorID +
                ", CreationTime=" + CreationTime +
                ", PrescriptioType='" + PrescriptioType + '\'' +
                ", PayNumber=" + PayNumber +
                ", DrugsUsage='" + DrugsUsage + '\'' +
                ", Therapy='" + Therapy + '\'' +
                ", Detailed='" + Detailed + '\'' +
                ", Advice='" + Advice + '\'' +
                ", Scope='" + Scope + '\'' +
                ", DelMark=" + DelMark +
                '}';
    }
}
