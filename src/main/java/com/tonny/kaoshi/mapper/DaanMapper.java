package com.tonny.kaoshi.mapper;

import com.tonny.kaoshi.entity.Daan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DaanMapper {

    List<Daan> selectAll();
    void insertAns(Daan d);
    void updateAns(Daan d);
    void deleteAns(Long id);
    List<Daan> selectById(Long id);
}
