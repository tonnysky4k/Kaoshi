package com.tonny.kaoshi.service.impl;

import com.tonny.kaoshi.entity.UserRight;
import com.tonny.kaoshi.mapper.UserRightMapper;
import com.tonny.kaoshi.service.UserRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRightServiceImpl implements UserRightService {

    @Autowired
    UserRightMapper userRightMapper;

    @Override
    public List<UserRight> selectAll() {
        return userRightMapper.selectAll();
    }

    @Override
    public List<UserRight> selectByUid(Long uid) {
        return userRightMapper.selectByUid(uid);
    }

    @Override
    public void insertUserRight(UserRight ur) {
        userRightMapper.insertUserRight(ur);
    }

    @Override
    public void updateUserRight(UserRight ur) {
        userRightMapper.updateUserRight(ur);
    }

    @Override
    public void deleteUserRight(Long id) {

        userRightMapper.deleteUserRight(id);

    }
}
