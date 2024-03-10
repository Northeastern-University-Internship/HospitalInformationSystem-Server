package com.neuedu.His02.entity;


public class User {
    private Integer ID;
    private String UserName;
    private String Password;
    private String RealName;
    private Integer UseType;
    private Integer DocTitleID;
    private String IsScheduling;
    private Integer DeptID;
    private Integer RegistLeID;
    private Integer DelMark;

    public User(Integer ID, String userName, String password, String realName, Integer useType, Integer docTitleID, String isScheduling, Integer deptID, Integer registLeID, Integer delMark) {
        this.ID = ID;
        UserName = userName;
        Password = password;
        RealName = realName;
        UseType = useType;
        DocTitleID = docTitleID;
        IsScheduling = isScheduling;
        DeptID = deptID;
        RegistLeID = registLeID;
        DelMark = delMark;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String realName) {
        RealName = realName;
    }

    public Integer getUseType() {
        return UseType;
    }

    public void setUseType(Integer useType) {
        UseType = useType;
    }

    public Integer getDocTitleID() {
        return DocTitleID;
    }

    public void setDocTitleID(Integer docTitleID) {
        DocTitleID = docTitleID;
    }

    public String getIsScheduling() {
        return IsScheduling;
    }

    public void setIsScheduling(String isScheduling) {
        IsScheduling = isScheduling;
    }

    public Integer getDeptID() {
        return DeptID;
    }

    public void setDeptID(Integer deptID) {
        DeptID = deptID;
    }

    public Integer getRegistLeID() {
        return RegistLeID;
    }

    public void setRegistLeID(Integer registLeID) {
        RegistLeID = registLeID;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                ", RealName='" + RealName + '\'' +
                ", UseType=" + UseType +
                ", DocTitleID=" + DocTitleID +
                ", IsScheduling='" + IsScheduling + '\'' +
                ", DeptID=" + DeptID +
                ", RegistLeID=" + RegistLeID +
                ", DelMark=" + DelMark +
                '}';
    }

    public User() {
    }
}
