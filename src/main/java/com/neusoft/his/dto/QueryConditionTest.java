package com.neusoft.his.dto;

public class QueryConditionTest {

    private Integer deptno;
    private Integer sal;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "QueryCondition5{" +
                "deptno=" + deptno +
                ", sal=" + sal +
                '}';
    }
}
