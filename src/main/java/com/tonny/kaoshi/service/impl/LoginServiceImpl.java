package com.tonny.kaoshi.service.impl;

import com.tonny.kaoshi.entity.Login;
import com.tonny.kaoshi.mapper.LoginMapper;
import com.tonny.kaoshi.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginMapper loginMapper;
    @Override
    public List<Login> selectAll() {
        return loginMapper.selectAll();
    }

    @Override
    public void insertLogin(Login l) {
        loginMapper.insertLogin(l);

    }

    @Override
    public Login selectByNameS(Login l) {
        return loginMapper.selectByNameS(l);
    }
}
