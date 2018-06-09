<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>登录页面</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.default.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/general.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/login.js"></script>
<!--[if IE 9]>
    <link rel="stylesheet" media="screen" href="css/style.ie9.css"/>
<![endif]-->
<!--[if IE 8]>
    <link rel="stylesheet" media="screen" href="css/style.ie8.css"/>
<![endif]-->
<!--[if lt IE 9]>
	<script src="${pageContext.request.contextPath}/static/js/plugins/css3-mediaqueries.js"></script>
<![endif]-->
</head>

<body class="loginpage">
	<div class="loginbox">
    	<div class="loginboxinner">
        	
            <div class="logo"> 
             <h1 class="logo">Online<span>LeaveOnYouth</span></h1>
            <span class="slogan">留住青春</span>
            </div><!--logo-->
            
            <br clear="all" /><br />
            
            <div class="nousername">
				<div class="loginmsg">密码不正确.</div>
            </div><!--nousername-->
            
            <div class="nopassword">
				<div class="loginmsg">密码不正确.</div>
                <div class="loginf">
                    <div class="thumb"><img alt="" src="${pageContext.request.contextPath}/static/images/thumbs/avatar1.png" /></div>
                    <div class="userlogged">
                        <h4></h4>
                        <a href="${pageContext.request.contextPath}/login.jsp">已经注册 <span></span>登录</a> 
                    </div>
                </div><!--loginf-->
            </div><!--nopassword-->
            <div class="error">${msg}</div>
            <form id="login" action="${pageContext.request.contextPath}/user/regist" method="post">
            	
                <div class="username">
                	<div class="usernameinner">
                    	<input type="text" name="kUaccount" id="username"  />
                    </div>
                </div>
                
                <div class="password">
                	<div class="passwordinner">
                    	<input type="password" name="kUpassword" id="password" />
                    </div>
                </div>
                
                <button>注册</button>
                
                <div class="keep">
                 <a href="${pageContext.request.contextPath}/login.jsp">已经注册 <span></span>登录</a> 
            </div>
            </form>
            
        </div><!--loginboxinner-->
    </div><!--loginbox-->


</body>
</html>
