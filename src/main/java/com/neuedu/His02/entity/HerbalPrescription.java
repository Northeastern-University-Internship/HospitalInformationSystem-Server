package com.neuedu.His02.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;;

// Table Name: Herbal Prescription Form for Patients
public class HerbalPrescription {
    private Integer ID;
    private Integer MedicalID;
    private Integer RegistID;
    private Integer DoctorID;
    private String PrescriptionName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date CreationTime;
    private String PrescriptioType;// Prescription Type Decoction / Wine Bubble / Powder / Pill / Capsule etc.
    private Integer PayNumber;
    private String Frequency;
    private String DrugsUsage;// Usage Internal / External Use
    private String Therapy;
    private String Detailed;
    private String Advice;
    private Integer State;// Status 1 - Temporary 2 - Opened 3 - Paid 4 - Taken 5 - Returned 6 - Refund 0 - Invalid

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getMedicalID() {
        return MedicalID;
    }

    public void setMedicalID(Integer medicalID) {
        MedicalID = medicalID;
    }

    public Integer getRegistID() {
        return RegistID;
    }

    public void setRegistID(Integer registID) {
        RegistID = registID;
    }

    public Integer getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(Integer doctorID) {
        DoctorID = doctorID;
    }

    public String getPrescriptionName() {
        return PrescriptionName;
    }

    public void setPrescriptionName(String prescriptionName) {
        PrescriptionName = prescriptionName;
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

    public String getFrequency() {
        return Frequency;
    }

    public void setFrequency(String frequency) {
        Frequency = frequency;
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

    public Integer getState() {
        return State;
    }

    public void setState(Integer state) {
        State = state;
    }

    @Override
    public String toString() {
        return "HerbalPrescription{" +
                "ID=" + ID +
                ", MedicalID=" + MedicalID +
                ", RegistID=" + RegistID +
                ", DoctorID=" + DoctorID +
                ", PrescriptionName='" + PrescriptionName + '\'' +
                ", CreationTime=" + CreationTime +
                ", PrescriptioType='" + PrescriptioType + '\'' +
                ", PayNumber=" + PayNumber +
                ", Frequency='" + Frequency + '\'' +
                ", DrugsUsage='" + DrugsUsage + '\'' +
                ", Therapy='" + Therapy + '\'' +
                ", Detailed='" + Detailed + '\'' +
                ", Advice='" + Advice + '\'' +
                ", State=" + State +
                '}';
    }
}
