package com.tonny.kaoshi.entity;

import java.util.Date;

public class UserRight {

    private Long id;
    private Long uid;
    private Long rzid;
    private Long kmid;
    private Date outdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getRzid() {
        return rzid;
    }

    public void setRzid(Long rzid) {
        this.rzid = rzid;
    }

    public Long getKmid() {
        return kmid;
    }

    public void setKmid(Long kmid) {
        this.kmid = kmid;
    }

    public Date getOutdate() {
        return outdate;
    }

    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }
}
