package com.yufan.service;

import java.util.List;

import com.yufan.entity.Mmessage;

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
	* @Title: queryMeesageByCidAndMtype  
	* @Description:   根据 群组id 和消息类型查询
	* @param @param meMmessage
	* @param @return    参数  
	* @return List<Mmessage>    返回类型  
	* @throws
	 */
	List<Mmessage> queryMeesageByCidAndMtype(Mmessage meMmessage);

	
}
