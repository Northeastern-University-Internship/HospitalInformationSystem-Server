package com.neuedu.His02.entity.OutpatientFinancial;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class WorkloadStatistics {
    private Integer ID;
    private String Name;
    private float Price;
    private float Amount;
    private Integer DeptID;
    private String DeptName;
    private String DeptType;
    private Integer CreateOperID;
    private Integer ExpID;
    private String ExpName;
    private Integer DrugsID;
    private String ConstantName;
    private String StartTime;
    private String EndTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date Createtime;

    public Date getCreatetime() {
        return Createtime;
    }

    public void setCreatetime(Date createtime) {
        Createtime = createtime;
    }

    public WorkloadStatistics() {
    }


    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

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

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float amount) {
        Amount = amount;
    }

    public Integer getDeptID() {
        return DeptID;
    }

    public void setDeptID(Integer deptID) {
        DeptID = deptID;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public String getDeptType() {
        return DeptType;
    }

    public void setDeptType(String deptType) {
        DeptType = deptType;
    }

    public Integer getCreateOperID() {
        return CreateOperID;
    }

    public void setCreateOperID(Integer createOperID) {
        CreateOperID = createOperID;
    }

    public Integer getExpID() {
        return ExpID;
    }

    public void setExpID(Integer expID) {
        ExpID = expID;
    }

    public String getExpName() {
        return ExpName;
    }

    public void setExpName(String expName) {
        ExpName = expName;
    }

    public Integer getDrugsID() {
        return DrugsID;
    }

    public void setDrugsID(Integer drugsID) {
        DrugsID = drugsID;
    }

    public String getConstantName() {
        return ConstantName;
    }

    public void setConstantName(String constantName) {
        ConstantName = constantName;
    }

    @Override
    public String toString() {
        return "WorkloadStatistics{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Price=" + Price +
                ", Amount=" + Amount +
                ", DeptID=" + DeptID +
                ", DeptName='" + DeptName + '\'' +
                ", DeptType='" + DeptType + '\'' +
                ", CreateOperID=" + CreateOperID +
                ", ExpID=" + ExpID +
                ", ExpName='" + ExpName + '\'' +
                ", DrugsID=" + DrugsID +
                ", ConstantName='" + ConstantName + '\'' +
                ", StartTime='" + StartTime + '\'' +
                ", EndTime='" + EndTime + '\'' +
                ", Createtime=" + Createtime +
                '}';
    }
}
