package com.neuedu.His02.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;;


public class RegistWork {
    private Integer ID;
    private Integer RegisterID;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date StartTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date EndTime;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getRegisterID() {
        return RegisterID;
    }

    public void setRegisterID(Integer registerID) {
        RegisterID = registerID;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public Date getEndTime() {
        return EndTime;
    }

    public void setEndTime(Date endTime) {
        EndTime = endTime;
    }

    @Override
    public String toString() {
        return "RegistWork{" +
                "ID=" + ID +
                ", RegisterID=" + RegisterID +
                ", StartTime=" + StartTime +
                ", EndTime=" + EndTime +
                '}';
    }
}
