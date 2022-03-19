package com.tonny.kaoshi.service;

import com.tonny.kaoshi.entity.RenzKm;

import java.util.List;

public interface RenKMService {

    List<RenzKm> selectAll();
    List<RenzKm> selectByRid(Long id);
    void insertRenKM(RenzKm d);
    void updateRenKM(RenzKm d);
    void deleteRenKM(Long id);
    RenzKm selectById(Long id);
}
