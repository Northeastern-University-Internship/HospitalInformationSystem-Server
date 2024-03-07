package com.neuedu.His02.entity;

// Table Name: Patient Medical Record Front Page Table
public class MedicalRecord {
    private Integer ID;
    private String CaseNumber;
    private Integer RegistID;
    private String Readme;// Chief complaint
    private String Present;// History of present illness
    private String PresentTreat;// Current disease treatment
    private String History;//Past history
    private String Allergy;// History of allergies
    private String Physique;// physical examination
    private String Proposal;// Inspection recommendations
    private String Careful;// Note
    private String CheckResult;// Inspection results
    private String Diagnosis;// Diagnostic results
    private String Handling;// Disposition opinion
    private Integer CaseState;// Medical Record Status 1 - Temporary 2 - Submitted 3 - Completed

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCaseNumber() {
        return CaseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        CaseNumber = caseNumber;
    }

    public Integer getRegistID() {
        return RegistID;
    }

    public void setRegistID(Integer registID) {
        RegistID = registID;
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

    public Integer getCaseState() {
        return CaseState;
    }

    public void setCaseState(Integer caseState) {
        CaseState = caseState;
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "ID=" + ID +
                ", CaseNumber='" + CaseNumber + '\'' +
                ", RegistID=" + RegistID +
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
                ", CaseState=" + CaseState +
                '}';
    }
}
