package com.tonny.kaoshi.entity;

import java.util.List;

public class KaoAns {

    private Long id;
    private Kaot kaot;
    private List<Daan> daaList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Kaot getKaot() {
        return kaot;
    }

    public void setKaot(Kaot kaot) {
        this.kaot = kaot;
    }

    public List<Daan> getDaaList() {
        return daaList;
    }

    public void setDaaList(List<Daan> daaList) {
        this.daaList = daaList;
    }
}
