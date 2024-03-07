package com.neuedu.His02.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;;

// Table Name: Drug List Table
public class Drugs {
    private Integer ID;
    private String DrugsCode;
    private String DrugsName;
    private String DrugsFormat;
    private String DrugsUnit;
    private String Manufacturer;
    private Integer DrugsDosageID;
    private Integer DrugsTypeID;
    private BigDecimal DrugsPrice;
    private String MnemonicCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date CreationDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date LastUpdateDate;
    private Integer DelMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDrugsCode() {
        return DrugsCode;
    }

    public void setDrugsCode(String drugsCode) {
        DrugsCode = drugsCode;
    }

    public String getDrugsName() {
        return DrugsName;
    }

    public void setDrugsName(String drugsName) {
        DrugsName = drugsName;
    }

    public String getDrugsFormat() {
        return DrugsFormat;
    }

    public void setDrugsFormat(String drugsFormat) {
        DrugsFormat = drugsFormat;
    }

    public String getDrugsUnit() {
        return DrugsUnit;
    }

    public void setDrugsUnit(String drugsUnit) {
        DrugsUnit = drugsUnit;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public Integer getDrugsDosageID() {
        return DrugsDosageID;
    }

    public void setDrugsDosageID(Integer drugsDosageID) {
        DrugsDosageID = drugsDosageID;
    }

    public Integer getDrugsTypeID() {
        return DrugsTypeID;
    }

    public void setDrugsTypeID(Integer drugsTypeID) {
        DrugsTypeID = drugsTypeID;
    }

    public BigDecimal getDrugsPrice() {
        return DrugsPrice;
    }

    public void setDrugsPrice(BigDecimal drugsPrice) {
        DrugsPrice = drugsPrice;
    }

    public String getMnemonicCode() {
        return MnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        MnemonicCode = mnemonicCode;
    }
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getCreationDate() {
        return CreationDate;
    }
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return LastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        LastUpdateDate = lastUpdateDate;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    @Override
    public String toString() {
        return "Drugs{" +
                "ID=" + ID +
                ", DrugsCode='" + DrugsCode + '\'' +
                ", DrugsName='" + DrugsName + '\'' +
                ", DrugsFormat='" + DrugsFormat + '\'' +
                ", DrugsUnit='" + DrugsUnit + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", DrugsDosageID=" + DrugsDosageID +
                ", DrugsTypeID=" + DrugsTypeID +
                ", DrugsPrice=" + DrugsPrice +
                ", MnemonicCode='" + MnemonicCode + '\'' +
                ", CreationDate=" + CreationDate +
                ", LastUpdateDate=" + LastUpdateDate +
                ", DelMark=" + DelMark +
                '}';
    }
}
