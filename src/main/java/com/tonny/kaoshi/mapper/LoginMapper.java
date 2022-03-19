package com.tonny.kaoshi.mapper;

import com.tonny.kaoshi.entity.Login;
import com.tonny.kaoshi.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper {

    List<Login> selectAll();

    void insertLogin(Login l);

    Login selectByNameS (Login l);
}
