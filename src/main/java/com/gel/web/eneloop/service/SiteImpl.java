package com.gel.web.eneloop.service;

import com.gel.web.eneloop.mapper.SiteMapper;
import com.gel.web.eneloop.pojo.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteImpl implements SiteService{

    @Autowired
    private SiteMapper siteMapper;

    @Override
    public List<Site> getAllSites(){
        return siteMapper.getAllSites();
    }
}
