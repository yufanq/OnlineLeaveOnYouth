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
<title>Forms | Amanda Admin Template</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.default.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/colorpicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.jgrowl.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.alerts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.validate.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/jquery.tagsinput.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/charCount.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/ui.spinner.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plugins/chosen.jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/general.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/forms.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/custom/elements.js"></script>

<!--[if IE 9]>
    <link rel="stylesheet" media="screen" href="css/style.ie9.css"/>
<![endif]-->
<!--[if IE 8]>
    <link rel="stylesheet" media="screen" href="css/style.ie8.css"/>
<![endif]-->
<!--[if lt IE 9]>
	<script src="${pageContext.request.contextPath}/static/http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
<![endif]-->
</head>

<body class="withvernav">

<div class="bodywrapper">
    
<jsp:include page="indexshownavigation.jsp" />
          
    <div class="centercontent">
            <div id="validation" class="subcontent" >
            	
                    <form id="form1" class="stdform" method="post" action="${pageContext.request.contextPath}/activity/createActivity">
                    	   <p>
                        	<label>群名称</label>
                            <span class="field">
                            <select name="kCroid" id="selection">
                            	<c:forEach items="${groupList }" var="g">
                           		 	<option value="${ g.kCroid }">${ g.kCroname }</option>
                            	</c:forEach>
                            </select>
                            </span>
                        </p>
                    	<p>
                        	<label>活动名称</label>
                            <span class="field"><input type="text" name="kMname" id="firstname" class="longinput" /></span>
                        </p>
                      
                        <p>
                        	<label>活动内容</label>
                            <span class="field"><textarea cols="80" rows="5" name="kMdeatail" class="mediuminput" id="location"></textarea></span> 
                        </p>
                          
                        <p>
                        	<label>活动时间</label>
                    		<span class="field">
                            	<input id="datepicker" type="text" class="width100" name="kMdate" /> 
                            </span> 
					   </p>
                      
                         <br />
                        
                        <p class="stdformbutton">
  							<input type="submit" value="提交" class="submit radius2"/>
                        </p>
                    </form>
				<c:if test="${ msg != null }">
					<span>${ msg }</span>
				</c:if>
            </div><!--subcontent-->
        
        </div><!--contentwrapper-->
        
	</div><!-- centercontent -->
    
    
</div><!--bodywrapper-->

</body>
</html>
