package com.tonny.kaoshi.service;

import com.tonny.kaoshi.entity.KaosDan;

import java.util.List;

public interface KaochjService {
    List<KaosDan> selectByName(String kname);
    void insertKaos(KaosDan kc);
}
