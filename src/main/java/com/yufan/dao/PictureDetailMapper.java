package com.yufan.dao;

import com.yufan.entity.PictureDetail;

public interface PictureDetailMapper {
    int deleteByPrimaryKey(Integer kPid);

    int insert(PictureDetail record);

    int insertSelective(PictureDetail record);

    PictureDetail selectByPrimaryKey(Integer kPid);

    int updateByPrimaryKeySelective(PictureDetail record);

    int updateByPrimaryKey(PictureDetail record);
}