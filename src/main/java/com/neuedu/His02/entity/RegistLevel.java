package com.neuedu.His02.entity;

import java.math.BigDecimal;

// 表名：挂号级别表
public class RegistLevel {
    private Integer ID;// ID 自增长类型
    private String RegistCode;// 号别编码
    private String RegistName;// 号别名称
    private Integer SequenceNo;// 显示顺序号
    private BigDecimal RegistFee;// 挂号费
    private Integer RegistQuota;// 挂号限额
    private Integer DelMark;// Delete Mark 1 - Normal 0 - Deleted

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
