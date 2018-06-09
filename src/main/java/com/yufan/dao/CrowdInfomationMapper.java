package com.yufan.dao;

import java.util.List;

import com.yufan.entity.CrowdInfomation;

public interface CrowdInfomationMapper {
    int deleteByPrimaryKey(Integer kCroid);

    int insert(CrowdInfomation record);

    int insertSelective(CrowdInfomation record);

    CrowdInfomation selectByPrimaryKey(Integer kCroid);

    int updateByPrimaryKeySelective(CrowdInfomation record);

    int updateByPrimaryKey(CrowdInfomation record);
    
    List<CrowdInfomation> selectCrowdBYUid(Integer id);
    
    CrowdInfomation selectByName(CrowdInfomation crowdInfomation);
    List<CrowdInfomation> selectAllCrowd();
}