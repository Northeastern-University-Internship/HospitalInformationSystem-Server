package com.neuedu.His02.entity.recordTemplate;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

// 表名：患者病历模板表
public class RecordTemplate {
    private Integer ID;
    private String Name;
    private Integer DeptID;
    private Integer UserID;

    public Integer getDeptID() {
        return DeptID;
    }

    public void setDeptID(Integer deptID) {
        DeptID = deptID;
    }

    public RecordTemplate() {
    }


    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date CreationTime;
    private String Scope;

    private String Readme;
    private String Present;
    private String PresentTreat;
    private String History;
    private String Allergy;
    private String Physique;
    private String Proposal;
    private String Careful;
    private String CheckResult;
    private String Diagnosis;
    private String Handling;

    private Integer DelMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public Date getCreationTime() {
        return CreationTime;
    }

    public void setCreationTime(Date creationTime) {
        CreationTime = creationTime;
    }

    public String getScope() {
        return Scope;
    }

    public void setScope(String scope) {
        Scope = scope;
    }

    public String getReadme() {
        return Readme;
    }

    public void setReadme(String readme) {
        Readme = readme;
    }

    public String getPresent() {
        return Present;
    }

    public void setPresent(String present) {
        Present = present;
    }

    public String getPresentTreat() {
        return PresentTreat;
    }

    public void setPresentTreat(String presentTreat) {
        PresentTreat = presentTreat;
    }

    public String getHistory() {
        return History;
    }

    public void setHistory(String history) {
        History = history;
    }

    public String getAllergy() {
        return Allergy;
    }

    public void setAllergy(String allergy) {
        Allergy = allergy;
    }

    public String getPhysique() {
        return Physique;
    }

    public void setPhysique(String physique) {
        Physique = physique;
    }

    public String getProposal() {
        return Proposal;
    }

    public void setProposal(String proposal) {
        Proposal = proposal;
    }

    public String getCareful() {
        return Careful;
    }

    public void setCareful(String careful) {
        Careful = careful;
    }

    public String getCheckResult() {
        return CheckResult;
    }

    public void setCheckResult(String checkResult) {
        CheckResult = checkResult;
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

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    public RecordTemplate(Integer ID, String name, Integer deptID, Integer userID, Date creationTime, String scope, String readme, String present, String presentTreat, String history, String allergy, String physique, String proposal, String careful, String checkResult, String diagnosis, String handling, Integer delMark) {
        this.ID = ID;
        Name = name;
        DeptID = deptID;
        UserID = userID;
        CreationTime = creationTime;
        Scope = scope;
        Readme = readme;
        Present = present;
        PresentTreat = presentTreat;
        History = history;
        Allergy = allergy;
        Physique = physique;
        Proposal = proposal;
        Careful = careful;
        CheckResult = checkResult;
        Diagnosis = diagnosis;
        Handling = handling;
        DelMark = delMark;
    }

    public RecordTemplate(Integer deptID) {
        DeptID = deptID;
    }

    @Override
    public String toString() {
        return "RecordTemplate{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", DeptID=" + DeptID +
                ", UserID=" + UserID +
                ", CreationTime=" + CreationTime +
                ", Scope='" + Scope + '\'' +
                ", Readme='" + Readme + '\'' +
                ", Present='" + Present + '\'' +
                ", PresentTreat='" + PresentTreat + '\'' +
                ", History='" + History + '\'' +
                ", Allergy='" + Allergy + '\'' +
                ", Physique='" + Physique + '\'' +
                ", Proposal='" + Proposal + '\'' +
                ", Careful='" + Careful + '\'' +
                ", CheckResult='" + CheckResult + '\'' +
                ", Diagnosis='" + Diagnosis + '\'' +
                ", Handling='" + Handling + '\'' +
                ", DelMark=" + DelMark +
                '}';
    }
}
