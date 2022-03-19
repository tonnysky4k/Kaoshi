package com.tonny.kaoshi.mapper;

import com.tonny.kaoshi.entity.KmShijuan;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShiJuanMapper {

    List<KmShijuan> selectAll();
    List<KmShijuan> selectByRid(Long id);
    void insertShiJ(KmShijuan s);
    void updateShiJ(KmShijuan s);
    void deleteShiJ(Long id);
    KmShijuan selectById(Long id);
}
