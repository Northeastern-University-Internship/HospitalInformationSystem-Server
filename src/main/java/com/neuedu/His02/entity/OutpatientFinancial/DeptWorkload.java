package com.neuedu.His02.entity.OutpatientFinancial;

public class DeptWorkload {
    private Integer ID;
    private String DeptCode;
    private String DeptName;
    private Integer DeptCategoryID;
    private Integer DeptType;
    private Integer DelMark;
    private float ghf = 0;
    private float zlf = 0;
    private float jyf = 0;
    private float jyclf = 0;
    private float csjcf = 0;
    private float csclf = 0;
    private float fsjcf = 0;
    private float fsclf = 0;
    private float MRIjcf = 0;
    private float MRIclf = 0;
    private float CTjcf = 0;
    private float CTclf = 0;
    private float xyf = 0;
    private float zcyf = 0;
    private float cyf = 0;
    private float czf = 0;
    private float czclf = 0;
    private float mzf = 0;
    private float mzyf = 0;
    private float mzssf = 0;
    private float qt = 0;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDeptCode() {
        return DeptCode;
    }

    public void setDeptCode(String deptCode) {
        DeptCode = deptCode;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public Integer getDeptCategoryID() {
        return DeptCategoryID;
    }

    public void setDeptCategoryID(Integer deptCategoryID) {
        DeptCategoryID = deptCategoryID;
    }

    public Integer getDeptType() {
        return DeptType;
    }

    public void setDeptType(Integer deptType) {
        DeptType = deptType;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    public float getGhf() {
        return ghf;
    }

    public void setGhf(float ghf) {
        this.ghf = ghf;
    }

    public float getZlf() {
        return zlf;
    }

    public void setZlf(float zlf) {
        this.zlf = zlf;
    }

    public float getJyf() {
        return jyf;
    }

    public void setJyf(float jyf) {
        this.jyf = jyf;
    }

    public float getJyclf() {
        return jyclf;
    }

    public void setJyclf(float jyclf) {
        this.jyclf = jyclf;
    }

    public float getCsjcf() {
        return csjcf;
    }

    public void setCsjcf(float csjcf) {
        this.csjcf = csjcf;
    }

    public float getCsclf() {
        return csclf;
    }

    public void setCsclf(float csclf) {
        this.csclf = csclf;
    }

    public float getFsjcf() {
        return fsjcf;
    }

    public void setFsjcf(float fsjcf) {
        this.fsjcf = fsjcf;
    }

    public float getFsclf() {
        return fsclf;
    }

    public void setFsclf(float fsclf) {
        this.fsclf = fsclf;
    }

    public float getMRIjcf() {
        return MRIjcf;
    }

    public void setMRIjcf(float MRIjcf) {
        this.MRIjcf = MRIjcf;
    }

    public float getMRIclf() {
        return MRIclf;
    }

    public void setMRIclf(float MRIclf) {
        this.MRIclf = MRIclf;
    }

    public float getCTjcf() {
        return CTjcf;
    }

    public void setCTjcf(float CTjcf) {
        this.CTjcf = CTjcf;
    }

    public float getCTclf() {
        return CTclf;
    }

    public void setCTclf(float CTclf) {
        this.CTclf = CTclf;
    }

    public float getXyf() {
        return xyf;
    }

    public void setXyf(float xyf) {
        this.xyf = xyf;
    }

    public float getZcyf() {
        return zcyf;
    }

    public void setZcyf(float zcyf) {
        this.zcyf = zcyf;
    }

    public float getCyf() {
        return cyf;
    }

    public void setCyf(float cyf) {
        this.cyf = cyf;
    }

    public float getCzf() {
        return czf;
    }

    public void setCzf(float czf) {
        this.czf = czf;
    }

    public float getCzclf() {
        return czclf;
    }

    public void setCzclf(float czclf) {
        this.czclf = czclf;
    }

    public float getMzf() {
        return mzf;
    }

    public void setMzf(float mzf) {
        this.mzf = mzf;
    }

    public float getMzyf() {
        return mzyf;
    }

    public void setMzyf(float mzyf) {
        this.mzyf = mzyf;
    }

    public float getMzssf() {
        return mzssf;
    }

    public void setMzssf(float mzssf) {
        this.mzssf = mzssf;
    }

    public float getQt() {
        return qt;
    }

    public void setQt(float qt) {
        this.qt = qt;
    }

    @Override
    public String toString() {
        return "DeptWorkload{" +
                "ID=" + ID +
                ", DeptCode='" + DeptCode + '\'' +
                ", DeptName='" + DeptName + '\'' +
                ", DeptCategoryID=" + DeptCategoryID +
                ", DeptType=" + DeptType +
                ", DelMark=" + DelMark +
                ", ghf=" + ghf +
                ", zlf=" + zlf +
                ", jyf=" + jyf +
                ", jyclf=" + jyclf +
                ", csjcf=" + csjcf +
                ", csclf=" + csclf +
                ", fsjcf=" + fsjcf +
                ", fsclf=" + fsclf +
                ", MRIjcf=" + MRIjcf +
                ", MRIclf=" + MRIclf +
                ", CTjcf=" + CTjcf +
                ", CTclf=" + CTclf +
                ", xyf=" + xyf +
                ", zcyf=" + zcyf +
                ", cyf=" + cyf +
                ", czf=" + czf +
                ", czclf=" + czclf +
                ", mzf=" + mzf +
                ", mzyf=" + mzyf +
                ", mzssf=" + mzssf +
                ", qt=" + qt +
                '}';
    }
}
