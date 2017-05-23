<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewpost" content="width=device-width,initical-scale=1.0">
<title>添加用户</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"> </script>
<script src="js/script.js" type="text/javascript"> </script>

<link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="//cdn.bootcss.com/jquery/3.1.0/jquery.js"> </script>
<script src="//cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"> </script>
</head>
<body>

	<div class="navbar navbar-default navbar-fixed-top" style="background:#272727;color:white">
		<div class="container">
			<div class="row" style="font-size:20px;margin-top:10px;">
				<div class="col-sm-12">
					添加用户
				</div>
			</div>
		</div>
	</div>
	
	<div class="row" style="margin-top:100px;align:center">
		<div class="col-sm-offset-4 col-sm-4" style="background:#eee;width:500px;border-radius:8px;box-shadow:5px 5px 5px #333">
			<form action="" method="post" class="form-horizontal" role="form" >
				<div class="form-group">
					<div class="col-sm-12" style="margin-top:15px;">
						<input type="text" id="loginName" name="loginuserName" class="form-control" placeholder="请输入用户名">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="password" id="password1" name="password" class="form-control" placeholder="请输入密码">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="password" id="password2" name="password2" class="form-control" placeholder="请再次输入密码">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<button type="submit" class="btn btn-primary" class="form-control" style="width:100%" value="保存" onclick="doAddUser();">保存</button>
					</div>
				</div>
				
				
				<!-- 注册 -->
				
				<%-- <!-- 判断是否有错误信息，有的话显示出来 -->
				<%
					if(result!=null){
				%>
				<div align="left" style="color:red">
					<%=result.getReason() %>
				</div>
				<%
					}
				%> --%>
			</form>
		</div>
	</div>
	

	<!-- <div id="loginPanel" style="width:270px">
		<div class="form_title">添加用户</div>
		<div class=form_content>
			<ul>
				<li class="label" style="margin-left:18px">用户名:</li>
				<li class="input" style="margin-left:0px">
					<input id="loginName" type="text" name="loginName">
				</li>
			</ul>
			<ul>
				<li class="label" style="margin-left:20px">密码:</li>
				<li class="input">
					<input id="password1" type="password" name="password1">
				</li>
				
			</ul>
			<ul>
				<li class="label" style="width:60px">确认密码:</li>
				<li class="input">
					<input id="password2" type="password" name="password2">
				</li>
			</ul>
		</div>
		<div class="form_foot">
			<input type="submit" value="保存" onclick="doAddUser();">
		</div>
	</div> -->
</body>
</html>