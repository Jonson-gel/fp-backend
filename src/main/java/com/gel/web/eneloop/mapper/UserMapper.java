package com.gel.web.eneloop.mapper;

import com.gel.web.eneloop.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    public User getUserByName(String name);

    public void updateUserBalance(@Param("userId") int userId, @Param("balance") int balance);
    ;
}
