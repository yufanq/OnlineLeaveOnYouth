package com.yufan.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yufan.dao.CrowdInfomationMapper;
import com.yufan.dao.GroupNumberInfomationMapper;
import com.yufan.dao.UserInfomationMapper;
import com.yufan.entity.CrowdInfomation;
import com.yufan.entity.GroupNumberInfomation;
import com.yufan.entity.UserInfomation;
import com.yufan.service.GroupService;

@Service
@Transactional
public class GroupServiceImpl implements GroupService{

	@Autowired
	private CrowdInfomationMapper crowdInfomationMapper;
	@Autowired
	private GroupNumberInfomationMapper groupNumberInfomationMapper;
	@Autowired
	private UserInfomationMapper userInfomationMapper;
	@Override
	public Integer createGroup(CrowdInfomation crowdInfomation) {
			if(crowdInfomation == null){
				return 0;
			}
			if(crowdInfomation.getkCrojurisdiction() == null){
				crowdInfomation.setkCrojurisdiction((byte) 0); // 自由进入
			}
			crowdInfomation.setkCrocreatetime(new Date()); // 设置创建时间
			int insert = crowdInfomationMapper.insert(crowdInfomation); // 创建
			CrowdInfomation selectByName = crowdInfomationMapper.selectByName(crowdInfomation);
			// 群主为第一个群成员
			GroupNumberInfomation groupNumberInfomation = new GroupNumberInfomation();
			groupNumberInfomation.setCrowdInfomation(selectByName);
			groupNumberInfomation.setkGlevel((byte) 0);
			UserInfomation selectByPrimaryKey = userInfomationMapper.selectByPrimaryKey(selectByName.getkUid());
			groupNumberInfomation.setkGstatus(selectByPrimaryKey.getkUstatus());
			groupNumberInfomation.setUserInfomation(selectByPrimaryKey);
			groupNumberInfomationMapper.insert(groupNumberInfomation);
		return insert;
	}

	@Override
	public Integer updateGroup(CrowdInfomation crowdInfomation) {
		int updateByPrimaryKey = crowdInfomationMapper.updateByPrimaryKey(crowdInfomation);
		return updateByPrimaryKey;
	}

	@Override
	public Integer deleteGroup(Integer id) {
		int deleteByPrimaryKey = crowdInfomationMapper.deleteByPrimaryKey(id);
		return deleteByPrimaryKey;
	}

	@Override
	public CrowdInfomation selectGroupById(Integer id) {
		return crowdInfomationMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<GroupNumberInfomation> selectGroupByUid(Integer id) {
		List<GroupNumberInfomation> selectCrowdByCrowdId = groupNumberInfomationMapper.selectCrowdByCrowdId(id);
		return selectCrowdByCrowdId;
	}

	@Override
	public List<CrowdInfomation> selectCrowdByUidAndJid(Integer uid, Integer jid) {
		List<CrowdInfomation> selectCrowdByUidAndJid = groupNumberInfomationMapper.selectCrowdByUidAndJid(uid, jid);
		return  selectCrowdByUidAndJid;
	}

	@Override
	public List<CrowdInfomation> selectCrowdByUid(Integer id) {
		List<CrowdInfomation> selectCrowdByuid = groupNumberInfomationMapper.selectCrowdByuid(id);
		return selectCrowdByuid;
	}

	@Override
	public List<CrowdInfomation> selectCrowdByNoBelongToUser(
			UserInfomation userInfomation) {
		// 不属于用户的群组
		List<CrowdInfomation> selectCrowdByuid = groupNumberInfomationMapper.selectCrowdByuid(userInfomation.getkUid());
		return selectCrowdByuid;
	}

}
