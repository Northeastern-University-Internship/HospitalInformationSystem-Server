package com.neuedu.His02.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Register {
    private Integer ID;
    private String CaseNumber;
    private String RealName;
    private Integer Gender;
    private String IDnumber;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date BirthDate;
    private Integer Age;
    private String AgeType;
    private String HomeAddress;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date VisitDate;
    private String Noon;
    private Integer DeptID;
    private Integer UserID;
    private Integer RegistLeID;
    private Integer SettleID;
    private String IsBook;
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date RegistTime;
    private Integer RegisterID;
    private Integer VisitState;
    private String StartTime;
    private String EndTime;


    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getStartTime() {
        return StartTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public Register() {
    }

    public Register(Integer ID, String caseNumber, String realName, Integer gender, String IDnumber, Date birthDate, Integer age, String ageType, String homeAddress, Date visitDate, String noon, Integer deptID, Integer userID, Integer registLeID, Integer settleID, String isBook, Date registTime, Integer registerID, Integer visitState, String startTime, String endTime) {
        this.ID = ID;
        CaseNumber = caseNumber;
        RealName = realName;
        Gender = gender;
        this.IDnumber = IDnumber;
        BirthDate = birthDate;
        Age = age;
        AgeType = ageType;
        HomeAddress = homeAddress;
        VisitDate = visitDate;
        Noon = noon;
        DeptID = deptID;
        UserID = userID;
        RegistLeID = registLeID;
        SettleID = settleID;
        IsBook = isBook;
        RegistTime = registTime;
        RegisterID = registerID;
        VisitState = visitState;
        StartTime = startTime;
        EndTime = endTime;
    }

    public String getCaseNumber() {
        return CaseNumber;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getBirthDate() {
        return BirthDate;
    }

    public Integer getAge() {
        return Age;
    }

    public String getAgeType() {
        return AgeType;
    }

    public Integer getDeptID() {
        return DeptID;
    }

    public Integer getID() {
        return ID;
    }

    public String getRealName() {
        return RealName;
    }

    public Integer getGender() {
        return Gender;
    }

    public String getIDnumber() {
        return IDnumber;
    }

    public String getHomeAddress() {
        return HomeAddress;
    }
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getVisitDate() {
        return VisitDate;
    }

    public String getNoon() {
        return Noon;
    }

    public Integer getUserID() {
        return UserID;
    }

    public Integer getRegistLeID() {
        return RegistLeID;
    }

    public Integer getSettleID() {
        return SettleID;
    }

    public String getIsBook() {
        return IsBook;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getRegistTime() {
        return RegistTime;
    }

    public Integer getRegisterID() {
        return RegisterID;
    }

    public Integer getVisitState() {
        return VisitState;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setCaseNumber(String caseNumber) {
        CaseNumber = caseNumber;
    }

    public void setRealName(String realName) {
        RealName = realName;
    }

    public void setGender(Integer gender) {
        Gender = gender;
    }

    public void setIDnumber(String iDnumber) {
        IDnumber = iDnumber;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public void setAgeType(String ageType) {
        AgeType = ageType;
    }

    public void setHomeAddress(String homeAddress) {
        HomeAddress = homeAddress;
    }

    public void setVisitDate(Date visitDate) {
        VisitDate = visitDate;
    }

    public void setNoon(String noon) {
        Noon = noon;
    }

    public void setDeptID(Integer deptID) {
        DeptID = deptID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public void setRegistLeID(Integer registLeID) {
        RegistLeID = registLeID;
    }

    public void setSettleID(Integer settleID) {
        SettleID = settleID;
    }

    public void setIsBook(String isBook) {
        IsBook = isBook;
    }

    public void setRegistTime(Date registTime) {
        RegistTime = registTime;
    }

    public void setRegisterID(Integer registerID) {
        RegisterID = registerID;
    }

    public void setVisitState(Integer visitState) {
        VisitState = visitState;
    }
}
