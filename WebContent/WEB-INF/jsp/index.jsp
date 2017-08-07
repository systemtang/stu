<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="./js.jsp"></jsp:include>

<script src="${basePath }resources/js/index.js"></script>
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-3" ><input type="button" value="button" id ="alert"></div>
			
		<img alt="" src="${basePath }resources/images/war3.jpg" class="img-thumbnail img-responsive center-block">	
		</div>
		<div class="row">
			<div class="col-md-3">${stu.id}</div>
		</div>
		<div class="row">
			<div class="col-md-4">${stu.stuNum}</div>
		</div>
		<div class="row">
			<div class="col-md-5">${stu.name}</div>
		</div>
		<div class="row">
			<div class="col-md-6">${stu.sex}</div>
		</div>
		
	</div>


</body>
</html>