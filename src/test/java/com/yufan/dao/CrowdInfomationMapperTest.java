package com.yufan.dao;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yufan.entity.CrowdInfomation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class CrowdInfomationMapperTest {
	@Autowired
	private CrowdInfomationMapper crowdInfomationMapper;
	
	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		CrowdInfomation crowdInfomation = new CrowdInfomation();
		crowdInfomation.setkUid(1);
		crowdInfomation.setkCrojurisdiction((byte) 0);
		crowdInfomation.setkCroname("雨凡第一群组");
		crowdInfomation.setkCrocreatetime(new Date());
		crowdInfomationMapper.insert(crowdInfomation);
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKey() {
		System.out.println(crowdInfomationMapper.selectByPrimaryKey(1));
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectCrowdBYUid() {

		System.out.println(crowdInfomationMapper.selectCrowdBYUid(1));
	}

}
