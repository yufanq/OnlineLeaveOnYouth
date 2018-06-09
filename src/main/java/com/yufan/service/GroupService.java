package com.yufan.service;

import java.util.List;

import com.yufan.entity.CrowdInfomation;
import com.yufan.entity.GroupNumberInfomation;
import com.yufan.entity.UserInfomation;

/**
 * 
* @ClassName: GroupService  
* @Description:  群组管理
* @author 雨ゆこ
* @date 2018年6月9日
* @version yuko1.0
 */
public interface GroupService {
	/**
	 * 
	* @Title: createGroup  
	* @Description:   添加群组
	* @param @param crowdInfomation
	* @param @return    参数  
	* @return Integer    返回类型  
	* @throws
	 */
	Integer createGroup(CrowdInfomation crowdInfomation);
	/**
	 * 
	* @Title: updateGroup  
	* @Description:  修改群粗信息
	* @param @param crowdInfomation
	* @param @return    参数  
	* @return Integer    返回类型  
	* @throws
	 */
	Integer updateGroup(CrowdInfomation crowdInfomation);
	/**
	 * 
	* @Title: deleteGroup  
	* @Description:  删除 群组
	* @param @param id
	* @param @return    参数  
	* @return Integer    返回类型  
	* @throws
	 */
	Integer deleteGroup(Integer id);
	/**
	 * 
	* @Title: selectGroupById  
	* @Description:  根据id查找群组
	* @param @param id
	* @param @return    参数  
	* @return CrowdInfomation    返回类型  
	* @throws
	 */
	CrowdInfomation	selectGroupById(Integer id);
	/**
	 * 
	* @Title: selectGroupByUid  
	* @Description:   根据群组id查找 用户
	* @param @param id
	* @param @return    参数  
	* @return List<CrowdInfomation>    返回类型  
	* @throws
	 */
	List<GroupNumberInfomation> selectGroupByUid(Integer id);
	/**
	 * 
	* @Title: selectCrowdByUidAndJid  
	* @Description:   根据用户等级 和用户id 查找 群组
	* @param @param uid
	* @param @param jid
	* @param @return    参数  
	* @return List<CrowdInfomation>    返回类型  
	* @throws
	 */
	List<CrowdInfomation> selectCrowdByUidAndJid(Integer uid,Integer jid);
	
	List<CrowdInfomation> selectCrowdByUid(Integer id);
	/**
	 * 
	* @Title: selectCrowdByNoBelongToUser  
	* @Description:   查找不属于用户的群组
	* @param @param userInfomation
	* @param @return    参数  
	* @return List<CrowdInfomation>    返回类型  
	* @throws
	 */
	List<CrowdInfomation> selectCrowdByNoBelongToUser(UserInfomation userInfomation);
}
