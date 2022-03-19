package com.tonny.kaoshi.mapper;

import com.tonny.kaoshi.entity.Kaot;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KaotMapper {

 List<Kaot> selectAll();
 List<Kaot> selectByName(Kaot k);
 List<Kaot> selectBySid(Long sid);
 Long selectMaxId();
 void insertKm(Kaot t);
 void updateKm(Kaot t);
 void deleteKm(Long id);
 Kaot  selectById(Long id);
}
