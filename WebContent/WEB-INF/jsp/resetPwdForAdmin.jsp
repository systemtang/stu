<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="top.jspf" %>
<!-- 管理员页面 & 重置密码 -->
<nav class="breadcrumb"><i class="Hui-iconfont"></i> 
		<a href="<%=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/"%>blank" class="maincolor">管理</a> 
		<span class="c-999 en">&gt;</span>
		<span class="c-666">学生管理</span> 
		<span class="c-999 en">&gt;</span>
		<span class="c-666">添加学生信息</span> 
		<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a>
</nav>

<div class="Hui-article">


</div>	
	
	
<%@include file="foot.jspf" %>