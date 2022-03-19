package com.tonny.kaoshi.service.impl;

import com.tonny.kaoshi.entity.KmShijuan;
import com.tonny.kaoshi.mapper.ShiJuanMapper;
import com.tonny.kaoshi.service.ShiJuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiJuanServiceImpl implements ShiJuanService {

    @Autowired
    ShiJuanMapper shiJuanMapper;
    @Override
    public List<KmShijuan> selectAll() {
        return shiJuanMapper.selectAll();
    }

    @Override
    public List<KmShijuan> selectByRid(Long id) {
        return shiJuanMapper.selectByRid(id);
    }

    @Override
    public void insertShiJ(KmShijuan s) {
        shiJuanMapper.insertShiJ(s);
    }

    @Override
    public void updateShiJ(KmShijuan s) {
        shiJuanMapper.updateShiJ(s);

    }

    @Override
    public void deleteShiJ(Long id) {
        shiJuanMapper.deleteShiJ(id);

    }

    @Override
    public KmShijuan selectById(Long id) {
        return shiJuanMapper.selectById(id);
    }
}
