package com.tonny.kaoshi.mapper;

import com.tonny.kaoshi.entity.Daan;
import com.tonny.kaoshi.entity.RenzKm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RenKMMapper {

    List<RenzKm> selectAll();
    List<RenzKm> selectByRid(Long id);
    void insertRenKM(RenzKm d);
    void updateRenKM(RenzKm d);
    void deleteRenKM(Long id);
    RenzKm selectById(Long id);
}
