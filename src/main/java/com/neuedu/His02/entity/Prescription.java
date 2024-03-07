package com.neuedu.His02.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;;

// 表名：患者成药处方表
public class Prescription {
    private Integer CaseNumber;
    private String RealName;
    private String Gender;
    private Integer Age;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date PayTime;
    private String DrugsCode;// 药品编码
    private String DrugsName;// 药品名称
    private String DrugsFormat;// 药品规格
    private String DrugsUnit;// 包装单位
    private String Manufacturer;// 生产厂家
    private Integer DrugsDosageID;// 药品剂型 指向ConstatntItem（ID）
    private Integer DrugsTypeID;// 药品类型 指向ConstatntItem（ID）
    private BigDecimal DrugsPrice;// 药品单价
    private String MnemonicCode;// 拼音助记码
    private Integer ID;// ID 自增长类型
    private Integer SUM;
    private Integer MedicalID;// 病历 ID 指向 MedicalRecord(ID)
    private Integer RegistID;// 挂号 ID 指向 Register(ID)
    private Integer UserID;// 开立医生 ID 指向 User (ID)
    private String PrescriptionName;// 处方名称
    private Integer PrescriptionID;// 成药处方ID 指向 Prescription(ID)
    private Integer DrugsID;// 药品 ID 指向 Drugs (ID)
    private String DrugsUsage;// usage
    private String Dosage;// 用量
    private String Frequency;// 频次
    private BigDecimal Amount;// 数量
    private Integer State;// 状态 2-已开立 3-已交费 4-已发药 5-已退药 6-已退费

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date PrescriptionTime;// 开立时间
    private Integer PrescriptionState;// 处方状态 1-暂存 2-已开立 0-已作废

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

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public String getPrescriptionName() {
        return PrescriptionName;
    }

    public void setPrescriptionName(String prescriptionName) {
        PrescriptionName = prescriptionName;
    }

    public Date getPrescriptionTime() {
        return PrescriptionTime;
    }

    public void setPrescriptionTime(Date prescriptionTime) {
        PrescriptionTime = prescriptionTime;
    }

    public Integer getPrescriptionState() {
        return PrescriptionState;
    }

    public void setPrescriptionState(Integer prescriptionState) {
        PrescriptionState = prescriptionState;
    }

    public Integer getPrescriptionID() {
        return PrescriptionID;
    }

    public void setPrescriptionID(Integer prescriptionID) {
        PrescriptionID = prescriptionID;
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

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal amount) {
        Amount = amount;
    }

    public Integer getState() {
        return State;
    }

    public void setState(Integer state) {
        State = state;
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

    public Integer getSUM() {
        return SUM;
    }

    public void setSUM(Integer SUM) {
        this.SUM = SUM;
    }

    public String getMnemonicCode() {
        return MnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        MnemonicCode = mnemonicCode;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String name) {
        RealName = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Date getPayTime() {
        return PayTime;
    }

    public void setPayTime(Date payTime) {
        PayTime = payTime;
    }

    public Integer getCaseNumber() {
        return CaseNumber;
    }

    public void setCaseNumber(Integer caseNumber) {
        CaseNumber = caseNumber;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "CaseNumber=" + CaseNumber +
                ", RealName='" + RealName + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Age=" + Age +
                ", PayTime=" + PayTime +
                ", DrugsCode='" + DrugsCode + '\'' +
                ", DrugsName='" + DrugsName + '\'' +
                ", DrugsFormat='" + DrugsFormat + '\'' +
                ", DrugsUnit='" + DrugsUnit + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", DrugsDosageID=" + DrugsDosageID +
                ", DrugsTypeID=" + DrugsTypeID +
                ", DrugsPrice=" + DrugsPrice +
                ", MnemonicCode='" + MnemonicCode + '\'' +
                ", ID=" + ID +
                ", SUM=" + SUM +
                ", MedicalID=" + MedicalID +
                ", RegistID=" + RegistID +
                ", UserID=" + UserID +
                ", PrescriptionName='" + PrescriptionName + '\'' +
                ", PrescriptionID=" + PrescriptionID +
                ", DrugsID=" + DrugsID +
                ", DrugsUsage='" + DrugsUsage + '\'' +
                ", Dosage='" + Dosage + '\'' +
                ", Frequency='" + Frequency + '\'' +
                ", Amount=" + Amount +
                ", State=" + State +
                ", PrescriptionTime=" + PrescriptionTime +
                ", PrescriptionState=" + PrescriptionState +
                '}';
    }
}
