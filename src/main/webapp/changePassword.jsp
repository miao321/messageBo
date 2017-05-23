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

<link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="//cdn.bootcss.com/jquery/3.1.0/jquery.js"> </script>
<script src="//cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"> </script>
</head>
<body>

	<div class="navbar navbar-default navbar-fixed-top" style="background:#272727;color:white">
		<div class="container">
			<div class="row" style="font-size:20px;margin-top:10px;">
				<div class="col-sm-12">
					修改密码
				</div>
			</div>
		</div>
	</div>
	
	<div class="row" style="margin-top:100px;align:center">
		<div class="col-sm-offset-4 col-sm-4" style="background:#eee;width:500px;border-radius:8px;box-shadow:5px 5px 5px #333">
			<form action="" method="post" class="form-horizontal" role="form" >
				<div class="form-group">
					<div class="col-sm-12" style="margin-top:15px;">
						<input type="password" id="oldPassword" name="oldPassword" class="form-control" placeholder="请输入旧密码">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="password" id="newPassword" name="newPassword" class="form-control" placeholder="请输入新密码">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="password" id="repassword" name="repassword" class="form-control" placeholder="请再次输入密码">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<button type="submit" class="btn btn-primary form-control" style="width:100%" value="确定" onclick="doChangePassword()">确定</button>
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
	

	<!-- <div id="loginPanel" style="width:300px">
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
	</div> -->
</body>
</html>