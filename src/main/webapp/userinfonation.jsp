<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>网页元素</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/style.default.css"
	type="text/css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/plugins/colorpicker.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/plugins/jquery.jgrowl.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/plugins/jquery.alerts.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/custom/general.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/custom/elements.js"></script>
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

<body class="withvernav">
	<div class="bodywrapper">

		<jsp:include page="header.jsp"></jsp:include>
		<div class="vernav2 iconmenu">
			<ul>
				<li><a href="${pageContext.request.contextPath}/user/showUserMessage" class="support">个人信息</a></li>
				<li><a href="${pageContext.request.contextPath}/user/updateUsermessage" class="typo">修改信息</a></li>

			</ul>
			<a class="togglemenu"></a> <br />
			<br />
		</div>
		<!--leftmenu-->

		<div class="centercontent">

			<div class="pageheader notab">
				<h1 class="pagetitle">个人信息</h1>
				<span class="pagedesc">信息显示</span>
			</div>
			<!--pageheader-->

			<div id="contentwrapper" class="contentwrapper elements">
				<ul id="sortable2" class="sortlist">
					<li>
						<div class="label">
							<span class="moveicon"></span> <span class="arrowdrop"></span>
							基本信息
						</div>
						<!--label-->
						<div class="details">
							<ul class="recent_list">
								<li class="user new">
									<div class="msg">
										账号： ${user.kUaccount }
									</div>
								</li>
								<li class="call new">
									<div class="msg">
										昵称：${ user.kUname }
									</div>
								</li>
								<li class="calendar new">
									<div class="msg">
										性别：
										<c:choose>
											<c:when test="${ !user.kUgender }">
												男
											</c:when>
											<c:when test="${ user.kUgender }">
												女
											</c:when>
										</c:choose>
									</div>
								</li>
								<li class="settings">
									<div class="msg">
										年龄：${ user.kUage }
									</div>
								</li>
								
							</ul>
						</div>
						<!--details-->
					</li>
					<li>
						<div class="label">
							<span class="moveicon"></span> <span class="arrowdrop"></span>
							联系信息
						</div>
						<!--label-->
						<div class="details">
							<ul class="recent_list">
								<li class="user new">
									<div class="msg">
										QQ： ${contact.kConqqnumber }
									</div>
								</li>
								<li class="call new">
									<div class="msg">
										微信：${ contact.kConwecharid }
									</div>
								</li>
								<li class="calendar new">
									<div class="msg">
										手机号：${ contact.kConcellphonenumber }
									</div>
								</li>
								<li class="settings">
									<div class="msg">
										邮箱：${ contact.kConemail }
									</div>
								</li>
							</ul>
						</div>
						<!--details-->
					</li>
				</ul>

				<br clear="all" />
				<br />

			</div>
			<!--contentwrapper-->

		</div>
		<!-- centercontent -->


	</div>
	<!--bodywrapper-->

</body>
</html>
