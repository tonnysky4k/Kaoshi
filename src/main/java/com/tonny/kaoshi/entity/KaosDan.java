package com.tonny.kaoshi.entity;

import java.io.Serializable;

public class KaosDan implements Serializable {
    private Long id;
    private Long  kid;
    private String das;
    private String zqda;
    private String kname;
    private float def;
    private String ksdate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }
    public String getDas() {
        return das;
    }

    public void setDas(String das) {
        this.das = das;
    }

    public String getZqda() {
        return zqda;
    }

    public void setZqda(String zqda) {
        this.zqda = zqda;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname;
    }

    public float getDef() {
        return def;
    }

    public void setDef(float def) {
        this.def = def;
    }

    public String getKsdate(){ return ksdate;}

    public void setKsdate(String ksdate){ this.ksdate=ksdate;}
}
