package com.yufan.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		return "indexshow";
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
}
