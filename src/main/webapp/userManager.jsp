<%@ page import="com.xxx.messageBo.bean.*" %>
<%@ page import="java.util.List" %>
<%@ page import="com.xxx.messageBo.dao.*" %>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理中心</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"> </script>
<script src="js/script.js" type="text/javascript"> </script>
</head>
<body>
	<a name="top">
		<div id="page">
			<div id="logo" style="text-align:center; padding-top:15px">
				<%--<img src="images/logo.jpg"> --%>
			</div>
			<div id="head">
				<div id="nav">
					<ul>
						<li><a href="SelectServlet">主页</a></li>
						<li><a href="changePassword.jsp">修改密码</a></li>
						<li><a href="ExitServlet">注销</a></li>
					</ul>
				</div>
				<div id="title">
					<form action="SelectUserServlet" method="post">
						<div class="col"><input type="submit" value="索搜"></div>
						<div class="col"><input type="text" id="user" size="20"></div>
					</form>
				</div>
			</div>
			
			<div><img src="images/add.png"></div>
			<div id="func"><p><a href="addUser.jsp">添加用户</a></p></div>
			<table id="table" bordercolor="#99CCFF" border='1px' cellspacing='0px'>
				<tr bgcolor="#e4eef9" height="36px">
					<th>userId</th>
					<th>用户名</th>
					<th>禁止发帖</th>
					<th>授权发帖</th>
					<th>删除</th>
				</tr>
				<%
				List<User> users=(List<User>)request.getAttribute("userList");
				if(users!=null){
					for(User user:users){
				%>
				<%-- <c:forEach var="user" items="${userList }"> --%>
					<tr height="36px">
						<th>${user.userId }</th> 
						<th>${user.username }</th>
						<th><a href="TagServlet?userId=${user.userId }&role=1">禁止发帖</a></th>
						<th><a href="TagServlet?userId=${user.userId }&role=0">授权发帖</a></th>
						<th><a href="DelUserServlet?userId=${user.userId }">删除</a></th>
					</tr>
				<%-- </c:forEach> --%>
				<%
					}
				}
				%>
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