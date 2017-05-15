<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"> </script>
<script src="js/script.js" type="text/javascript"> </script>
</head>
<body>
	<div id="loginPanel" style="width:300px">
		<div class="form_title">修改密码</div>
		<div class=form_content>
			<ul>
				<li class="label" style="width:65px">旧密码:</li>
				<li><input type="password" id="oldPassword" name="oldPassword"></li>
			</ul>
			<ul>
				<li class="label" style="width:65px">新密码:</li>
				<li><input type="password" id="newPassword" name="newPassword"></li>
			</ul>
			<ul>
				
				<li class="label" style="width:65px">确认密码:</li>
				<li><input type="password" id="repassword" name="repassword">
			</ul>
		</div>
		<div class="form_foot">
			<input type="submit" value="确定" onclick="doChangePassword()">
		</div>
	</div>
</body>
</html>