package com.tonny.kaoshi.service.impl;

import com.tonny.kaoshi.entity.Daan;
import com.tonny.kaoshi.mapper.DaanMapper;
import com.tonny.kaoshi.service.AnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnsServiceImpl implements AnsService {

    @Autowired
     DaanMapper daanMapper;

    @Override
    public List<Daan> selectAll() {
        return daanMapper.selectAll();
    }

    @Override
    public void insertAns(Daan d) {
        daanMapper.insertAns(d);
    }

    @Override
    public void updateAns(Daan d) {
        daanMapper.updateAns(d);
    }

    @Override
    public void deleteAns(Long id) {
        daanMapper.deleteAns(id);

    }

    @Override
    public List<Daan> selectById(Long id) {
        return daanMapper.selectById(id);
    }
}
