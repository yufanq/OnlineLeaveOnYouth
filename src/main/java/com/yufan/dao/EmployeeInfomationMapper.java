package com.yufan.dao;

import com.yufan.entity.EmployeeInfomation;

public interface EmployeeInfomationMapper {
    int deleteByPrimaryKey(Integer kEid);

    int insert(EmployeeInfomation record);

    int insertSelective(EmployeeInfomation record);

    EmployeeInfomation selectByPrimaryKey(Integer kEid);

    int updateByPrimaryKeySelective(EmployeeInfomation record);

    int updateByPrimaryKey(EmployeeInfomation record);
}