package com.tonny.kaoshi.service;

import com.tonny.kaoshi.entity.User;

import java.util.List;

public interface UserService {

    List<User> selectAll();
    User selectByPho(String pho);
    void insertUser(User u);
    void updateUser(User u);
    void deleteUser(Long id);
    User selectByNameS(User u);
    User selectById(Long id);
}
