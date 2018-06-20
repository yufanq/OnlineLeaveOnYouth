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
<title>查看消息页面</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.default.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.alerts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/general.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/messages.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/elements.js"></script>
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
<jsp:include page="messagemanagernavigation.jsp" />
    <div class="centercontent">
        <div class="pageheader">
            <h1 class="pagetitle">消息管理</h1>
            <span class="pagedesc">活动通知</span>
            
    
        </div><!--pageheader-->
        
        <div id="contentwrapper" class="contentwrapper">
             
             <div id="inbox" class="subcontent">
                <c:choose>
                	<c:when test="${activityNotoyMessageList.size() == 0 }">
                	暂无通知
                	</c:when>
                	<c:when test="${activityNotoyMessageList.size() != 0 }">
                 <table cellpadding="0" cellspacing="0" border="0" class="stdtable mailinbox">
                    <colgroup>
                        <col class="con0" width="63%"/>
                        <col class="con1" width="10%"/>
                        <col class="con1" width="4%"/>
                    </colgroup>
                    <thead>
                    <tr>
                         <th class="head0">活动内容</th>
                        <th class="head0">申请时间</th>
                        <th class="head0">操作</th>
                    </tr>
                    </thead>
                    <tfoot>
                        <tr>
                        <th class="head0">活动内容</th>
                        <th class="head0">申请时间</th>
                        <th class="head0">操作</th>
                        </tr>
                    </tfoot>
                    <tbody>
                      <c:forEach items="${ activityNotoyMessageList }" var="j">
                        <tr>
                            <td><a href="" class="title">${j.kMdeatail }</a></td>
                            <td class="date">${ j.kMdate }</td>
                             <td class="star"><a href="${pageContext.request.contextPath}/message/${ j.kMid }/deleteActivityMessage">删除</a></td>
                        </tr>
   					</c:forEach>
                    </tbody>
                </table> 
                  	</c:when>
                </c:choose>            
             </div>
             <div id="compose" class="subcontent" style="display: none">
             
             </div>
        </div><!--contentwrapper-->
    
    </div><!--centercontent-->
    
    
</div><!--bodywrapper-->

</body>
</html>
