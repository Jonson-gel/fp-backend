package com.gel.web.eneloop.mapper;

import com.gel.web.eneloop.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User getUserByName(String name);
}
