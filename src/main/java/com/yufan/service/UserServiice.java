package com.yufan.service;

import com.yufan.entity.UserInfomation;

/**
 * 
* @ClassName: UserServiice  
* @Description:  用户 service
* @author 雨ゆこ
* @date 2018年6月9日
* @version yuko1.0
 */
public interface UserServiice {
/**
 * 
* @Title: login  
* @Description:  登录
* @param @param userInfomation
* @param @return    参数  
* @return UserInfomation    返回类型  
* @throws
 */
	UserInfomation login(UserInfomation userInfomation);
	/**
	 * 
	* @Title: createUser  
	* @Description:  查询
	* @param @param userInfomation
	* @param @return    参数  
	* @return Integer    返回类型  
	* @throws
	 */
	Integer createUser(UserInfomation userInfomation);
	
	Integer updateUserStatus(UserInfomation userInfomation);
}
