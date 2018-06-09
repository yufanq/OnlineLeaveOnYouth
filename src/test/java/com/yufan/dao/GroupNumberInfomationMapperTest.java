package com.yufan.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yufan.entity.CrowdInfomation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class GroupNumberInfomationMapperTest {

	@Autowired
	private GroupNumberInfomationMapper groupNumberInfomationMapper;
	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKey() {
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
	public void testSelectCrowdByCrowdId() {
		System.out.println(groupNumberInfomationMapper.selectCrowdByCrowdId(1));
	}

	@Test
	public void testSelectCrowdByUidAndJid() {
		System.out.println(groupNumberInfomationMapper.selectCrowdByUidAndJid(1, 0));
	}

}
