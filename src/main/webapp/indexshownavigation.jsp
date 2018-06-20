<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="header.jsp"></jsp:include>
<div class="vernav2 iconmenu">
    	<ul>
        	<li><a href="${pageContext.request.contextPath}/activity/showActivity" class="editor">我的活动</a>
            </li>
            <li><a href="${pageContext.request.contextPath}/activity/createActivity" class="widgets">发布活动</a></li>
   
        </ul>
        <a class="togglemenu"></a>
        <br /><br />
    </div><!--leftmenu-->