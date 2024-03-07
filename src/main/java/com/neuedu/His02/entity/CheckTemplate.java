package com.neuedu.His02.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class CheckTemplate {
    private Integer ID;
    private String Name;
    private Integer UserID;

    private Integer OperatorID;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date CreationTime;
    private String Scope;
    private Integer RecordType;// Record Type 1 - Inspection 2 - Inspection 3 - Disposition
    private Integer DelMark;

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

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public Date getCreationTime() {
        return CreationTime;
    }

    public void setCreationTime(Date creationTime) {
        CreationTime = creationTime;
    }

    public String getScope() {
        return Scope;
    }

    public void setScope(String scope) {
        Scope = scope;
    }

    public Integer getRecordType() {
        return RecordType;
    }

    public void setRecordType(Integer recordType) {
        RecordType = recordType;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    public Integer getOperatorID(){
        return OperatorID;
    }

    public void setOperatorID(Integer operatorID) {
        OperatorID = operatorID;
    }

    @Override
    public String toString() {
        return "CheckTemplate{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", UserID=" + UserID +
                ", CreationTime=" + CreationTime +
                ", Scope='" + Scope + '\'' +
                ", RecordType=" + RecordType +
                ", DelMark=" + DelMark +
                ", OperatorID=" + OperatorID +
                '}';
    }
}
