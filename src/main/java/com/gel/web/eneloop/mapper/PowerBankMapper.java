package com.gel.web.eneloop.mapper;

import com.gel.web.eneloop.pojo.PowerBank;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PowerBankMapper {

    public void save(PowerBank powerBank);

    public PowerBank getPowerBankById(PowerBank powerBank);

    public PowerBank[] getPowerBankBySiteId(PowerBank powerBank);
}
