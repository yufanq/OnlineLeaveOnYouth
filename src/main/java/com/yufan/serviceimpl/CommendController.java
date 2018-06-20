package com.yufan.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yufan.dao.CommendMapper;
import com.yufan.entity.Commend;
import com.yufan.service.CommendService;

@Service
@Transactional
public class CommendController implements CommendService{

	@Autowired
	private CommendMapper commendMapper;

	@Override
	public Integer addCommend(Commend commend) {
		commend.setkCommrelease(new Date());
		int insert = commendMapper.insert(commend);
		return insert;
	}

	@Override
	public List<Commend> showCommendByMessageId(Integer id) {
		List<Commend> selectCommendByMid = commendMapper.selectCommendByMid(id);
		return selectCommendByMid;
	}
	
	
	
}
