package com.gel.web.eneloop.service;

import com.gel.web.eneloop.mapper.PowerBankMapper;
import com.gel.web.eneloop.pojo.PowerBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerBankImpl implements PowerBankService{

    @Autowired
    private PowerBankMapper powerBankMapper;

    @Override
    public void save(PowerBank powerBank) {
        powerBankMapper.save(powerBank);
    }

    @Override
    public PowerBank getPowerBankById(int id){
        return powerBankMapper.getPowerBankById(id);
    }

    @Override
    public List<PowerBank> getPowerBankBySiteId(int id){
        return powerBankMapper.getPowerBankBySiteId(id);
    }

    @Override
    public List<PowerBank> getAllPowerBanks(){
        return powerBankMapper.getAllPowerBanks();
    }

    @Override
    public void updatePowerBankState(int powerBankId, int powerBankState){
        powerBankMapper.updatePowerBankState(powerBankId, powerBankState);
    }
}
