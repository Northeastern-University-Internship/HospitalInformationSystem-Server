package com.neuedu.His02.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


public class CheckApply {
    private Integer Count;
    private String StartTime;
    private String EndTime;
    private String RealName;
    private String DeptName;
    private Float SUM;
    private Integer ID;
    private Integer MedicalID;
    private Integer RegistID;
    private Integer ItemID;
    private String Name;
    private String Objective;
    private String Position;
    private Integer IsUrgent;
    private Integer Num;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date CreationTime;
    private Integer DoctorID;
    private Integer CheckOperID;
    private Integer ResultOperID;
    private Integer CaseNumber;
    private Integer age;
    private Integer gender;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date CheckTime;
    private String Result;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date ResultTime;
    private Integer State;
    private Integer RecordType;

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

    public Integer getItemID() {
        return ItemID;
    }

    public void setItemID(Integer itemID) {
        ItemID = itemID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getObjective() {
        return Objective;
    }

    public void setObjective(String objective) {
        Objective = objective;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public Integer getIsUrgent() {
        return IsUrgent;
    }

    public void setIsUrgent(Integer isUrgent) {
        IsUrgent = isUrgent;
    }

    public Integer getNum() {
        return Num;
    }

    public void setNum(Integer num) {
        Num = num;
    }

    public Date getCreationTime() {
        return CreationTime;
    }

    public void setCreationTime(Date creationTime) {
        CreationTime = creationTime;
    }

    public Integer getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(Integer doctorID) {
        DoctorID = doctorID;
    }

    public Integer getCheckOperID() {
        return CheckOperID;
    }

    public void setCheckOperID(Integer checkOperID) {
        CheckOperID = checkOperID;
    }

    public Integer getResultOperID() {
        return ResultOperID;
    }

    public void setResultOperID(Integer resultOperID) {
        ResultOperID = resultOperID;
    }

    public Date getCheckTime() {
        return CheckTime;
    }

    public void setCheckTime(Date checkTime) {
        CheckTime = checkTime;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public Date getResultTime() {
        return ResultTime;
    }

    public void setResultTime(Date resultTime) {
        ResultTime = resultTime;
    }

    public Integer getState() {
        return State;
    }

    public void setState(Integer state) {
        State = state;
    }

    public Integer getRecordType() {
        return RecordType;
    }

    public void setRecordType(Integer recordType) {
        RecordType = recordType;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String realName) {
        RealName = realName;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public Float getSUM() {
        return SUM;
    }

    public void setSUM(Float SUM) {
        this.SUM = SUM;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public Integer getCount() {
        return Count;
    }

    public void setCount(Integer count) {
        Count = count;
    }

    public Integer getCaseNumber() {
        return CaseNumber;
    }

    public void setCaseNumber(Integer caseNumber) {
        CaseNumber = caseNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "CheckApply{" +
                "Count=" + Count +
                ", StartTime='" + StartTime + '\'' +
                ", EndTime='" + EndTime + '\'' +
                ", RealName='" + RealName + '\'' +
                ", DeptName='" + DeptName + '\'' +
                ", SUM=" + SUM +
                ", ID=" + ID +
                ", MedicalID=" + MedicalID +
                ", RegistID=" + RegistID +
                ", ItemID=" + ItemID +
                ", Name='" + Name + '\'' +
                ", Objective='" + Objective + '\'' +
                ", Position='" + Position + '\'' +
                ", IsUrgent=" + IsUrgent +
                ", Num=" + Num +
                ", CreationTime=" + CreationTime +
                ", DoctorID=" + DoctorID +
                ", CheckOperID=" + CheckOperID +
                ", ResultOperID=" + ResultOperID +
                ", CaseNumber=" + CaseNumber +
                ", age=" + age +
                ", gender=" + gender +
                ", CheckTime=" + CheckTime +
                ", Result='" + Result + '\'' +
                ", ResultTime=" + ResultTime +
                ", State=" + State +
                ", RecordType=" + RecordType +
                '}';
    }
}

