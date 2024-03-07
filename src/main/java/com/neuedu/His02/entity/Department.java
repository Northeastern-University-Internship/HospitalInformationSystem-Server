package com.neuedu.His02.entity;

// Table name: section table
public class Department {
    private Integer ID;
    private String DeptCode;
    private String DeptName;
    private Integer DeptCategoryID;
    private Integer DeptType;// Department type 1 - clinical 2 - medical technology 3 - financial 4 - administrative 5 - other
    private Integer DelMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDeptCode() {
        return DeptCode;
    }

    public void setDeptCode(String deptCode) {
        DeptCode = deptCode;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public Integer getDeptCategoryID() {
        return DeptCategoryID;
    }

    public void setDeptCategoryID(Integer deptCategoryID) {
        DeptCategoryID = deptCategoryID;
    }

    public Integer getDeptType() {
        return DeptType;
    }

    public void setDeptType(Integer deptType) {
        DeptType = deptType;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    @Override
    public String toString() {
        return "Department{" +
                "ID=" + ID +
                ", DeptCode='" + DeptCode + '\'' +
                ", DeptName='" + DeptName + '\'' +
                ", DeptCategoryID=" + DeptCategoryID +
                ", DeptType=" + DeptType +
                ", DelMark=" + DelMark +
                '}';
    }
}
