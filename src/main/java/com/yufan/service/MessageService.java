package com.yufan.service;

import java.util.List;

import com.yufan.entity.Mmessage;
import com.yufan.entity.UserInfomation;

/**
 * 
* @ClassName: MessageService  
* @Description:  消息 Service
* @author 雨ゆこ
* @date 2018年6月9日
* @version yuko1.0
 */
public interface MessageService {
	/**
	 * 
	* @Title: createMessage  
	* @Description:   创建一条消息
	* @param @param mmessage
	* @param @return    参数  
	* @return Integer    返回类型  
	* @throws
	 */
	Integer createMessage(Mmessage mmessage);
	
	Integer updateMessage(Mmessage mmessage);
	
	Integer deleteMessage(Integer id);

	/**
	 * 
	* @Title: queryJoinGroupMessage  
	* @Description:   查找群组加入申请信息
	* @param @param userInfomation
	* @param @return    参数  
	* @return List<Mmessage>    返回类型  
	* @throws
	 */
	List<Mmessage> queryJoinGroupMessage(UserInfomation userInfomation);
	/**
	 * 
	* @Title: queryJoinActivityMessage  
	* @Description:   查找活动邀请提示信息
	* @param @param userInfomation
	* @param @return    参数  
	* @return List<Mmessage>    返回类型  
	* @throws
	 */
	List<Mmessage> queryJoinActivityMessage(UserInfomation userInfomation);
	
	Mmessage queryMessageByid(Integer id);
	
	void dealWithMessage(Integer id,Integer flag);
	
	List<Mmessage> queryDealMessage(UserInfomation userInfomation);
	/**
	 * 
	* @Title: queryActivityByCid  
	* @Description:  通过群id 查找群活动
	* @param @param id
	* @param @return    参数  
	* @return List<Mmessage>    返回类型  
	* @throws
	 */
	List<Mmessage> queryActivityByCid(Integer id);
	
	List<Mmessage> queryAllUserJoinActivity(UserInfomation userInfomation);
	
}
