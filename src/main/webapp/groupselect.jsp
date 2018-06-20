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
	
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/page/jquery-1.9.1.min.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/page/groupselect.js"></script>
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
	
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.bxSlider.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.slimscroll.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/widgets.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/forms.js"></script>
</head>

<body class="withvernav">
	<div class="bodywrapper">

		<jsp:include page="groupmanagernavigation.jsp" />
	 <div class="centercontent">
    
        <div class="pageheader notab">
            <h1 class="pagetitle">群组推荐</h1>
            <span class="pagedesc">推荐</span>
            
        </div><!--pageheader-->
        
        <div id="contentwrapper" class="contentwrapper widgetpage">
        
                    
                    	<div class="widgetbox">
                        	<div class="title"><h3>未加入群组</h3></div>
                            <div class="widgetcontent">
                            	<ul id="slidercontent">
                                  <c:forEach items="${crowdList }" var="c">
                                  <li>
                                  	<div class="slide_wrap">
                                  	<div class="slide_img"><img src="${pageContext.request.contextPath}/static/images/thumbs/image1.png" alt="" /></div>
                                    <div class="slide_content">
                                    	<h4><span>${c.kCroid }</span><a href="">${c.kCroname }</a></h4>
                                        <small>创建时间 <a href=""><strong></strong></a> ${c.kCrocreatetime }</small>
                                        <p><button class="stdbtn btn_lime" onclick="createMe(this)">申请</button> </p>
                                    </div>
                                    </div>
                                  </li>
                                 </c:forEach>
                                </ul>
                            </div><!--widgetcontent-->
                        </div><!--widgetbox-->
        </div><!--contentwrapper-->
        
	</div><!-- centercontent -->
	</div>
	<!--bodywrapper-->

</body>
</html>
