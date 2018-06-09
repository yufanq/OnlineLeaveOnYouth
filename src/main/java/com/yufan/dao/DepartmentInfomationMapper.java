package com.yufan.dao;

import com.yufan.entity.DepartmentInfomation;

public interface DepartmentInfomationMapper {
    int deleteByPrimaryKey(Integer kDid);

    int insert(DepartmentInfomation record);

    int insertSelective(DepartmentInfomation record);

    DepartmentInfomation selectByPrimaryKey(Integer kDid);

    int updateByPrimaryKeySelective(DepartmentInfomation record);

    int updateByPrimaryKey(DepartmentInfomation record);
}