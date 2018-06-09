<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="header.jsp"></jsp:include>
<div class="vernav2 iconmenu">
    	<ul>
        	<li><a href="#formsub" class="editor">我的活动</a>
            	<span class="arrow"></span>
            	<ul id="formsub">
               		<li><a href="forms.html">活动管理</a></li>
                    <li><a href="wizard.html">收藏</a></li>
                    <li><a href="editor.html">点赞</a></li>
                </ul>
            </li>
            <!--<li><a href="filemanager.html" class="gallery">File Manager</a></li>-->
            <li><a href="elements.html" class="elements">最新活动</a></li>
            <li><a href="widgets.html" class="widgets">发布活动</a></li>
   
        </ul>
        <a class="togglemenu"></a>
        <br /><br />
    </div><!--leftmenu-->