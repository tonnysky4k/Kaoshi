package com.tonny.kaoshi.mapper;

import com.tonny.kaoshi.entity.KaosDan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KaosMapper{
    public List<KaosDan> selectByName(String kname);
    public void insertKaos(KaosDan kc);
}
