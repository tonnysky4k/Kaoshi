package com.tonny.kaoshi.entity;

import java.util.Date;

public class KmShijuan {

    private Long id;
    private Long kmid;
    private String kmsj;
    private String sjzz;
    private String sjdesc;
    private Date sjdate;
    private int sjsort;
    private String sjhref;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getKmid() {
        return kmid;
    }

    public void setKmid(Long kmid) {
        this.kmid = kmid;
    }

    public String getKmsj() {
        return kmsj;
    }

    public void setKmsj(String kmsj) {
        this.kmsj = kmsj;
    }

    public String getSjzz() {
        return sjzz;
    }

    public void setSjzz(String sjzz) {
        this.sjzz = sjzz;
    }

    public String getSjdesc() {
        return sjdesc;
    }

    public void setSjdesc(String sjdesc) {
        this.sjdesc = sjdesc;
    }

    public Date getSjdate() {
        return sjdate;
    }

    public void setSjdate(Date sjdate) {
        this.sjdate = sjdate;
    }

    public int getSjsort() {
        return sjsort;
    }

    public void setSjsort(int sjsort) {
        this.sjsort = sjsort;
    }

    public String getSjhref(){return sjhref;}

    public void setSjhref(String sjhref){this.sjhref =sjhref;}

    @Override
    public String toString() {
        return "KmShijuan{" +
                "id=" + id +
                ", kmid=" + kmid +
                ", kmsj='" + kmsj + '\'' +
                ", sjzz='" + sjzz + '\'' +
                ", sjdesc='" + sjdesc + '\'' +
                ", sjdate=" + sjdate +
                ", sjsort=" + sjsort +
                ", sjhref=" + sjhref +
                '}';
    }
}
