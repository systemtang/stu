<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="teacher_top.jspf" %>
<!-- 教师页面 & 空白页 -->
<nav class="breadcrumb"><i class="Hui-iconfont"></i> 
		<a href="<%=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/"%>blank" class="maincolor">管理</a> 
		<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a>
</nav>

<div class="Hui-article">
	<div style="background: url(<%=request.getContextPath()%>/resources/images/war3.jpg);background-size:100% 100%;width: 100%;height: 100%"></div>
</div>

<%@include file="teacher_foot.jspf" %>