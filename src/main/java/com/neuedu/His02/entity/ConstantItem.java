package com.neuedu.His02.entity;


public class ConstantItem {
    private Integer ID;
    private Integer ConstantTypeID;
    private String ConstantCode;
    private String ConstantName;// Constant item names such as male, female, etc.
    private Integer DelMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getConstantTypeID() {
        return ConstantTypeID;
    }

    public void setConstantTypeID(Integer constantTypeID) {
        ConstantTypeID = constantTypeID;
    }

    public String getConstantCode() {
        return ConstantCode;
    }

    public void setConstantCode(String contantCode) {
        ConstantCode = contantCode;
    }

    public String getConstantName() {
        return ConstantName;
    }

    public void setConstantName(String constantName) {
        ConstantName = constantName;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    @Override
    public String toString() {
        return "ConstantItem{" +
                "ID=" + ID +
                ", ConstantTypeID=" + ConstantTypeID +
                ", ConstantCode='" + ConstantCode + '\'' +
                ", ConstantName='" + ConstantName + '\'' +
                ", DelMark=" + DelMark +
                '}';
    }
}
