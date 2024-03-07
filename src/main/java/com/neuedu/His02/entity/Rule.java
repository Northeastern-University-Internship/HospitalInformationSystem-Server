package com.neuedu.His02.entity;

// 表名：排班规则表
public class Rule {
    private Integer ID;// ID 自增长类型
    private String RuleName;// 规则名称
    private Integer DeptID;// 科室 ID 指向 Department( ID )
    private Integer UserID;// 医生 ID 指向 User (ID)
    private String Week;// 星期 14 位 1 和 0 组成的字符串，1 代表有班 0代表无班 14 位字符串从左到右依次表示表示星期 1-星期日，每天两位表示上下午
    private Integer DelMark;// Delete Mark 1 - Normal 0 - Deleted

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
