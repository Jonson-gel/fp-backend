package com.gel.web.eneloop.service;

import com.gel.web.eneloop.pojo.PowerBank;

import java.util.List;

public interface PowerBankService {

    public void save(PowerBank powerBank);

    public PowerBank getPowerBankById(int id);

    public List<PowerBank> getPowerBankBySiteId(int id);

    public List<PowerBank> getAllPowerBanks();

    public void updatePowerBankState(int powerBankId, int powerBankState);
}
