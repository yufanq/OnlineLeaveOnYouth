package com.yufan.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yufan.entity.Mmessage;
import com.yufan.entity.UserInfomation;
import com.yufan.service.MessageService;

@Controller
@RequestMapping(value="/message")
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/{id}/createMessage")
	public void createMessage(@PathVariable("id") Integer id,Model model,HttpServletResponse response,HttpSession session) throws IOException{
		// 设置 字符集
				response.setContentType("text/text;charset=UTF-8");
				//  打印出去
				PrintWriter out = response.getWriter();
		UserInfomation userInfomation = (UserInfomation) session.getAttribute("user");
		Mmessage mmessage = new Mmessage();
		mmessage.setkCroid(id);
		mmessage.setkUid(userInfomation.getkUid());
		mmessage.setkMdate(new Date());
		mmessage.setkMdeatail(userInfomation.getkUname()+"申请加入群");
		mmessage.setkMname("入群申请");
		Integer createMessage = messageService.createMessage(mmessage);
		out.print(createMessage);
	}
	
	

}
