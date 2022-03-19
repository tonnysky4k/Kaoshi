package com.tonny.kaoshi.mapper;

import com.tonny.kaoshi.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {

    List<User> selectAll();
    User selectByPho(String pho);
    User selectById(Long id);
    void insertUser(User u);
    void updateUser(User u);
    void delteUser(Long id);
    User selectByNameS (User u);
}
