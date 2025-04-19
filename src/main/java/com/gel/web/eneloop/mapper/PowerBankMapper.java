package com.gel.web.eneloop.mapper;

import com.gel.web.eneloop.pojo.PowerBank;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PowerBankMapper {

    public void save(PowerBank powerBank);

    public PowerBank getPowerBankById(int id);

    public List<PowerBank> getPowerBankBySiteId(int id);

    public List<PowerBank> getAllPowerBanks();

    public void updatePowerBankState(int powerBankId, int powerBankState);
}
