package com.gel.web.eneloop.controller;

import com.gel.web.eneloop.pojo.Site;
import com.gel.web.eneloop.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SiteController {

    @Autowired
    private SiteService siteService;

    @CrossOrigin(origins = "https://jonson-gel.github.io")  // 允许的前端地址
    @GetMapping("site")
    @ResponseBody
    public List<Site> getAllSites(){
        return siteService.getAllSites();
    }

    @GetMapping("site/{id}")
    @ResponseBody
    public Site getSiteById(@PathVariable("id") int id){
        return siteService.getSiteById(id);
    }
}
