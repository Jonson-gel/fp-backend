package com.gel.web.eneloop.controller;

import com.gel.web.eneloop.pojo.PowerBank;
import com.gel.web.eneloop.service.PowerBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PowerBankController {

    @Autowired
    private PowerBankService powerBankService;

    @PostMapping("power_bank")
    @ResponseBody
    public String save(PowerBank powerBank){
        System.out.println(powerBank);
        //调用服务层
        powerBankService.save(powerBank);
        return "success";
    }

    @GetMapping("power_bank/{id}")
    @ResponseBody
    public PowerBank getPowerBankById(@PathVariable("id") int id){
        //调用服务层
        return powerBankService.getPowerBankById(id);
    }

    @GetMapping("power_bank/site/{id}")
    @ResponseBody
    public List<PowerBank> getPowerBankBySiteId(@PathVariable("id") int id){
        //调用服务层
        return powerBankService.getPowerBankBySiteId(id);
    }

    @GetMapping("power_bank")
    @ResponseBody
    public List<PowerBank> getAllPowerBanks(){
        //调用服务层
        return powerBankService.getAllPowerBanks();
    }

    @PostMapping("/power_bank/return/{id}")
    public void rentPowerBank(@PathVariable("id") int powerBankId){
        powerBankService.updatePowerBankState(powerBankId, 1);
    }

}
