package com.tonny.kaoshi.service;

import com.tonny.kaoshi.entity.RenZheng;

import java.util.List;

public interface RenZService {

    List<RenZheng> selectAll();
    RenZheng selectById(Long id);
    void insertRenz(RenZheng r);
    void updateRenz(RenZheng r);
    void deleteRenz(Long id);
}
