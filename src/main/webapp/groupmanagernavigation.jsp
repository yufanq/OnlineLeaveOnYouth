<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="header.jsp"></jsp:include>
<div class="vernav2 iconmenu">
    	<ul>
        	<li><a href="${pageContext.request.contextPath}/group" class="editor">我的群组</a></li>
            <!--<li><a href="filemanager.html" class="gallery">File Manager</a></li>-->
            <li><a href="${pageContext.request.contextPath}/group/showGroup" class="widgets">群组查找</a></li>
   
        </ul>
        <a class="togglemenu"></a>
        <br /><br />
    </div><!--leftmenu-->