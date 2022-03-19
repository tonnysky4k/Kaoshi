package com.tonny.kaoshi.service.impl;

import com.tonny.kaoshi.entity.Kaot;
import com.tonny.kaoshi.mapper.KaotMapper;
import com.tonny.kaoshi.service.KaotiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KaotiServiceImpl implements KaotiService {

    @Autowired
    KaotMapper kaotMapper;
    @Override
    public List<Kaot> selectAll() {
        return kaotMapper.selectAll();
    }

    @Override
    public Long selectMaxId() {
        return kaotMapper.selectMaxId();
    }

    @Override
    public void insertKm(Kaot t) {
        kaotMapper.insertKm(t);
    }

    @Override
    public void updateKm(Kaot t) {
        kaotMapper.updateKm(t);
    }

    @Override
    public void deleteKm(Long id) {
        kaotMapper.deleteKm(id);
    }

    @Override
    public Kaot selectById(Long id)
    {
        return kaotMapper.selectById(id);
    }
    @Override
    public List<Kaot> selectByName(Kaot t)
    {
        return kaotMapper.selectByName(t);
    }

    @Override
    public List<Kaot> selectBySid(Long sid) {
        return kaotMapper.selectBySid(sid);
    }
}
