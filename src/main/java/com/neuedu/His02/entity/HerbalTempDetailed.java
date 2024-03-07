package com.neuedu.His02.entity;

// Table Name: Herbal Medicine Template Schedule
public class HerbalTempDetailed {
    private Integer ID;
    private Integer HerbalTempID;
    private Integer HerbalID;
    private String Dosage;
    private String Unit;
    private String Footnote;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getHerbalTempID() {
        return HerbalTempID;
    }

    public void setHerbalTempID(Integer herbalTempID) {
        HerbalTempID = herbalTempID;
    }

    public Integer getHerbalID() {
        return HerbalID;
    }

    public void setHerbalID(Integer herbalID) {
        HerbalID = herbalID;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String dosage) {
        Dosage = dosage;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getFootnote() {
        return Footnote;
    }

    public void setFootnote(String footnote) {
        Footnote = footnote;
    }

    @Override
    public String toString() {
        return "HerbalTempDetailed{" +
                "ID=" + ID +
                ", HerbalTempID=" + HerbalTempID +
                ", HerbalID=" + HerbalID +
                ", Dosage='" + Dosage + '\'' +
                ", Unit='" + Unit + '\'' +
                ", Footnote='" + Footnote + '\'' +
                '}';
    }
}
