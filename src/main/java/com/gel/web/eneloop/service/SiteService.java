package com.gel.web.eneloop.service;

import com.gel.web.eneloop.pojo.Site;

import java.util.List;

public interface SiteService {
    public List<Site> getAllSites();

    public Site getSiteById(int id);
}
