package com.gel.web.eneloop.service;

import com.gel.web.eneloop.mapper.MaintenanceLogMapper;
import com.gel.web.eneloop.pojo.MaintenanceLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaintenanceLogImpl implements MaintenanceLogService{

    @Autowired
    private MaintenanceLogMapper maintenanceLogMapper;

    @Override
    public void createLog(MaintenanceLog maintenanceLog){
        maintenanceLogMapper.createLog(maintenanceLog);
    }
}
