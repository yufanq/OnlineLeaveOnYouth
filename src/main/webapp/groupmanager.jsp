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
<title>发布文章页面</title>
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
	src="${pageContext.request.contextPath}/static/js/plugins/jquery.autogrow-textarea.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/plugins/jquery.colorbox-min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/custom/general.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/custom/newsfeed.js"></script>
	
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/forms.js"></script>
</head>

<body class="withvernav">
	<div class="bodywrapper">

		<jsp:include page="groupmanagernavigation.jsp" />
		<div class="centercontent">

			<div class="pageheader">
				<h1 class="pagetitle">群组信息</h1>
				<span class="pagedesc">This is a sample description of a page</span>

				<ul class="hornav">
					<li class="current"><a href="#create">创建的群组</a></li>
					<li><a href="#join">参加的群组</a></li>
					<li><a href="#add">创建群组</a></li>

				</ul>
			</div>
			<!--pageheader-->

			<div class="contentwrapper">

				<div class="two_third newsfeed">
					<!-- #群组创建  -->
					<div id="create" class="subcontent">
						<div class="widgetbox">
							<div class="title">
								<h3>Recent Activity</h3>
							</div>
							<div class="widgetcontent">
								<ul class="recent_list">
									<c:forEach items="${ createdGroup }" var="c">
										<li class="user new">
											<div class="msg">
												<a href="${pageContext.request.contextPath}/group/${ c.kCroid}/showGroupMemberAndActivity">${ c.kCroname }</a>
											</div>
										</li>
									</c:forEach>

								</ul>
								<div class="msgmore">
									<a href="">View All Activities</a>
								</div>
							</div>
							<!--widgetcontent-->
						</div>
						<!--widgetbox-->
						<br clear="all" /> <br />

					</div>
					<!-- #updates -->

					<div id="manager" class="subcontent" style="display: none;">
						<div class="widgetbox">
							<div class="title">
								<h3>Recent Activity</h3>
							</div>
							<div class="widgetcontent">
								<ul class="recent_list">
									<c:forEach items="${ managerGroup }" var="m">
										<li class="user new">
											<div class="msg">
												<a href="${pageContext.request.contextPath}/group/${ m.kCroid}/showGroupMemberAndActivity">${ m.kCroname }</a>
											</div>
										</li>
									</c:forEach>
								</ul>
								<div class="msgmore">
									<a href="">View All Activities</a>
								</div>
							</div>
							<!--widgetcontent-->
						</div>
						<!--widgetbox-->
					</div>
					<div id="join" class="subcontent" style="display: none;">
						<div class="widgetbox">
							<div class="title">
								<h3>Recent Activity</h3>
							</div>
							<div class="widgetcontent">
								<ul class="recent_list">
									<c:forEach items="${ joinGroup }" var="j">
										<li class="user new">
											<div class="msg">
												<a href="${pageContext.request.contextPath}/group/${ j.kCroid}/showGroupMemberAndActivity">${ j.kCroname }</a>
											</div>
										</li>
									</c:forEach>
								</ul>
								<div class="msgmore">
									<a href="">View All Activities</a>
								</div>
							</div>
							<!--widgetcontent-->
						</div>
						<!--widgetbox-->
					</div>
					<!-- #photo -->
					<div id="add" class="subcontent" style="display: none;">
						<div class="widgetbox">
							<div class="title">
								<h3>群组添加</h3>
							</div>
							<div class="widgetcontent">
								<form class="stdform" action="${pageContext.request.contextPath}/group/createGroup" method="post">
									<p>
										<label>群组名称</label> <span class="field"><input
											type="text" name="kCroname" id="firstname2"
											class="longinput" /></span>
									</p>
									    <p>
                        	<label>Select</label>
                            <span class="field">
                            <select name="kCrojurisdiction" class="uniformselect">
                            	<option value="0">自由加入</option>
                                <option value="1">需要审核</option>
                            </select>
                            
                            </span>
                        </p>
									<p class="stdformbutton">
										<button class="submit radius2">添加</button>
									</p>
								</form>
							</div>
							<!--widgetcontent-->
						</div>
						<!--widgetbox-->
					</div>
				</div>
				<!--two_third newsfeed-->

				<br clear="all" />

			</div>
			<!--contentwrapper-->

		</div>
		<!-- centercontent -->


	</div>
	<!--bodywrapper-->

</body>
</html>
