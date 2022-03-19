package com.tonny.kaoshi.service;

import com.tonny.kaoshi.entity.UserRight;

import java.util.List;

public interface UserRightService {

    List<UserRight> selectAll();
    List<UserRight> selectByUid(Long uid);
    void insertUserRight(UserRight ur);
    void updateUserRight(UserRight ur);
    void deleteUserRight(Long id);
}
