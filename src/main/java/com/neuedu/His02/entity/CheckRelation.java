package com.neuedu.His02.entity;


public class CheckRelation {
    private Integer ID;
    private Integer CheckProjID;
    private Integer CheckTempID;
    private String Position;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getCheckProjID() {
        return CheckProjID;
    }

    public void setCheckProjID(Integer checkProjID) {
        CheckProjID = checkProjID;
    }

    public Integer getCheckTempID() {
        return CheckTempID;
    }

    public void setCheckTempID(Integer checkTempID) {
        CheckTempID = checkTempID;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    @Override
    public String toString() {
        return "CheckRelation{" +
                "ID=" + ID +
                ", CheckProjID=" + CheckProjID +
                ", CheckTempID=" + CheckTempID +
                ", Position='" + Position + '\'' +
                '}';
    }
}
