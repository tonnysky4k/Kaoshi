package com.tonny.kaoshi.entity;

import java.io.Serializable;

public class RenZheng implements Serializable {

    private Long id;
    private String rz_name;
    private String rzdesc;
    private String rzhref;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRz_name() {
        return rz_name;
    }

    public void setRz_name(String rz_name) {
        this.rz_name = rz_name;
    }

    public String getRzdesc() {
        return rzdesc;
    }

    public void setRzdesc(String rzdesc) {
        this.rzdesc = rzdesc;
    }

    public String getRzhref(){ return rzhref;}

    public void setRzhref(String rzhref){this.rzhref =rzhref;}
}
