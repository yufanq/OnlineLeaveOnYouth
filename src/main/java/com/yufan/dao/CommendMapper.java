package com.yufan.dao;

import java.util.List;

import com.yufan.entity.Commend;

public interface CommendMapper {
    int deleteByPrimaryKey(Integer kCommid);

    int insert(Commend record);

    int insertSelective(Commend record);

    Commend selectByPrimaryKey(Integer kCommid);

    int updateByPrimaryKeySelective(Commend record);

    int updateByPrimaryKey(Commend record);
    
    List<Commend> selectCommendByMid(Integer id);
}