package com.yufan.dao;

import com.yufan.entity.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer kAid);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer kAid);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}