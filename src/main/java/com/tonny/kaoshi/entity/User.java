package com.tonny.kaoshi.entity;



import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Long id;
    private String pho;
    private String scode;
    private String rol;
    private Date indate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPho() {
        return pho;
    }

    public void setPho(String pho) {
        this.pho = pho;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", pho='" + pho + '\'' +
                ", scode='" + scode + '\'' +
                ", rol='" + rol + '\'' +
                ", indate=" + indate +
                '}';
    }
}
