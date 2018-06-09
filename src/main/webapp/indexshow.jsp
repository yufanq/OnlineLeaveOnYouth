<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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
            <h1 class="pagetitle">News Feed</h1>
            <span class="pagedesc">This is a sample description of a page</span>
            
            <ul class="hornav">
                <li class="current"><a href="#status">Status</a></li>
                <li><a href="#photo">Photo/Video</a></li>
            </ul>
        </div><!--pageheader-->
        
        <div class="contentwrapper">
        
        	<div class="two_third newsfeed">
        
                <div id="status" class="subcontent">
                
                    <div class="statusbox">
                        <form id="poststatus" action="ajax/newsfeed/status.php" method="post">
                            <div class="status_thumb"><img src="${pageContext.request.contextPath}/static/../../images/thumbs/avatarbig.png" alt="" width="57" /></div>
                            <div class="status_content">
                                <textarea name="" cols="" rows="" id="statustext"></textarea>
                            </div>
                            <div class="submit"><button class="stdbtn btn_yellow">Post</button></div>
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
                            	<button class="stdbtn btn_yellow">Post</button>
                            </div>
                        </form>
                    </div><!--statusbox-->
                </div><!-- #photo -->
                
                <br />
                
                <ul class="updatelist">
                	<li>
                    	<div class="updatethumb"><img src="${pageContext.request.contextPath}/static/images/thumbs/avatar1.png" alt="" /></div>
                        <div class="updatecontent">
                        	<div class="top">
                            	<a href="" class="user">Agnes</a> - <a href="">0 Comment</a> - 
                                <a href="">Share</a> - <a href="">Report</a> - <span>7 minutes ago</span>
                            </div><!--top-->
                            <div class="text">
                            	Unicorns, I love them. Unicorns, I love them. Uni uni unicorns, I love them. Uni unicorns, I could pet one if they were really real. And they are! So I bought one so I could pet it. Now it loves me, now I love it. La lala la la... 
                            </div><!--text-->
                        </div><!--updatecontent-->
                    </li>
                    
                    <li>
                    	<div class="updatethumb"><img src="${pageContext.request.contextPath}/static/images/thumbs/avatar2.png" alt="" /></div>
                        <div class="updatecontent">
                        	<div class="top">
                            	<a href="" class="user">Vector</a> - <a href="">2 Comments</a> - <a href="">Share</a> - <a href="">Report</a> - <span>1 hour ago</span>
                            </div><!--top-->
                            <div class="text">Some stuff... </div><!--text-->
                            <div class="photo">
                            	<a href="http://demo.themepixels.com/webpage/amanda/ajax/newsfeed/photo.html"><img src="${pageContext.request.contextPath}/static/images/preview/preview1.png" alt="" /></a>
                            </div><!--text-->
                        </div><!--updatecontent-->
                    </li>
                    
                    <li>
                    	<div class="updatethumb"><img src="${pageContext.request.contextPath}/static/images/thumbs/avatar3.png" alt="" /></div>
                        <div class="updatecontent">
                        	<div class="top">
                            	<a href="" class="user">Fat Boy</a> - <a href="">1 Comment</a> - <a href="">Share</a> - <a href="">Report</a> - <span>1 hour ago</span>
                            </div><!--top-->
                            <div class="text">These are Cheeto. </div><!--text-->
                            <div class="photo">
                            	<a href="http://demo.themepixels.com/webpage/amanda/ajax/newsfeed/photo2.html"><img src="${pageContext.request.contextPath}/static/images/preview/preview2.png" alt="" /></a>
                            </div><!--text-->
                        </div><!--updatecontent-->
                    </li>
                    
                	<li>
                    	<div class="updatethumb"><img src="${pageContext.request.contextPath}/static/images/thumbs/avatar4.png" alt="" /></div>
                        <div class="updatecontent">
                        	<div class="top">
                            	<a href="" class="user">Agnes</a> - <a href="">0 Comment</a> - 
                                <a href="">Share</a> - <a href="">Report</a> - <span>7 minutes ago</span>
                            </div><!--top-->
                            <div class="text">
                            	No one just *gets* as good as you do. *Especially* you. Start talking! Are you training with someone? 
                            </div><!--text-->
                        </div><!--updatecontent-->
                    </li>
                </ul>

            
            </div><!--two_third newsfeed-->
            
            <br clear="all" />
        
        </div><!--contentwrapper-->
        
	</div><!-- centercontent -->
    
    
</div><!--bodywrapper-->

</body>
</html>
