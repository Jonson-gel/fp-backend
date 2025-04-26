package com.gel.web.eneloop.mapper;

import com.gel.web.eneloop.pojo.MaintenanceLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MaintenanceLogMapper {

    public void createLog(MaintenanceLog maintenanceLog);
}
