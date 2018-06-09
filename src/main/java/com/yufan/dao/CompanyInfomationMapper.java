package com.yufan.dao;

import com.yufan.entity.CompanyInfomation;

public interface CompanyInfomationMapper {
    int deleteByPrimaryKey(Integer kComid);

    int insert(CompanyInfomation record);

    int insertSelective(CompanyInfomation record);

    CompanyInfomation selectByPrimaryKey(Integer kComid);

    int updateByPrimaryKeySelective(CompanyInfomation record);

    int updateByPrimaryKey(CompanyInfomation record);
}