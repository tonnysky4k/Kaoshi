package com.tonny.kaoshi.entity;

public class RenzKm {

    private Long id;
    private Long rid;
    private String rzkm;
    private String rzdesc;
    private String khref;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public String getRzkm() {
        return rzkm;
    }

    public void setRzkm(String rzkm) {
        this.rzkm = rzkm;
    }

    public String getRzdesc() {
        return rzdesc;
    }

    public void setRzdesc(String rzdesc) {
        this.rzdesc = rzdesc;
    }

    public String getKhref(){return khref;}

    public void setKhref(String khref)
    {
        this.khref=khref;
    }
}
