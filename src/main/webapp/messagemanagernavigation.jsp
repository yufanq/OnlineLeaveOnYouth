<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="header.jsp"></jsp:include>
<div class="vernav2 iconmenu">
    	<ul>
        	<li><a href="${pageContext.request.contextPath}/message/" class="editor">活动消息</a></li>
            <!--<li><a href="filemanager.html" class="gallery">File Manager</a></li>-->
            <li><a href="${pageContext.request.contextPath}/message/showGroupJoinMessage" class="elements">群组申请消息</a></li>
   
        </ul>
        <a class="togglemenu"></a>
        <br /><br />
    </div><!--leftmenu-->