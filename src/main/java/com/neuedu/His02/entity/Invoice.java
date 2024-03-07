package com.neuedu.His02.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;;

// Table name: invoice table
public class Invoice {
    private Integer ID;
    private String InvoiceNum;
    private BigDecimal Money;
    private Integer State;// Invoice status 1 - normal 2 - invalid 3 - not printed 4 - has been printed 5 - has been retyped 6 - has made up 7 - red

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date CreationTime;
    private Integer UserID;
    private Integer RegistID;
    private Integer FeeType;
    private String Back;// Red invoice number
    private Integer DailyState;// Daily Settlement Review Status 0 - Not Settled 1 - Submitted 2 - Reviewed

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getInvoiceNum() {
        return InvoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        InvoiceNum = invoiceNum;
    }

    public BigDecimal getMoney() {
        return Money;
    }

    public void setMoney(BigDecimal money) {
        Money = money;
    }

    public Integer getState() {
        return State;
    }


    public void setState(Integer state) {
        State = state;
    }
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getCreationTime() {
        return CreationTime;
    }

    public void setCreationTime(Date creationTime) {
        CreationTime = creationTime;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public Integer getRegistID() {
        return RegistID;
    }

    public void setRegistID(Integer registID) {
        RegistID = registID;
    }

    public Integer getFeeType() {
        return FeeType;
    }

    public void setFeeType(Integer feeType) {
        FeeType = feeType;
    }

    public String getBack() {
        return Back;
    }

    public void setBack(String back) {
        Back = back;
    }

    public Integer getDailyState() {
        return DailyState;
    }

    public void setDailyState(Integer dailyState) {
        DailyState = dailyState;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "ID=" + ID +
                ", InvoiceNum='" + InvoiceNum + '\'' +
                ", Money=" + Money +
                ", State=" + State +
                ", CreationTime=" + CreationTime +
                ", UserID=" + UserID +
                ", RegistID=" + RegistID +
                ", FeeType=" + FeeType +
                ", Back='" + Back + '\'' +
                ", DailyState=" + DailyState +
                '}';
    }
}
