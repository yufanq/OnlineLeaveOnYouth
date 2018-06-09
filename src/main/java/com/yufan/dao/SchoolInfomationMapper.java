package com.yufan.dao;

import com.yufan.entity.SchoolInfomation;

public interface SchoolInfomationMapper {
    int deleteByPrimaryKey(Integer kSid);

    int insert(SchoolInfomation record);

    int insertSelective(SchoolInfomation record);

    SchoolInfomation selectByPrimaryKey(Integer kSid);

    int updateByPrimaryKeySelective(SchoolInfomation record);

    int updateByPrimaryKey(SchoolInfomation record);
}