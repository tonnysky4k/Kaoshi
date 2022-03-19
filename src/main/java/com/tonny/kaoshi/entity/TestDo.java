package com.tonny.kaoshi.entity;

import java.io.Serializable;

public class TestDo implements Serializable {

    private  int details;
     private int       inCode;
    private int inStatus;
     private  int inTime;
     private int supplyId;

    public int getDetails() {
        return details;
    }

    public void setDetails(int details) {
        this.details = details;
    }

    public int getInCode() {
        return inCode;
    }

    public void setInCode(int inCode) {
        this.inCode = inCode;
    }

    public int getInStatus() {
        return inStatus;
    }

    public void setInStatus(int inStatus) {
        this.inStatus = inStatus;
    }

    public int getInTime() {
        return inTime;
    }

    public void setInTime(int inTime) {
        this.inTime = inTime;
    }

    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    @Override
    public String toString() {
        return "TestDo{" +
                "details=" + details +
                ", inCode=" + inCode +
                ", inStatus=" + inStatus +
                ", inTime=" + inTime +
                ", supplyId=" + supplyId +
                '}';
    }
}
