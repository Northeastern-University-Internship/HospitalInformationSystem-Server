package com.neuedu.His02.entity.diagnosisTemplate;

public class DiagnosisTemplate {
    private Integer ID;// ID
    private Integer DeptID;
    private Integer UserID;// Doctor ID point to User (ID)
    private String Diagnosis;// Diagnostic results
    private String Handling;// Disposition opinion
    private String Scope;// Hospital / Department / Individual
    private Integer DelMark;// Delete Mark 1 - Normal 0 - Deleted

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getDeptID() {
        return DeptID;
    }

    public void setDeptID(Integer deptID) {
        DeptID = deptID;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        Diagnosis = diagnosis;
    }

    public String getHandling() {
        return Handling;
    }

    public void setHandling(String handling) {
        Handling = handling;
    }

    public String getScope() {
        return Scope;
    }

    public void setScope(String scope) {
        Scope = scope;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }


    public DiagnosisTemplate(Integer ID, Integer deptID, Integer userID, String diagnosis, String handling, String scope, Integer delMark) {
        this.ID = ID;
        DeptID = deptID;
        UserID = userID;
        Diagnosis = diagnosis;
        Handling = handling;
        Scope = scope;
        DelMark = delMark;
    }

    public DiagnosisTemplate() {
    }

    @Override
    public String toString() {
        return "DiagnosisTemplate{" +
                "ID=" + ID +
                ", DeptID=" + DeptID +
                ", UserID=" + UserID +
                ", Diagnosis='" + Diagnosis + '\'' +
                ", Handling='" + Handling + '\'' +
                ", Scope='" + Scope + '\'' +
                ", DelMark=" + DelMark +
                '}';
    }
}
