package com.gel.web.eneloop.service;

import com.gel.web.eneloop.pojo.PowerBank;

public interface PowerBankService {

    public void save(PowerBank powerBank);

    public PowerBank getPowerBankById(PowerBank powerBank);

    public PowerBank[] getPowerBankBySiteId(PowerBank powerBank);
}
