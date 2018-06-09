package com.yufan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yufan.entity.CrowdInfomation;
import com.yufan.entity.GroupNumberInfomation;

public interface GroupNumberInfomationMapper {
    int deleteByPrimaryKey(Integer kGid);

    int insert(GroupNumberInfomation record);

    int insertSelective(GroupNumberInfomation record);

    GroupNumberInfomation selectByPrimaryKey(Integer kGid);

    int updateByPrimaryKeySelective(GroupNumberInfomation record);

    int updateByPrimaryKey(GroupNumberInfomation record);
    /**
     * 
    * @Title: selectCrowdByCrowdId  
    * @Description:   所以群成员
    * @param @param id
    * @param @return    参数  
    * @return List<GroupNumberInfomation>    返回类型  
    * @throws
     */
    List<GroupNumberInfomation> selectCrowdByCrowdId(Integer id);
    /**
     * 
    * @Title: selectCrowdByUidAndJid  
    * @Description:  
    * @param @param uid
    * @param @param jid
    * @param @return    参数  
    * @return List<CrowdInfomation>    返回类型  
    * @throws
     */
    List<CrowdInfomation> selectCrowdByUidAndJid(@Param("uid")Integer uid,@Param("jid")Integer jid);
    
    List<CrowdInfomation> selectCrowdByuid(Integer id);
}