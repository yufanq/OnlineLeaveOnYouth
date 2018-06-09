package com.yufan.dao;

import com.yufan.entity.Contact;

public interface ContactMapper {
    int deleteByPrimaryKey(Integer kConid);

    int insert(Contact record);

    int insertSelective(Contact record);

    Contact selectByPrimaryKey(Integer kConid);

    int updateByPrimaryKeySelective(Contact record);

    int updateByPrimaryKey(Contact record);
}