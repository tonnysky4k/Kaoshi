package com.tonny.kaoshi.service.impl;

import com.tonny.kaoshi.entity.User;
import com.tonny.kaoshi.mapper.UserMapper;
import com.tonny.kaoshi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectAll() {
       return userMapper.selectAll() ;
    }

    @Override
    public User selectByPho(String pho) {
        return userMapper.selectByPho(pho);
    }

    @Override
    public void insertUser(User u) {

        userMapper.insertUser(u);

    }

    @Override
    public void updateUser(User u) {
        userMapper.updateUser(u);

    }

    @Override
    public void deleteUser(Long id) {
     userMapper.delteUser(id);
    }

    @Override
    public User selectByNameS(User u)
    {
        return userMapper.selectByNameS(u);

    }

    @Override
    public User selectById(Long id) {
        return userMapper.selectById(id);
    }
}
