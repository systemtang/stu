<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<title>管理员登录界面</title>
<link rel="stylesheet" type="text/css" href="resources/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="resources/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="resources/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="resources/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="resources/static/h-ui.admin/css/style.css" />
<link rel="stylesheet" type="text/css" href="resources/css/login.css" />

<script type="text/javascript" src="resources/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="resources/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="resources/static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="resources/static/h-ui.admin/js/H-ui.admin.page.js"></script> 

</head>
<body style="background-color: #f8f8f8;text-align:center">
	<div class="rounds" style="display: none;">
		<div class="round-content" style="display: block;"></div>
	</div>
	
	<div class="my_loginPanel">
		<div class="panel panel-default">
			<div class="panel-header">管理员登录</div>
			<div style="height: 180px;" class="panel-body">
				<input type="text" placeholder="输入管理员ID" class="input-text radius size-L">
				<input type="password" placeholder="输入密码" class="input-text radius size-L">
				<input style="width: 60%;float:left" type="text" placeholder="输入验证码" class="input-text">
				<div class="checkCodeImg"></div>
				<input style="width: 100%;margin-top: 20px;" class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
			</div>
		</div>
	</div>
</body>
</html>