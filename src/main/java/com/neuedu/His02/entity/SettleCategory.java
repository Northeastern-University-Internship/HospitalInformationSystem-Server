package com.neuedu.His02.entity;

// 表名：结算类别表
public class SettleCategory {
    private Integer ID;// ID 自增长类型
    private String SettleCode;// 类别编码
    private String SettleName;// 类别名称
    private Integer SequenceNo;// 显示顺序号
    private Integer DelMark;// Delete Mark 1 - Normal 0 - Deleted

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getSettleCode() {
        return SettleCode;
    }

    public void setSettleCode(String settleCode) {
        SettleCode = settleCode;
    }

    public String getSettleName() {
        return SettleName;
    }

    public void setSettleName(String settleName) {
        SettleName = settleName;
    }

    public Integer getSequenceNo() {
        return SequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        SequenceNo = sequenceNo;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    @Override
    public String toString() {
        return "SettleCategory{" +
                "ID=" + ID +
                ", SettleCode='" + SettleCode + '\'' +
                ", SettleName='" + SettleName + '\'' +
                ", SequenceNo=" + SequenceNo +
                ", DelMark=" + DelMark +
                '}';
    }
}
