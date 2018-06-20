package com.yufan.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yufan.entity.Contact;
import com.yufan.entity.UserInfomation;
import com.yufan.service.UserServiice;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServiice userServiice;
	
	@RequestMapping(method = RequestMethod.POST, value ="/login")
	public String login(Model model,UserInfomation userInfomation,HttpSession session){
		System.out.println(userInfomation);
		UserInfomation login = userServiice.login(userInfomation);
		if(login == null){
			model.addAttribute("msg", "用户名/密码错误");
			return "login";
		}
		session.setAttribute("user", login);
		return "redirect:/activity/showActivity";
	}
	@RequestMapping(value="/regist" ,method = RequestMethod.POST)
	public String regist(Model model,UserInfomation userInfomation){
		if(userInfomation == null){
			model.addAttribute("msg", "注册失败");
		}
		Integer createUser = userServiice.createUser(userInfomation);
		
		return "login";
	}
	@RequestMapping(value="/logout" ,method = RequestMethod.GET)
	public String logOut(Model model,HttpSession session){
		session.removeAttribute("user");
		return "login";
	}
	
	@RequestMapping(value="/showUserMessage",method=RequestMethod.GET)
	public String showUserMessage(Model model,HttpSession session){
		
		UserInfomation userInfomation = (UserInfomation)session.getAttribute("user");
		model.addAttribute("contact", userServiice.queryContactByUserid(userInfomation));
		
		return "userinfonation";
	}
	
	@RequestMapping(value="/updateUsermessage",method=RequestMethod.GET)
	public String updateUsermessage(Model model,HttpSession session){
		
		UserInfomation userInfomation = (UserInfomation)session.getAttribute("user");
		model.addAttribute("contact", userServiice.queryContactByUserid(userInfomation));
		return "userinfonationupdate";
	}
	@RequestMapping(value="/updateUsermessage",method=RequestMethod.POST)
	public String updateUsermessage(Model model,UserInfomation userInfomation,HttpSession session){
		userServiice.updateUserStatus(userInfomation);
		session.setAttribute("user", userInfomation);
		return "redirect:/user/showUserMessage";
	}
	@RequestMapping(value="/updateContactmessage",method=RequestMethod.POST)
	public String updateContactmessage(Model model,Contact contact,HttpSession session){
		UserInfomation userInfomation = (UserInfomation)session.getAttribute("user");
		contact.setkUid(userInfomation.getkUid());
		if(contact.getkConid() == null){
			userServiice.createContact(contact);
		}else{
		userServiice.updateContact(contact);
		}
		return "redirect:/user/showUserMessage";
	}
}
