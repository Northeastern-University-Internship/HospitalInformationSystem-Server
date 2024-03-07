package com.neuedu.His02.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;;

// Table：Patient Assessment / Diagnosis Form
public class MedicalDisease {
    private Integer ID;
    private Integer MedicalID;
    private Integer RegistID;
    private Integer DiseaseID;
    private Integer DiagnoseType;// Diagnostic Type 1 - Western Medicine 2 - Chinese Medicine

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date GetSiskDate;// Date of onset
    private Integer DiagnoseCate;// Diagnosis Category 1 - First Visit 2 - Final Visit

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

    public Integer getDiseaseID() {
        return DiseaseID;
    }

    public void setDiseaseID(Integer diseaseID) {
        DiseaseID = diseaseID;
    }

    public Integer getDiagnoseType() {
        return DiagnoseType;
    }

    public void setDiagnoseType(Integer diagnoseType) {
        DiagnoseType = diagnoseType;
    }

    public Date getGetSiskDate() {
        return GetSiskDate;
    }

    public void setGetSiskDate(Date getSiskDate) {
        GetSiskDate = getSiskDate;
    }

    public Integer getDiagnoseCate() {
        return DiagnoseCate;
    }

    public void setDiagnoseCate(Integer diagnoseCate) {
        DiagnoseCate = diagnoseCate;
    }

    @Override
    public String toString() {
        return "MedicalDisease{" +
                "ID=" + ID +
                ", MedicalID=" + MedicalID +
                ", RegistID=" + RegistID +
                ", DiseaseID=" + DiseaseID +
                ", DiagnoseType=" + DiagnoseType +
                ", GetSiskDate=" + GetSiskDate +
                ", DiagnoseCate=" + DiagnoseCate +
                '}';
    }
}
