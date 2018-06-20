package com.yufan.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yufan.entity.CrowdInfomation;
import com.yufan.entity.UserInfomation;
import com.yufan.service.GroupService;
import com.yufan.service.MessageService;

@Controller
@RequestMapping(value="/group")
public class GroupController {

	@Autowired
	private GroupService groupService;
	
	@Autowired
	private MessageService messageService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String groupList(Model model,HttpSession session){
		UserInfomation userInfomation = (UserInfomation) session.getAttribute("user");
		model.addAttribute("createdGroup", groupService.selectCrowdByUidAndJid(userInfomation.getkUid(), 0));
		model.addAttribute("managerGroup", groupService.selectCrowdByUidAndJid(userInfomation.getkUid(), 1));
		model.addAttribute("joinGroup", groupService.selectCrowdByUidAndJid(userInfomation.getkUid(), 2));
		
		return "groupmanager";
	}
	@RequestMapping(method = RequestMethod.POST,value="/createGroup")
	public String createGroup(Model model, CrowdInfomation crowdInfomation,HttpSession session){
		UserInfomation userInfomation = (UserInfomation) session.getAttribute("user");
		crowdInfomation.setkUid(userInfomation.getkUid());
		Integer createGroup = groupService.createGroup(crowdInfomation);
			
		return "redirect:/group";
	}
	@RequestMapping(value="showGroup",method=RequestMethod.GET)
	public String showGroup(Model model,HttpSession session){
		// 当前用户
		UserInfomation userInfomation = (UserInfomation) session.getAttribute("user");
		// 用户未参加的群组
		List<CrowdInfomation> selectCrowdByNoBelongToUser = groupService.selectCrowdByNoBelongToUser(userInfomation);
		model.addAttribute("crowdList", selectCrowdByNoBelongToUser);
		return"groupselect";
	}
	@RequestMapping(value="/{id}/showGroupMemberAndActivity",method=RequestMethod.GET)
	public String showGroupMemberAndActivity(Model model,@PathVariable("id")Integer cid){
		// 组内 成员信息
		model.addAttribute("memberList", groupService.selectMemberByGid(cid));
		// 组内 活动
		model.addAttribute("activityList", messageService.queryActivityByCid(cid));
		return "groupshow";
	}
	
}
