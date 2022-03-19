package com.tonny.kaoshi.mapper;


import com.tonny.kaoshi.entity.UserRight;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRightMapper {

    List<UserRight> selectAll();
    List<UserRight> selectByUid(Long uid);
    void insertUserRight(UserRight ur);
    void updateUserRight(UserRight ur);
    void deleteUserRight(Long id);
}
