package com.tonny.kaoshi.entity;



import java.io.Serializable;
import java.util.Date;

public class Login implements Serializable {
    private Long id;
    private String uname;
    private String scode;
    private Date indate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }


    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }

    @Override
    public String toString() {
        return "Login {" +
                "id=" + id +
                ", uname='" + uname+'\'' +
                ", scode='" + scode + '\'' +
                ", indate=" + indate +
                '}';
    }
}
