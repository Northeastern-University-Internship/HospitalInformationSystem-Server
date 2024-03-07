package com.neuedu.His02.entity;

// Table Name: List of Patent Medicine Templates
public class DrugsDetailed {
    private Integer ID;
    private Integer DrugsTempID;
    private Integer DrugsID;
    private String DrugsUsage;
    private String Dosage;
    private String Frequency;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getDrugsTempID() {
        return DrugsTempID;
    }

    public void setDrugsTempID(Integer drugsTempID) {
        DrugsTempID = drugsTempID;
    }

    public Integer getDrugsID() {
        return DrugsID;
    }

    public void setDrugsID(Integer drugsID) {
        DrugsID = drugsID;
    }

    public String getDrugsUsage() {
        return DrugsUsage;
    }

    public void setDrugsUsage(String drugsUsage) {
        DrugsUsage = drugsUsage;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String dosage) {
        Dosage = dosage;
    }

    public String getFrequency() {
        return Frequency;
    }

    public void setFrequency(String frequency) {
        Frequency = frequency;
    }

    @Override
    public String toString() {
        return "DrugsDetailed{" +
                "ID=" + ID +
                ", DrugsTempID=" + DrugsTempID +
                ", DrugsID=" + DrugsID +
                ", DrugsUsage='" + DrugsUsage + '\'' +
                ", Dosage='" + Dosage + '\'' +
                ", Frequency='" + Frequency + '\'' +
                '}';
    }
}
