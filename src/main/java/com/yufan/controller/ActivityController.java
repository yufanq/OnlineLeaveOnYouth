package com.yufan.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yufan.dao.GroupNumberInfomationMapper;
import com.yufan.entity.CrowdInfomation;
import com.yufan.entity.GroupNumberInfomation;
import com.yufan.entity.Mmessage;
import com.yufan.entity.UserInfomation;
import com.yufan.service.GroupService;
import com.yufan.service.MessageService;

@Controller
@RequestMapping(value="/activity")
public class ActivityController {

	@Autowired
	private MessageService messageService;
	
	@Autowired
	private GroupService groupService;
	@RequestMapping(value="createActivity",method=RequestMethod.GET)
	public String enterCreate(Model model,HttpSession session){
		UserInfomation userInfomation = (UserInfomation) session.getAttribute("user");
		// 创建的群
		List<CrowdInfomation> selectCrowdByUid = groupService.selectCrowdByUid(userInfomation.getkUid());
		model.addAttribute("groupList", selectCrowdByUid);
		return "activityadd";
	}
	@RequestMapping(value="/createActivity",method=RequestMethod.POST)
	public String createActivity(RedirectAttributes redirectAttributes,Mmessage mmessage,HttpSession session){
		UserInfomation userInfomation = (UserInfomation) session.getAttribute("user");
		mmessage.setkUid(userInfomation.getkUid());
		mmessage.setkMtype((byte) 1);
		System.out.println("message:" + mmessage);
		// 创建 活动
		Integer createMessage = messageService.createMessage(mmessage);
		// 群信息
		CrowdInfomation selectGroupById = groupService.selectGroupById(mmessage.getkCroid());
		// 群内成员
		List<GroupNumberInfomation> selectMemberByGid = groupService.selectMemberByGid(mmessage.getkCroid());
		// 发送活动通知
		Mmessage mmessage2 = new Mmessage();
		mmessage2.setkMtype((byte) 3); // 活动 通知
		mmessage2.setkCroid(mmessage.getkCroid());// 发布活动的组
		mmessage2.setkMdate(new Date());
		mmessage2.setkMname("活动通知");
		for (GroupNumberInfomation groupNumberInfomation : selectMemberByGid) {
			mmessage2.setkMdeatail(selectGroupById.getkCroname()+"邀请您参加"+mmessage.getkMname()+"活动");
			mmessage2.setkUid(groupNumberInfomation.getUserInfomation().getkUid());
			messageService.createMessage(mmessage2);
		}
		if(createMessage == 1){
			redirectAttributes.addFlashAttribute("msg", "发布成功");
		}else{
			redirectAttributes.addFlashAttribute("msg", "发布失败");
		}
		return "redirect:/activity/createActivity";
	}
	
	@RequestMapping(value="/showActivity",method = RequestMethod.GET)
	public String showActivity(Model model,HttpSession session){
		UserInfomation userInfomation = (UserInfomation) session.getAttribute("user");
		List<Mmessage> queryJoinGroupMessage = messageService.queryAllUserJoinActivity(userInfomation);
		model.addAttribute("allUserJoinActivity", queryJoinGroupMessage);
		return "activityshow";
	}
	
	

}
