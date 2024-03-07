package com.neuedu.His02.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;;

// 表名：操作员日结表
public class RegistWork {
    private Integer ID;// ID 自增长类型
    private Integer RegisterID; // 收费人员 ID 指向 User (ID)

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date StartTime;// 日结起始时间

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date EndTime;// 日结结束时间

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
