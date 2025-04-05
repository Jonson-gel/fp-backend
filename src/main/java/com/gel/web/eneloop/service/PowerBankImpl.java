package com.gel.web.eneloop.service;

import com.gel.web.eneloop.mapper.PowerBankMapper;
import com.gel.web.eneloop.pojo.PowerBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PowerBankImpl implements PowerBankService{

    @Autowired
    private PowerBankMapper powerBankMapper;

    @Override
    public void save(PowerBank powerBank) {
        powerBankMapper.save(powerBank);
    }

    @Override
    public PowerBank getPowerBankById(PowerBank powerBank){
        return powerBankMapper.getPowerBankById(powerBank);
    }

    @Override
    public PowerBank[] getPowerBankBySiteId(PowerBank powerBank){
        return powerBankMapper.getPowerBankBySiteId(powerBank);
    }
}
