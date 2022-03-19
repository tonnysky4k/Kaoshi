package com.tonny.kaoshi.service.impl;

import com.tonny.kaoshi.entity.RenzKm;
import com.tonny.kaoshi.mapper.RenKMMapper;
import com.tonny.kaoshi.service.RenKMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RenKMServiceImpl implements RenKMService {

    @Autowired
    RenKMMapper renKMMapper;

    @Override
    public List<RenzKm> selectAll() {
        return renKMMapper.selectAll();
    }

    @Override
    public List<RenzKm> selectByRid(Long id) {
        return renKMMapper.selectByRid(id);
    }

    @Override
    public void insertRenKM(RenzKm d) {
        renKMMapper.insertRenKM(d);

    }

    @Override
    public void updateRenKM(RenzKm d) {

        renKMMapper.updateRenKM(d);

    }

    @Override
    public void deleteRenKM(Long id) {
        renKMMapper.deleteRenKM(id);

    }

    @Override
    public RenzKm selectById(Long id) {
        return renKMMapper.selectById(id);
    }
}
