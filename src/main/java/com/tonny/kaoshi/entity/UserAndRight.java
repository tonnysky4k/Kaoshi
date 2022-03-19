package com.tonny.kaoshi.entity;

import java.util.List;

public class UserAndRight {

    private User user;
    private List<UserRight> rights;
    private List<String> rens;
    private List<String> kms;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<UserRight> getRights() {
        return rights;
    }

    public void setRights(List<UserRight> rights) {
        this.rights = rights;
    }

    public List<String> getRens() {
        return rens;
    }

    public void setRens(List<String> rens) {
        this.rens = rens;
    }

    public List<String> getKms() {
        return kms;
    }

    public void setKms(List<String> kms) {
        this.kms = kms;
    }
}
