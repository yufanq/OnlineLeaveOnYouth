package com.yufan.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yufan.entity.UserInfomation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class UserInfomationMapperTest {
	
	@Autowired
	private UserInfomationMapper userInfomationMapper;
	@Test
	public void testDeleteByPrimaryKey() {

		userInfomationMapper.deleteByPrimaryKey(1);
	}

	@Test
	public void testInsert() {

		UserInfomation userInfomation = new UserInfomation();
		userInfomation.setkUaccount("yufan");
		userInfomation.setkUpassword("yufan");
		userInfomation.setkUname("yufan");
		userInfomation.setkUage(20);
		userInfomationMapper.insert(userInfomation);
	}

	@Test
	public void testInsertSelective() {
		
	}

	@Test
	public void testSelectByPrimaryKey() {
		System.out.println(userInfomationMapper.selectByPrimaryKey(1));
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectUserInfomationByNameAndPassword() {
		UserInfomation userInfomation = new UserInfomation();
		userInfomation.setkUaccount("yufan");
		userInfomation.setkUpassword("yufan");
		System.out.println(
				userInfomationMapper.selectUserInfomationByNameAndPassword(userInfomation));
	}

}
