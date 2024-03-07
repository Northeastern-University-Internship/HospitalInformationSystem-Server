package com.neuedu.His02.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;;

// 排班表
public class Scheduling {
    private Integer ID;// ID 自增长类型

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date SchedDate;// 排班日期
    private Integer DeptID;// 科室 ID 指向 Department( ID )
    private Integer UserID;// 医生 ID 指向 User (ID)
    private String Noon;// 午别 上午/下午
    private Integer RuleID;// 排班规则 ID 指向 Rule ( ID )

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getSchedDate() {
        return SchedDate;
    }

    public void setSchedDate(Date schedDate) {
        SchedDate = schedDate;
    }

    public Integer getDeptID() {
        return DeptID;
    }

    public void setDeptID(Integer deptID) {
        DeptID = deptID;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public String getNoon() {
        return Noon;
    }

    public void setNoon(String noon) {
        Noon = noon;
    }

    public Integer getRuleID() {
        return RuleID;
    }

    public void setRuleID(Integer ruleID) {
        RuleID = ruleID;
    }

    @Override
    public String toString() {
        return "Scheduling{" +
                "ID=" + ID +
                ", SchedDate=" + SchedDate +
                ", DeptID=" + DeptID +
                ", UserID=" + UserID +
                ", Noon='" + Noon + '\'' +
                ", RuleID=" + RuleID +
                '}';
    }
}
