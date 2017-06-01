<%@ page import="com.xxx.messageBo.bean.*" %>
<%@ page import="java.util.List" %>
<%@ page import="com.xxx.messageBo.dao.*" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/style.css" rel="stylesheet" type="text/css">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"> </script>
<script src="js/script.js" type="text/javascript"> </script>
<title>好友列表</title>
</head>
<body>
	<a name="top">
		<div id="page">
			<div id="logo" style="text-align:center; padding-top:15px">
				<%--<img src="images/logo.jpg"> --%>
			</div>
			<div id="head">
				<div id="nav" >
					<ul>
						<li><a href="SelectServlet">主页</a></li>
						<li><a href="changePassword.jsp">修改密码</a></li>
						<li><a href="ExitServlet">注销</a></li>
					</ul>
				</div>
				<div id="title">
					<form action="SelectUserServlet" method="post">
						<div class="col search">
							<input type="submit" style="width:50px;height: 30px;border-radius:8px;font-size: 14px;font-weight: bold;margin-top:-20px;" value="搜索">
						</div>
						<div class="col"><input type="text" name="author"  placeholder="请输入用户名" style="width:200px;height: 30px;margin-top:-20px;border-radius:8px;padding:0 4px;"></div>
					</form>
				</div>
			</div>
			
			<div><img src="images/add.jpg"></div>
			
			<table id="table" bordercolor="#99CCFF" border='1px' cellspacing='0px'>
				<tr bgcolor="#e4eef9" height="36px">
					<th>relationId</th>
					<th>用户名</th>
				
					<th>删除</th>
				</tr>
				<%-- <%
				List<User> users=(List<User>)request.getAttribute("userList");
				if(users!=null){
					for(User user:users){
				%> --%>
			 <c:forEach var="relation" items="${relationList }"> 
					<tr height="36px">
						<th>${relation.relationId }</th> 
						<th>${relation. }</th>
						<th><a href="DelFriendServlet?relationId=${relation.relationId }">删除</a></th>
					</tr>
				</c:forEach> 
				<%-- <%
					}
				}
				%> --%>
			</table>
			<div>
				<ul class="p2">
					<li class="p2"><a href="#top">返回顶部</a></li>
				</ul>
			</div>
			<div id="p3">
				<p>CopyRight&nbsp;:&copy;&nbsp;miao&nbsp;&nbsp;2017,All Rights Reserved</p>
			</div>
		</div>
	</a>
</body>
</html>