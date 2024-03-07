package com.neuedu.His02.entity;

import java.math.BigDecimal;

// Table Name: Herbal Prescription Schedule
public class HerbalDetailed {
    private Integer ID;
    private Integer HerbalPresID;
    private Integer HerbalID;
    private String Dosage;
    private BigDecimal Price;
    private String Footnote;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getHerbalPresID() {
        return HerbalPresID;
    }

    public void setHerbalPresID(Integer herbalPresID) {
        HerbalPresID = herbalPresID;
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

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }

    public String getFootnote() {
        return Footnote;
    }

    public void setFootnote(String footnote) {
        Footnote = footnote;
    }

    @Override
    public String toString() {
        return "HerbalDetailed{" +
                "ID=" + ID +
                ", HerbalPresID=" + HerbalPresID +
                ", HerbalID=" + HerbalID +
                ", Dosage='" + Dosage + '\'' +
                ", Price=" + Price +
                ", Footnote='" + Footnote + '\'' +
                '}';
    }
}
