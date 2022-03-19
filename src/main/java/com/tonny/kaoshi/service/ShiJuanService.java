package com.tonny.kaoshi.service;

import com.tonny.kaoshi.entity.KmShijuan;

import java.util.List;

public interface ShiJuanService {

    List<KmShijuan> selectAll();
    List<KmShijuan> selectByRid(Long id);
    void insertShiJ(KmShijuan s);
    void updateShiJ(KmShijuan s);
    void deleteShiJ(Long id);
   KmShijuan selectById(Long id);
}
