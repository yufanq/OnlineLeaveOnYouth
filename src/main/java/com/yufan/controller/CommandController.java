package com.yufan.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yufan.entity.Commend;
import com.yufan.entity.UserInfomation;
import com.yufan.service.CommendService;

@Controller
@RequestMapping(value="/commend")
public class CommandController {

	@Autowired
	private CommendService commendService;
	@RequestMapping(value="/{id}/showActivityCommend",method=RequestMethod.GET)
	public String showActivityCommend(@PathVariable Integer id,Model model){
		
		List<Commend> showCommendByMessageId = commendService.showCommendByMessageId(id);
		model.addAttribute("commendList",showCommendByMessageId);
		return "commendshow";
	}
	
	@RequestMapping(value="/{id}/createCommend",method=RequestMethod.POST)
	public String createCommend(@PathVariable Integer id,Commend commend,HttpSession session,RedirectAttributes redirectAttributes){
		commend.setkMid(id);
		UserInfomation userInfomation = (UserInfomation) session.getAttribute("user");
		commend.setUserInfomation(userInfomation);
		commendService.addCommend(commend);
		return "redirect:/commend/"+id+"/showActivityCommend";
		
	}
}
