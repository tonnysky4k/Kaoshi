package com.tonny.kaoshi.service;

import com.tonny.kaoshi.entity.Daan;

import java.util.List;

public interface AnsService {

    List<Daan>  selectAll();
    List<Daan> selectById(Long id);
    void insertAns(Daan d);
    void updateAns(Daan d);
    void deleteAns(Long id);
}
