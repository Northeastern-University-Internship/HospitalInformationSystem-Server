package com.neuedu.His02.entity;

// Table Name: Constant Category Table
public class ConstantType {
    private Integer ID;
    private String ConstantTypeCode;
    private String ConstantTypeName;
    private Integer DelMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getConstantTypeCode() {
        return ConstantTypeCode;
    }

    public void setConstantTypeCode(String constantTypeCode) {
        ConstantTypeCode = constantTypeCode;
    }

    public String getConstantTypeName() {
        return ConstantTypeName;
    }

    public void setConstantTypeName(String constantTypeName) {
        ConstantTypeName = constantTypeName;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    @Override
    public String toString() {
        return "ConstantType{" +
                "ID=" + ID +
                ", ConstantTypeCode='" + ConstantTypeCode + '\'' +
                ", ConstantTypeName='" + ConstantTypeName + '\'' +
                ", DelMark=" + DelMark +
                '}';
    }
}
