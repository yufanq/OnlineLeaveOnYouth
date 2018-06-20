<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
    <div class="topheader">
        <div class="left">
            <h1 class="logo">Online<span>LeaveOnYouth</span></h1>
            <span class="slogan">留住青春</span>
            
            <div class="search">
            	<form action="" method="post">
                	<input type="text" name="keyword" id="keyword" value="Enter keyword(s)" />
                    <button class="submitbutton"></button>
                </form>
            </div><!--search-->
            
            <br clear="all" />
            
        </div><!--left-->
        
         	<c:choose>
         		<c:when test="${ user == null }">
        <div class="right">
        	<!--<div class="notification">
                <a class="count" href="http://demo.themepixels.com/webpage/amanda/ajax/notifications.html"><span>9</span></a>
        	</div>
			-->
            <div class="userinfo">
            	<img src="${pageContext.request.contextPath}/static/images/thumbs/avatar.png" alt="" />
                <span>
         		游客
         	    </span>
            </div><!--userinfo-->
            
            <div class="userinfodrop">            	<div class="avatar">
                	<a href=""><img src="${pageContext.request.contextPath}/static/images/thumbs/avatarbig.png" alt="" /></a>
                    <div class="changetheme">
                    	改变主题: <br />
                    	<a class="default"></a>
                        <a class="blueline"></a>
                        <a class="greenline"></a>
                        <a class="contrast"></a>
                        <a class="custombg"></a>
                    </div>
                </div><!--avatar-->
<div class="userdata">
                	<h4>游客</h4>
                   
                    <ul>
                    	<li><a href="${pageContext.request.contextPath}/login.jsp">登录</a></li>
                        <li><a href="${pageContext.request.contextPath}/register.jsp">注册</a></li>
                    </ul>
                </div><!--userdata-->
            </div><!--userinfodrop-->
        </div><!--right-->
        
         		</c:when>
         		<c:when test="${ user != null }">
         		    <div class="right">
        	<!--<div class="notification">
                <a class="count" href="http://demo.themepixels.com/webpage/amanda/ajax/notifications.html"><span>9</span></a>
        	</div>
			-->
            <div class="userinfo">
            	<img src="${pageContext.request.contextPath}/static/images/thumbs/avatar.png" alt="" />
                <span>
         		${ user.kUname }
         	    </span>
            </div><!--userinfo-->
            
            <div class="userinfodrop"> 
                       	<div class="avatar">
                	<a href=""><img src="${pageContext.request.contextPath}/static/images/thumbs/avatarbig.png" alt="" /></a>
                    <div class="changetheme">
                    	改变主题: <br />
                    	<a class="default"></a>
                        <a class="blueline"></a>
                        <a class="greenline"></a>
                        <a class="contrast"></a>
                        <a class="custombg"></a>
                    </div>
                </div><!--avatar-->
<div class="userdata">
                	<h4>${ user.kUname }</h4>
                	 <span class="email">yu0214fan@gmail.com</span>
                    <ul>
                    	<li><a href="${pageContext.request.contextPath}/user/updateUsermessage">修改信息</a></li>
                        <li><a href="${pageContext.request.contextPath}/user/showUserMessage">个人信息</a></li>
                        <li><a href="${pageContext.request.contextPath}/user/logout">退出</a></li>
                    </ul>
                </div><!--userdata-->
            </div><!--userinfodrop-->
        </div><!--right-->
        
         		</c:when>
         	</c:choose>
    </div><!--topheader-->
    
    
    <div class="header">
    	<ul class="headermenu">
        	<li><a href="${pageContext.request.contextPath}/activity/showActivity"><span class="icon icon-flatscreen"></span>活动</a></li>
            <li><a href="${pageContext.request.contextPath}/group"><span class="icon icon-pencil"></span>群组</a></li>
            <li><a href="${pageContext.request.contextPath}/message"><span class="icon icon-message"></span>消息</a></li>
            <li><a href="${pageContext.request.contextPath}/user/showUserMessage"><span class="icon icon-chart"></span>个人中心</a></li>
        </ul>
        
     <!--    <div class="headerwidget">
        	<div class="earnings">
            	<div class="one_half">
                	<h4>Today's Earnings</h4>
                    <h2>$640.01</h2>
                </div>one_half
                <div class="one_half last alignright">
                	<h4>Current Rate</h4>
                    <h2>53%</h2>
                </div>one_half last
            </div>earnings
        </div>headerwidget
         -->
    </div><!--header-->
    
