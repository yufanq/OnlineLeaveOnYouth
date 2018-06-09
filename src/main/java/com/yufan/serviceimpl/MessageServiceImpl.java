package com.yufan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yufan.dao.MmessageMapper;
import com.yufan.entity.Mmessage;
import com.yufan.service.MessageService;

@Service
@Transactional
public class MessageServiceImpl implements MessageService{

	@Autowired
	private MmessageMapper mmessageMapper; // 消息 dao
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
	public List<Mmessage> queryMeesageByCidAndMtype(Mmessage meMmessage) {
		return mmessageMapper.selectMessageByCidAndMtype(meMmessage);
	}

}
