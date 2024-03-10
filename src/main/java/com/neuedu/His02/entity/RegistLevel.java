package com.neuedu.His02.entity;

import java.math.BigDecimal;


public class RegistLevel {
    private Integer ID;
    private String RegistCode;
    private String RegistName;
    private Integer SequenceNo;
    private BigDecimal RegistFee;
    private Integer RegistQuota;
    private Integer DelMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getRegistCode() {
        return RegistCode;
    }

    public void setRegistCode(String registCode) {
        RegistCode = registCode;
    }

    public String getRegistName() {
        return RegistName;
    }

    public void setRegistName(String registName) {
        RegistName = registName;
    }

    public Integer getSequenceNo() {
        return SequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        SequenceNo = sequenceNo;
    }

    public BigDecimal getRegistFee() {
        return RegistFee;
    }

    public void setRegistFee(BigDecimal registFee) {
        RegistFee = registFee;
    }

    public Integer getRegistQuota() {
        return RegistQuota;
    }

    public void setRegistQuota(Integer registQuota) {
        RegistQuota = registQuota;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    @Override
    public String toString() {
        return "RegistLevel{" +
                "ID=" + ID +
                ", RegistCode='" + RegistCode + '\'' +
                ", RegistName='" + RegistName + '\'' +
                ", SequenceNo=" + SequenceNo +
                ", RegistFee=" + RegistFee +
                ", RegistQuota=" + RegistQuota +
                ", DelMark=" + DelMark +
                '}';
    }
}
