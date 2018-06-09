package com.yufan.dao;

import java.util.List;

import javax.jms.Message;

import com.yufan.entity.Mmessage;

public interface MmessageMapper {
    int deleteByPrimaryKey(Integer kMid);

    int insert(Mmessage record);

    int insertSelective(Mmessage record);

    Mmessage selectByPrimaryKey(Integer kMid);

    int updateByPrimaryKeySelective(Mmessage record);

    int updateByPrimaryKey(Mmessage record);
    /**
     * 
    * @Title: selectMessageByCidAndMtype  
    * @Description:  根据信息的所属的组群跟 类别 查找
    * @param @param mmessage
    * @param @return    参数  
    * @return List<Mmessage>    返回类型  
    * @throws
     */
    
    List<Mmessage> selectMessageByCidAndMtype(Mmessage mmessage);
    
}