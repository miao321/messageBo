<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"> </script>
<script src="js/script.js" type="text/javascript"> </script>
</head>
<body>
	<div id="loginPanel">
		<div class="form_title">用户注册</div>
		<div class="form_content">
			<ul>
				<li class="label" style="width:60px;margin-left:-8px;">姓名:</li>
				<li class="input">
					<input type="text" id="userName" name="userName">
				</li>
			</ul>
			<ul>
				<li class="label" style="width:60px;margin-left:-8px;">密码:</li>
				<li class="input">
					<input type="password" id="password" name="password">
				</li>
			</ul>
			<ul>
				<li class="label" style="width:60px;margin-left:-8px;">确认密码:</li>
				<li class="input">
					<input type="password" id="confirmPassword" name="confirmPassword">
				</li>
			</ul>
		</div>
		<div class="form_foot">
			<input type="submit" value="注册" onclick="doUserRegister()">
		</div>
	</div>
</body>
</html>