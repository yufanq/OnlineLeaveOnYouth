package com.yufan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yufan.dao.CommendMapper;
import com.yufan.entity.Commend;

public interface CommendService {
	
	Integer addCommend(Commend commend);
	
	List<Commend> showCommendByMessageId(Integer id);
	
}
