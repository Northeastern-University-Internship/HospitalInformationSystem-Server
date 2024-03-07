package com.neuedu.His02.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Register {
    private Integer ID;// ID 自增长类型
    private String CaseNumber;// 病历号
    private String RealName;// 姓名
    private Integer Gender;// 性别
    private String IDnumber;// 身份证号
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date BirthDate;// 出生日期
    private Integer Age;// 年龄
    private String AgeType;// 年龄类型 岁/月/天
    private String HomeAddress;// 家庭住址
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date VisitDate;// 本次看诊日期
    private String Noon;// 午别 上午/下午
    private Integer DeptID;// 本次挂号科室ID 指向 Department( ID )
    private Integer UserID;// 本次挂号医生ID 指向 User (ID)
    private Integer RegistLeID;// 本次挂号级别ID 指向 RegistLevel(ID)
    private Integer SettleID;// 结算类别 ID 指向SettleCategory(ID)
    private String IsBook;// 病历本要否 是/否
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date RegistTime;// 挂号时间
    private Integer RegisterID;// 挂号员 ID 指向 User(ID)
    private Integer VisitState;// 本次看诊状态 1-已挂号 2-医生接诊 3-看诊结束 4-已退号
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
