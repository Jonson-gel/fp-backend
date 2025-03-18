package com.gel.web.eneloop.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.gel.web.eneloop.pojo.Site;

import java.util.List;

@Mapper
public interface SiteMapper {
    public List<Site> getAllSites();
}
