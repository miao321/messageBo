<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"> </script>
<script src="js/script.js" type="text/javascript"> </script>
</head>
<body>
	<div id="loginPanel">
		<div class="form_title">管理员登录</div>
		<div class="form_content">
			<ul>
				<li class="label">姓名:</li>
				<li class="input">
					<input type="text" id="loginName" name="loginName">
				</li>
			</ul>
			<ul>
				<li class="label">密码:</li>
				<li class="input">
					<input type="password" id="password" name="password">
				</li>
			</ul>
		</div>
		<div class="form_foot">
			<input type="submit" value="登录" onclick="doAdminLogin()">
		</div>
	</div>
</body>
</html>