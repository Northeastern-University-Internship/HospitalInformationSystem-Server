package com.neuedu.His02.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;;

// Table Name: Patent Medicine Prescription Template Table
public class DrugsTemplate {
    private Integer ID;
    private String Name;
    private Integer UserID;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date CreationTime;
    private String Scope;
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

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    @Override
    public String toString() {
        return "DrugsTemplate{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", UserID=" + UserID +
                ", CreationTime=" + CreationTime +
                ", Scope='" + Scope + '\'' +
                ", DelMark=" + DelMark +
                '}';
    }
}
