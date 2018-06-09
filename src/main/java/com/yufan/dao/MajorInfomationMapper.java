package com.yufan.dao;

import com.yufan.entity.MajorInfomation;

public interface MajorInfomationMapper {
    int deleteByPrimaryKey(Integer kMid);

    int insert(MajorInfomation record);

    int insertSelective(MajorInfomation record);

    MajorInfomation selectByPrimaryKey(Integer kMid);

    int updateByPrimaryKeySelective(MajorInfomation record);

    int updateByPrimaryKey(MajorInfomation record);
}