package com.yufan.dao;

import com.yufan.entity.UserInfomation;

public interface UserInfomationMapper {
    int deleteByPrimaryKey(Integer kUid);

    int insert(UserInfomation record);

    int insertSelective(UserInfomation record);

    UserInfomation selectByPrimaryKey(Integer kUid);

    int updateByPrimaryKeySelective(UserInfomation record);

    int updateByPrimaryKey(UserInfomation record);
    
    UserInfomation selectUserInfomationByNameAndPassword(UserInfomation userInfomation);
}