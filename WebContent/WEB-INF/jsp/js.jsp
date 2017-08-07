<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
        + request.getServerName() + ":" + request.getServerPort()
        + path + "/";

%>

<link rel="stylesheet"
	href="${basePath}resources/css/bootstrap.min.css" />
<script src="${basePath}resources/js/jquery-1.12.4.min.js"></script>
<script src="${basePath}resources/js/jquery-1.12.4.js"></script>
<script src="${basePath}resources/js/bootstrap.min.js"></script>
