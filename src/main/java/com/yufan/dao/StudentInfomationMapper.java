package com.yufan.dao;

import com.yufan.entity.StudentInfomation;

public interface StudentInfomationMapper {
    int deleteByPrimaryKey(Integer kStuid);

    int insert(StudentInfomation record);

    int insertSelective(StudentInfomation record);

    StudentInfomation selectByPrimaryKey(Integer kStuid);

    int updateByPrimaryKeySelective(StudentInfomation record);

    int updateByPrimaryKey(StudentInfomation record);
}