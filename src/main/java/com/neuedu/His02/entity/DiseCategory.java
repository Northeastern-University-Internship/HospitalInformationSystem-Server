package com.neuedu.His02.entity;

// Table Name: Classification of Diseases
public class DiseCategory {
    private Integer ID;
    private String DicaCode;
    private String DicaName;// Category Name
    private Integer SequenceNo;
    private Integer DicaType;//Type 1 - Western Medicine 2 - Traditional Chinese Medicine
    private Integer DelMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDicaCode() {
        return DicaCode;
    }

    public void setDicaCode(String dicaCode) {
        DicaCode = dicaCode;
    }

    public String getDicaName() {
        return DicaName;
    }

    public void setDicaName(String dicaName) {
        DicaName = dicaName;
    }

    public Integer getSequenceNo() {
        return SequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        SequenceNo = sequenceNo;
    }

    public Integer getDicaType() {
        return DicaType;
    }

    public void setDicaType(Integer dicaType) {
        DicaType = dicaType;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    @Override
    public String toString() {
        return "DiseCategory{" +
                "ID=" + ID +
                ", DicaCode='" + DicaCode + '\'' +
                ", DicaName='" + DicaName + '\'' +
                ", SequenceNo=" + SequenceNo +
                ", DicaType=" + DicaType +
                ", DelMark=" + DelMark +
                '}';
    }
}
