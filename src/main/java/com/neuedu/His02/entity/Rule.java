package com.neuedu.His02.entity;

// 表名：排班规则表
public class Rule {
    private Integer ID;// ID 自增长类型
    private String RuleName;
    private Integer DeptID;
    private Integer UserID;
    private String Week;
    private Integer DelMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getRuleName() {
        return RuleName;
    }

    public void setRuleName(String ruleName) {
        RuleName = ruleName;
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

    public String getWeek() {
        return Week;
    }

    public void setWeek(String week) {
        Week = week;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "ID=" + ID +
                ", RuleName='" + RuleName + '\'' +
                ", DeptID=" + DeptID +
                ", UserID=" + UserID +
                ", Week='" + Week + '\'' +
                ", DelMark=" + DelMark +
                '}';
    }
}
