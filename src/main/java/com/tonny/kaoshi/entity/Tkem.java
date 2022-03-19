package com.tonny.kaoshi.entity;

public class Tkem {
    private String tts;
    private String an1;
    private String an2;
    private String an3;
    private String an4;
    private String typ;
    private String zhan;
    private String desc;
    private Long id;
    private Long sid;
    public String getTts() {
        return tts;
    }

    public void setTts(String tts) {
        this.tts = tts;
    }

    public String getAn1() {
        return an1;
    }

    public void setAn1(String an1) {
        this.an1 = an1;
    }

    public String getAn2() {
        return an2;
    }

    public void setAn2(String an2) {
        this.an2 = an2;
    }

    public String getAn3() {
        return an3;
    }

    public void setAn3(String an3) {
        this.an3 = an3;
    }

    public String getAn4() {
        return an4;
    }

    public void setAn4(String an4) {
        this.an4 = an4;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getZhan() {
        return zhan;
    }

    public void setZhan(String zhan) {
        this.zhan = zhan;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getId(){return id;};
    public void setId(Long id){this.id =id;}

    public Long getSid(){return sid;};
    public void setSid(Long sid){this.sid =sid;}

    @Override
    public String toString() {
        return "Tkem{" +
                "id='" + id + '\'' +
                "tts='" + tts + '\'' +
                ", an1='" + an1 + '\'' +
                ", an2='" + an2 + '\'' +
                ", an3='" + an3 + '\'' +
                ", an4='" + an4 + '\'' +
                ", typ='" + typ + '\'' +
                ", zhan='" + zhan + '\'' +
                ", desc='" + desc + '\'' +
                ", sid='" + sid + '\'' +
                '}';
    }
}
