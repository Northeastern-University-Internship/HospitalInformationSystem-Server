package com.neuedu.His02.entity;


public class SettleCategory {
    private Integer ID;
    private String SettleCode;
    private String SettleName;
    private Integer SequenceNo;
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
