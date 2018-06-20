package com.yufan.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * 
* @ClassName: LoginInterceptor  
* @Description:  SpringMVC 拦截器 实现
* @author 雨ゆこ
* @date 2018年4月29日
* @version yuko1.0
 */
public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		super.afterConcurrentHandlingStarted(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		if(request.getServletPath().endsWith("login.jsp")){
			return true;
		}
		if(request.getSession().getAttribute("user") != null){
			return true;
		}
		response.sendRedirect(request.getContextPath());
		return false;
	}

}
