package com.neuedu.His02.entity;

// Table Name: Disease Table
public class Disease {
    private Integer ID;
    private String DiseaseCode;
    private String DiseaseName;
    private String DiseaseICD;// International ICD Code
    private Integer DiseCategoryID;// Disease Category (ID)
    private Integer DelMark;//Delete Mark 1 - Normal 0 - Deleted

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDiseaseCode() {
        return DiseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        DiseaseCode = diseaseCode;
    }

    public String getDiseaseName() {
        return DiseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        DiseaseName = diseaseName;
    }

    public String getDiseaseICD() {
        return DiseaseICD;
    }

    public void setDiseaseICD(String diseaseICD) {
        DiseaseICD = diseaseICD;
    }

    public Integer getDiseCategoryID() {
        return DiseCategoryID;
    }

    public void setDiseCategoryID(Integer diseCategoryID) {
        DiseCategoryID = diseCategoryID;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    @Override
    public String toString() {
        return "Disease{" +
                "ID=" + ID +
                ", DiseaseCode='" + DiseaseCode + '\'' +
                ", DiseaseName='" + DiseaseName + '\'' +
                ", DiseaseICD='" + DiseaseICD + '\'' +
                ", DiseCategoryID=" + DiseCategoryID +
                ", DelMark=" + DelMark +
                '}';
    }
}
