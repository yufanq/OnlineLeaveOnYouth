package com.yufan.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yufan.dao.ContactMapper;
import com.yufan.dao.UserInfomationMapper;
import com.yufan.entity.Contact;
import com.yufan.entity.UserInfomation;
import com.yufan.service.UserServiice;

@Service
@Transactional
public class UserServiceImpl implements UserServiice{

	@Autowired
	private UserInfomationMapper userInfomationMapper; // 用户dao
	@Autowired
	private ContactMapper contactMapper;
	@Override
	public UserInfomation login(UserInfomation userInfomation) {
		// 查询 用户信息 
		return userInfomationMapper.selectUserInfomationByNameAndPassword(userInfomation);
	}

	@Override
	public Integer createUser(UserInfomation userInfomation) {
		
		int insert = userInfomationMapper.insert(userInfomation);
		
		return insert;
	}

	@Override
	public Integer updateUserStatus(UserInfomation userInfomation) {
		int updateByPrimaryKeySelective = userInfomationMapper.updateByPrimaryKeySelective(userInfomation);
		return updateByPrimaryKeySelective;
	}

	@Override
	public Contact queryContactByUserid(UserInfomation userInfomation) {
		
		return contactMapper.selectByUid(userInfomation.getkUid());
	}

	@Override
	public Integer updateContact(Contact contact) {
		int updateByPrimaryKeySelective = contactMapper.updateByPrimaryKeySelective(contact);
		return updateByPrimaryKeySelective;
	}

	@Override
	public Integer createContact(Contact contact) {
		return contactMapper.insert(contact);
	}

	
}
