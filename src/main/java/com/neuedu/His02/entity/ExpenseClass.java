package com.neuedu.His02.entity;

//Table Name: Cost Chart of Accounts
public class ExpenseClass {
    private Integer ID;
    private String ExpCode;// Expense Account Code
    private String ExpName;// Cost Account Name
    private Integer DelMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getExpCode() {
        return ExpCode;
    }

    public void setExpCode(String expCode) {
        ExpCode = expCode;
    }

    public String getExpName() {
        return ExpName;
    }

    public void setExpName(String expName) {
        ExpName = expName;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    @Override
    public String toString() {
        return "ExpenseClass{" +
                "ID=" + ID +
                ", ExpCode='" + ExpCode + '\'' +
                ", ExpName='" + ExpName + '\'' +
                ", DelMark=" + DelMark +
                '}';
    }
}
