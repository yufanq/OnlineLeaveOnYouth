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
<title>客户支持页面</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.default.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/general.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/support.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/widgets.js"></script>
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
   
		<jsp:include page="groupmanagernavigation.jsp" />
    <div class="centercontent">
    
        <div class="pageheader notab">
            <h1 class="pagetitle">群信息</h1>
            <span class="pagedesc">群成员信息显示</span>
            
        </div><!--pageheader-->
               
               <div id="contentwrapper" class="contentwrapper withrightpanel">
                  <div class="widgetbox">
                            <div class="title"><h3>活动</h3></div>
                            <div class="widgetcontent">
                                <div id="accordion" class="accordion">
                                  	<c:forEach items="${ activityList }" var="a">
                                  	<h3><a href="#">${ a.kMname }</a></h3>
                                    <div>
                                        <p>
                                      	<a href="${pageContext.request.contextPath}/commend/${a.kMid}/showActivityCommend">${ a.kMdeatail }</a>
                                        </p>
                                        <ul>
                                        	<li>${a.kMdate }</li>
                                        </ul>
                                    </div>
                                   </c:forEach>
                                    
                                </div>     
                              </div> <!--widgetcontent-->
                         </div><!--widgetbox-->   
        </div>
        
        <div class="rightpanel">
        	<div class="rightpanelinner">
                <div class="widgetbox uncollapsible">
                	<div class="title"><h4>群成员</h4></div>
                    <div class="widgetcontent nopadding">
                    	<div class="chatsearch">
                        	<input type="text" name="" value="Search" />
                        </div>
                    	<ul class="contactlist">
                        	<c:forEach items="${ memberList }" var="m">
                        	<li class="online new"><a href=""><img src="${pageContext.request.contextPath}/static/images/thumbs/avatar5.png" alt="" /> <span>${ m.userInfomation.kUname }</span></a></li>
                            </c:forEach>
                        	
                        </ul>
                    </div><!--widgetcontent-->
                </div><!--widgetbox-->
            </div><!--rightpanelinner-->
        </div><!--rightpanel-->
        
	</div><!-- centercontent -->
    
    
</div><!--bodywrapper-->

</body>
</html>

