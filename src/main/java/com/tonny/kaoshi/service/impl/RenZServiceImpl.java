package com.tonny.kaoshi.service.impl;

import com.tonny.kaoshi.entity.RenZheng;
import com.tonny.kaoshi.mapper.RenZMapper;
import com.tonny.kaoshi.service.RenZService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RenZServiceImpl implements RenZService {

    @Autowired
    RenZMapper renZMapper;

    @Override
    public List<RenZheng> selectAll() {
        return renZMapper.selectAll();
    }

    @Override
    public RenZheng selectById(Long id) {
        return renZMapper.selectById(id);
    }

    @Override
    public void insertRenz(RenZheng r) {
        renZMapper.insertRenz(r);

    }

    @Override
    public void updateRenz(RenZheng r) {
        renZMapper.updateRenz(r);
    }

    @Override
    public void deleteRenz(Long id) {
        renZMapper.deleteRenz(id);
    }
}
