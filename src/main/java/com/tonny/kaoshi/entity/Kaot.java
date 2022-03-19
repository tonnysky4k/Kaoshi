package com.tonny.kaoshi.entity;

public class Kaot {
    private Long id;
    private String t_pro;
    private String t_type;
    private String t_desc;
    private String t_zhan;
    private String t_you;
    private Long sid ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getT_pro() {
        return t_pro;
    }

    public void setT_pro(String t_pro) {
        this.t_pro = t_pro;
    }

    public String getT_type() {
        return t_type;
    }

    public void setT_type(String t_type) {
        this.t_type = t_type;
    }

    public String getT_desc() {
        return t_desc;
    }

    public void setT_desc(String t_desc) {
        this.t_desc = t_desc;
    }

    public String getT_zhan() {
        return t_zhan;
    }

    public void setT_zhan(String t_zhan) {
        this.t_zhan = t_zhan;
    }

    public String getT_you() {
        return t_you;
    }

    public void setT_you(String t_you) {
        this.t_you = t_you;
    }

    public  Long getSid(){return sid;}

    public void setSid(Long sid ){ this.sid =sid;}

    @Override
    public String toString() {
        return "Kaot{" +
                "id=" + id +
                ", t_pro='" + t_pro + '\'' +
                ", t_type='" + t_type + '\'' +
                ", t_desc='" + t_desc + '\'' +
                ", t_zhan='" + t_zhan + '\'' +
                ", t_you='" + t_you + '\'' +
                ",sid='"+sid+'\''+
                '}';
    }
}
