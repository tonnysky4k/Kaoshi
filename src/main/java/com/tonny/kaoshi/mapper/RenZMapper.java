package com.tonny.kaoshi.mapper;


import com.tonny.kaoshi.entity.RenZheng;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RenZMapper {

    List<RenZheng> selectAll();
    RenZheng selectById(Long id);
    void insertRenz(RenZheng r);
    void updateRenz(RenZheng r);
    void deleteRenz(Long id);

}
