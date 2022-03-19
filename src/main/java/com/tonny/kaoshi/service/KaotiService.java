package com.tonny.kaoshi.service;


import com.tonny.kaoshi.entity.Kaot;

import java.util.List;

public interface KaotiService {

List<Kaot> selectAll();
List<Kaot> selectByName(Kaot k);
Long selectMaxId();
List<Kaot> selectBySid(Long sid);
void insertKm(Kaot t);
void updateKm(Kaot t);
void deleteKm(Long id);
Kaot selectById(Long id);
}
