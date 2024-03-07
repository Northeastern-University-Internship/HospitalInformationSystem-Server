package com.neuedu.His02.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;;

// Table Name: Patient Expense Schedule
public class PatientCosts {
    private String CaseNumber;
    private String RealName;
    private String DeptName;
    private String StartTime;
    private String EndTime;
    private Integer ID;//
    private Integer RegistID;//Register (ID)
    private Integer InvoiceID;//  invoice(ID)
    private Integer ItemID;// item ID
    private Integer ItemType;//Item Type 1 - Non-Drug 2 - Drug
    private String Name;
    private BigDecimal Price;// Item unit price
    private BigDecimal Amount;
    private Integer DeptID;// Department ID
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date Createtime;// Opening time
    private Integer CreateOperID;// Opening Person ID
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date PayTime;// Collection / Refund Time
    private Integer RegisterID;// Charge / Return Officer ID
    private Integer FeeType;// Charging method
    private Integer BackID;// Return Record ID

    public String getCaseNumber() {
        return CaseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        CaseNumber = caseNumber;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String realName) {
        RealName = realName;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getRegistID() {
        return RegistID;
    }

    public void setRegistID(Integer registID) {
        RegistID = registID;
    }

    public Integer getInvoiceID() {
        return InvoiceID;
    }

    public void setInvoiceID(Integer invoiceID) {
        InvoiceID = invoiceID;
    }

    public Integer getItemID() {
        return ItemID;
    }

    public void setItemID(Integer itemID) {
        ItemID = itemID;
    }

    public Integer getItemType() {
        return ItemType;
    }

    public void setItemType(Integer itemType) {
        ItemType = itemType;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal amount) {
        Amount = amount;
    }

    public Integer getDeptID() {
        return DeptID;
    }

    public void setDeptID(Integer deptID) {
        DeptID = deptID;
    }

    public Date getCreatetime() {
        return Createtime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public void setCreatetime(Date createtime) {
        Createtime = createtime;
    }

    public Integer getCreateOperID() {
        return CreateOperID;
    }

    public void setCreateOperID(Integer createOperID) {
        CreateOperID = createOperID;
    }

    public Date getPayTime() {
        return PayTime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public void setPayTime(Date payTime) {
        PayTime = payTime;
    }

    public Integer getRegisterID() {
        return RegisterID;
    }

    public void setRegisterID(Integer registerID) {
        RegisterID = registerID;
    }

    public Integer getFeeType() {
        return FeeType;
    }

    public void setFeeType(Integer feeType) {
        FeeType = feeType;
    }

    public Integer getBackID() {
        return BackID;
    }

    public void setBackID(Integer backID) {
        BackID = backID;
    }

    @Override
    public String toString() {
        return "PatientCosts{" +
                "CaseNumber='" + CaseNumber + '\'' +
                ", RealName='" + RealName + '\'' +
                ", DeptName='" + DeptName + '\'' +
                ", StartTime=" + StartTime +
                ", EndTime=" + EndTime +
                ", ID=" + ID +
                ", RegistID=" + RegistID +
                ", InvoiceID=" + InvoiceID +
                ", ItemID=" + ItemID +
                ", ItemType=" + ItemType +
                ", Name='" + Name + '\'' +
                ", Price=" + Price +
                ", Amount=" + Amount +
                ", DeptID=" + DeptID +
                ", Createtime=" + Createtime +
                ", CreateOperID=" + CreateOperID +
                ", PayTime=" + PayTime +
                ", RegisterID=" + RegisterID +
                ", FeeType=" + FeeType +
                ", BackID=" + BackID +
                '}';
    }
}
