package com.gel.web.eneloop.controller;

import com.gel.web.eneloop.pojo.MaintenanceLog;
import com.gel.web.eneloop.service.MaintenanceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MaintenanceLogController {

    @Autowired
    private MaintenanceLogService maintenanceLogService;

    @PostMapping("/log/{issue}/{orderId}")
    @ResponseBody
    public void rentPowerBank(@PathVariable("issue") int issue, @PathVariable("orderId") int orderId) {

        String issueDescription = switch (issue) {
            case 1 -> "Device failure";
            case 2 -> "Dropbox return";
            case 3 -> "Device lost";
            case 4 -> "Dispute";
            default -> "";
        };

        MaintenanceLog maintenanceLog = new MaintenanceLog();

        maintenanceLog.setIssueDescription(issueDescription);
        maintenanceLog.setOrderId(orderId);

        int timestamp = (int) (System.currentTimeMillis() / 1000);
        maintenanceLog.setCreateTime(timestamp);
        maintenanceLog.setMaintenanceState(1);

        maintenanceLogService.createLog(maintenanceLog);
    }
}
