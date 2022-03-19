package com.tonny.kaoshi.service;

import com.tonny.kaoshi.entity.Login;


import java.util.List;

public interface LoginService {

    List<Login> selectAll();

    void insertLogin(Login l);

    Login selectByNameS(Login l);

}
