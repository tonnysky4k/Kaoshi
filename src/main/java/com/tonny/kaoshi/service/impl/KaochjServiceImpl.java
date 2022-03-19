package com.tonny.kaoshi.service.impl;

import com.tonny.kaoshi.entity.KaosDan;
import com.tonny.kaoshi.mapper.KaosMapper;
import com.tonny.kaoshi.service.KaochjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaochjServiceImpl implements KaochjService {

    @Autowired
    KaosMapper kaosMapper;
    @Override
    public List<KaosDan> selectByName(String kname) {
        return kaosMapper.selectByName(kname);
    }

    @Override
    public void insertKaos(KaosDan kc) {
        kaosMapper.insertKaos(kc);
    }
}
