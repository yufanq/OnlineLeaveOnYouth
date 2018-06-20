package com.yufan.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javassist.bytecode.Mnemonic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.mail.handlers.message_rfc822;
import com.yufan.dao.CrowdInfomationMapper;
import com.yufan.dao.GroupNumberInfomationMapper;
import com.yufan.dao.MmessageMapper;
import com.yufan.entity.CrowdInfomation;
import com.yufan.entity.GroupNumberInfomation;
import com.yufan.entity.Mmessage;
import com.yufan.entity.UserInfomation;
import com.yufan.service.GroupService;
import com.yufan.service.MessageService;

@Service
@Transactional
public class MessageServiceImpl implements MessageService{

	@Autowired
	private MmessageMapper mmessageMapper; // 消息 dao
	@Autowired
	private CrowdInfomationMapper crowdInfomationMapper; // 群组dao
	@Autowired
	private GroupNumberInfomationMapper groupNumberInfomationMapper; // 组成员表dao
	@Override
	public Integer createMessage(Mmessage mmessage) {
		
		return mmessageMapper.insert(mmessage);
	}

	@Override
	public Integer updateMessage(Mmessage mmessage) {
		// TODO Auto-generated method stub
		return mmessageMapper.updateByPrimaryKeySelective(mmessage);
	}

	@Override
	public Integer deleteMessage(Integer id) {
		return mmessageMapper.deleteByPrimaryKey(id);
	}



	@Override
	public List<Mmessage> queryJoinGroupMessage(UserInfomation userInfomation) {
		// 该用户创建的群组
		List<CrowdInfomation> selectCrowdBYUid = crowdInfomationMapper.selectCrowdBYUid(userInfomation.getkUid());
		// 入群申请 list
		List<Mmessage> joinGroupMessage = new ArrayList<Mmessage>();
		for (CrowdInfomation crowdInfomation : selectCrowdBYUid) {
		
			// 该群id 的入群申请
			List<Mmessage> selectMessageByCidAndMtype = mmessageMapper.selectMessageByCidAndMtype(crowdInfomation.getkCroid(),(byte) 0);
			// 添加到 用户的入群申请
			joinGroupMessage.addAll(selectMessageByCidAndMtype);
		}
		return joinGroupMessage;
	}

	@Override
	public List<Mmessage> queryJoinActivityMessage(UserInfomation userInfomation) {
		// 用户id  活动通知 标识 3
		List<Mmessage> selectMessageByCidAndMtype = mmessageMapper.selectMessageByUidAndMtype(userInfomation.getkUid(),(byte) 3);
		return selectMessageByCidAndMtype;
	}

	@Override
	public Mmessage queryMessageByid(Integer id) {
		return mmessageMapper.selectByPrimaryKey(id);
	}

	@Override
	public void dealWithMessage(Integer id, Integer flag) {
		// 获取完整信息
		Mmessage queryMessageByid = mmessageMapper.selectByPrimaryKey(id);
		if(flag == 1){ //同意 
			// 完善 入群信息
			GroupNumberInfomation groupNumberInfomation = new GroupNumberInfomation();
				// 组群信息
				CrowdInfomation crowdInfomation = new CrowdInfomation();
				crowdInfomation.setkCroid(queryMessageByid.getkCroid());
				// 用户信息
				UserInfomation userInfomation = new UserInfomation();
				userInfomation.setkUid(queryMessageByid.getkUid());
				groupNumberInfomation.setCrowdInfomation(crowdInfomation);
				groupNumberInfomation.setUserInfomation(userInfomation);
				groupNumberInfomation.setkGlevel((byte) 2);
			//同意入群
			groupNumberInfomationMapper.insert(groupNumberInfomation);
			//  准备反馈消息
			CrowdInfomation selectByPrimaryKey = crowdInfomationMapper.selectByPrimaryKey(queryMessageByid.getkCroid());
			Mmessage mmessage = new Mmessage();
			mmessage.setkCroid(queryMessageByid.getkCroid());
			mmessage.setkMdate(new Date());
			mmessage.setkMname("入群反馈");
			mmessage.setkMtype((byte) 2);
			mmessage.setkMdeatail("恭喜您加入"+ selectByPrimaryKey.getkCroname());
			mmessage.setkUid(queryMessageByid.getkUid());// 收信人
			mmessageMapper.insert(mmessage); // 反馈信息插入
			mmessageMapper.deleteByPrimaryKey(id); // 删除该条 消息
		} else if(flag == 0){ // 拒绝
			CrowdInfomation selectByPrimaryKey = crowdInfomationMapper.selectByPrimaryKey(queryMessageByid.getkCroid());
			Mmessage mmessage = new Mmessage();
			mmessage.setkCroid(queryMessageByid.getkCroid());
			mmessage.setkMdate(new Date());
			mmessage.setkMname("入群反馈");
			mmessage.setkMtype((byte) 2);
			mmessage.setkMdeatail("抱歉您已经被"+ selectByPrimaryKey.getkCroname()+"拒绝");
			mmessage.setkUid(queryMessageByid.getkUid());// 收信人
			mmessageMapper.insert(mmessage); // 反馈信息插入
			mmessageMapper.deleteByPrimaryKey(id); // 删除该条 消息
		}
	}

	@Override
	public List<Mmessage> queryDealMessage(UserInfomation userInfomation) {
		return	mmessageMapper.selectMessageByUidAndMtype(userInfomation.getkUid(), (byte) 2);
		
	}

	@Override
	public List<Mmessage> queryActivityByCid(Integer id) {
		return	mmessageMapper.selectMessageByCidAndMtype(id, (byte) 1);
		 
	}

	@Override
	public List<Mmessage> queryAllUserJoinActivity(UserInfomation userInfomation) {
			//用户参加的 群组
			List<CrowdInfomation> selectCrowdBYUid = crowdInfomationMapper.selectCrowdBYUid(userInfomation.getkUid());
			 // 存放 参加的活动
			List<Mmessage> allActivity = new ArrayList<Mmessage>();
			for (CrowdInfomation crowdInfomation : selectCrowdBYUid) {
				List<Mmessage> selectMessageByCidAndMtype = mmessageMapper.selectMessageByCidAndMtype(crowdInfomation.getkCroid(), (byte) 1);
				allActivity.addAll(selectMessageByCidAndMtype);
			}
		return allActivity;
	}



	

}
