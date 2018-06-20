package com.yufan.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yufan.entity.CrowdInfomation;
import com.yufan.entity.Mmessage;
import com.yufan.entity.UserInfomation;
import com.yufan.service.GroupService;
import com.yufan.service.MessageService;

@Controller
@RequestMapping(value="/message")
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	@Autowired
	private GroupService groupService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/{id}/createMessage")
	public void createMessage(@PathVariable("id") Integer id,Model model,HttpServletResponse response,HttpSession session) throws IOException{
		// 设置 字符集
		response.setContentType("text/text;charset=UTF-8");
		//  打印出去
		PrintWriter out = response.getWriter();
		CrowdInfomation selectGroupById = groupService.selectGroupById(id);
		UserInfomation userInfomation = (UserInfomation) session.getAttribute("user");
		Mmessage mmessage = new Mmessage();
		mmessage.setkCroid(id);
		mmessage.setkUid(userInfomation.getkUid());
		mmessage.setkMdate(new Date());
		mmessage.setkMdeatail(userInfomation.getkUname()+"申请加入"+selectGroupById.getkCroname()+"群");
		mmessage.setkMname("入群申请");
		mmessage.setkMtype((byte) 0);
		Integer createMessage = messageService.createMessage(mmessage);
		out.print(createMessage);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String showActivityMessage(Model model,HttpSession session){
		UserInfomation userInfomation = (UserInfomation) session.getAttribute("user");
		// 活动 通知
		List<Mmessage> queryJoinActivityMessage = messageService.queryJoinActivityMessage(userInfomation);
		model.addAttribute("activityNotoyMessageList", queryJoinActivityMessage);
		return "activitymanager";
	}
	
	@RequestMapping(method = RequestMethod.GET ,value = "/showGroupJoinMessage")
	public String showGroupJoinMessage(Model model,HttpSession session){
		// 用户
		UserInfomation userInfomation = (UserInfomation) session.getAttribute("user");
		// 入群申请
		List<Mmessage> queryJoinGroupMessage = messageService.queryJoinGroupMessage(userInfomation);
		// 
		model.addAttribute("joinGroupMessageList", queryJoinGroupMessage);
		model.addAttribute("dealMessage", messageService.queryDealMessage(userInfomation));
		return "messagemanager";
	}
	@RequestMapping(value="/{id}/checkMessage",method=RequestMethod.GET)
	public String checkMessage(Model model,@PathVariable("id")Integer id,Integer flag){
		 messageService.dealWithMessage(id, flag);
		return "redirect:/message/showGroupJoinMessage";
	}
	
	@RequestMapping(value="/{id}/deleteMessage",method=RequestMethod.GET)
	public String deleteMessage(Model model,@PathVariable("id")Integer id){
		messageService.deleteMessage(id);
		return "redirect:/message/showGroupJoinMessage";
	}
	@RequestMapping(value="/{id}/deleteActivityMessage",method=RequestMethod.GET)
	public String deleteActivityMessage(Model model,@PathVariable("id")Integer id){
		messageService.deleteMessage(id);
		return "redirect:/message/showGroupJoinMessage";
	}
}
