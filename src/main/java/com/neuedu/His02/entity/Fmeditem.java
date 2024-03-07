package com.neuedu.His02.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;;

// Table Name: Schedule of Non-Drug Charges
public class Fmeditem {
    private Integer ID;
    private String ItemCode;
    private String ItemName;
    private String Format;// Specifications
    private BigDecimal Price;
    private Integer ExpClassID;// Subject ID points to the Expenseclass (ID)
    private Integer DeptID;
    private String MnemonicCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date CreationDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date LastUpdateDate;
    private Integer RecordType;// Item Type 1 - Inspection 2 - Inspection 3 - Disposal
    private Integer DelMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getItemCode() {
        return ItemCode;
    }

    public void setItemCode(String itemCode) {
        ItemCode = itemCode;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }

    public Integer getExpClassID() {
        return ExpClassID;
    }

    public void setExpClassID(Integer expClassID) {
        ExpClassID = expClassID;
    }

    public Integer getDeptID() {
        return DeptID;
    }

    public void setDeptID(Integer deptID) {
        DeptID = deptID;
    }

    public String getMnemonicCode() {
        return MnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        MnemonicCode = mnemonicCode;
    }
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getCreationDate() {
        return CreationDate;
    }
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return LastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        LastUpdateDate = lastUpdateDate;
    }

    public Integer getRecordType() {
        return RecordType;
    }

    public void setRecordType(Integer recordType) {
        RecordType = recordType;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    @Override
    public String toString() {
        return "Fmeditem{" +
                "ID=" + ID +
                ", ItemCode='" + ItemCode + '\'' +
                ", ItemName='" + ItemName + '\'' +
                ", Format='" + Format + '\'' +
                ", Price=" + Price +
                ", ExpClassID=" + ExpClassID +
                ", DeptID=" + DeptID +
                ", MnemonicCode='" + MnemonicCode + '\'' +
                ", CreationDate=" + CreationDate +
                ", LastUpdateDate=" + LastUpdateDate +
                ", RecordType=" + RecordType +
                ", DelMark=" + DelMark +
                '}';
    }
}
