package com.gel.web.eneloop.controller;

import com.gel.web.eneloop.pojo.PowerBank;
import com.gel.web.eneloop.service.PowerBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PowerBankController {

    @Autowired
    private PowerBankService powerBankService;

    @GetMapping("power_bank")
    @ResponseBody
    public String getById(PowerBank powerBank){
        System.out.println(powerBank);
        //调用服务层
        powerBankService.save(powerBank);
        return "success";
    }


}
