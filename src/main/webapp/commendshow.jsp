<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>发布文章页面</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.default.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.autogrow-textarea.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.colorbox-min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/general.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/newsfeed.js"></script>
</head>

<body class="withvernav">
<div class="bodywrapper">

        <jsp:include page="indexshownavigation.jsp" />
    <div class="centercontent">
    
        <div class="pageheader">
            <h1 class="pagetitle">活动评论区</h1>
            <span class="pagedesc">评论显示</span>
            
            <ul class="hornav">
                <li class="current"><a href="#status">文字评论</a></li>
                <li><a href="#photo">图片评论</a></li>
            </ul>
        </div><!--pageheader-->
        
        <div class="contentwrapper">
        
        	<div class="two_third newsfeed">
        
                <div id="status" class="subcontent">
                
                    <div 	>
                        <form  action="createCommend" method="post">
                            <div class="status_thumb"><img src="${pageContext.request.contextPath}/static/images/thumbs/avatarbig.png" alt="" width="57" /></div>
                            <div class="status_content">
                                <textarea name="kCommcontent"  id="statustext"></textarea>
                            </div>
                            <div class="submit"><input type="submit"  value="上传"/></div>
                        </form>
                    </div><!--statusbox-->
                                    
                    
                    <br clear="all" /><br />
                    
                </div><!-- #updates -->
                
                <div id="photo" class="subcontent" style="display: none;">
                
                    <div class="statusbox">
                        <form id="postphoto" action="ajax/newsfeed/status.php" method="post">
                            <div class="status_thumb"><img src="${pageContext.request.contextPath}/static/images/thumbs/avatarbig.png" alt="" width="57" /></div>
                            <div class="status_content">
                                <textarea name="" cols="" rows="" id="statusphoto"></textarea>
                            </div>
                            
                            <div class="submit">
                            	<div class="photoupload"><input type="file" name="photoupload" /></div>
                            	<button class="stdbtn btn_yellow">上传</button>
                            </div>
                        </form>
                    </div><!--statusbox-->
                </div><!-- #photo -->
                
                <br />
                
                <ul class="updatelist">
                	<c:forEach items="${ commendList }" var="c" >
                		<li> 
                    	<div class="updatethumb"><img src="${pageContext.request.contextPath}/static/images/thumbs/avatar1.png" alt="" /></div>
                        <div class="updatecontent">
                        	<div class="top">
                            	<a href="" class="user">${ c.userInfomation.kUaccount	 }</a> -  <a href="">Report</a> - <span>${ c.kCommrelease }</span>
                            </div><!--top-->
                            <div class="text">
                            	${ c.kCommcontent }
                            </div><!--text-->
                        	</div><!--updatecontent-->
                   		 </li>
                		
                	</c:forEach>
                
                 </ul>

            
            </div><!--two_third newsfeed-->
            
            <br clear="all" />
        
        </div><!--contentwrapper-->
        
	</div><!-- centercontent -->
    
    
</div><!--bodywrapper-->

</body>
</html>
