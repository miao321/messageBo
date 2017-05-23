<%@ page import="com.xxx.messageBo.bean.*" %>
<%@ page import="java.util.List" %>
<%@ page import="com.xxx.messageBo.dao.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
<link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet" type="text/css">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"> </script>
<script src="js/script.js" type="text/javascript"> </script>
</head>

	<%
		int role=-1;
		String author="";
		User user=(User)session.getAttribute("user");
		if(user!=null){
			role=user.getRole();
			author=user.getUsername();
		}
	%>

<body>
	<a name="top">      <%--设置锚点 --%>
		<div id="page">
			<div id="logo" style="text-align:center;padding-top:15px">
				<%--<img src="images/logo.jsp"> --%>
			</div>
			
			<div id="head">
				<div id="nav">
					<ul>
						<li><a href="SelectServlet">主页</a></li>
						<%
							if(user==null){
						%>
						<li><a href="login.jsp">用户登录</a></li>
						<li><a href="adminLogin.jsp">管理员登陆</a></li>
						<li><a href="register.jsp">注册</a></li>
						<%
							}
							if(role==1){
						%>
						<li><a href="SelectUserServlet">用户管理</a></li>
						<%
							}
							if(user!=null){
						%>
						<li><a href="changePassword.jsp">修改密码</a></li>
						<li><a href="#">我的好友</a></li>
						<li><a href="ExitServlet">注销</a></li>
						<li style="float: right;margin-right:-290px;color:white;padding:0 20px;font-size: 14px;font-weight: bold;">欢迎您:<%=user.getUsername() %></li>
						<%
							}
						%>
					</ul>
				</div>
			</div>
			<%--end of <div id="head"> --%>
			
			<div id="title">
				<form action="SelectServlet" method="post">
					<div class="col search"><input type="submit" value="搜索"></div>
					<div class="col"><input type="text" name="author" size="20"></div>
				</form>
			</div>
			<%--end of id="title" --%>
			
			<%
				if(user!=null){
			%>
			<div id="col1">
				<img src="images/add.png" onclick="domove()">
			</div>
			<%
				}
				List<Message> messages=(List<Message>)request.getAttribute("messageList");
				if(messages!=null){
					for(Message msg:messages){
				
			%>
			<div class="articleList">
				<ul>
					<%
						if(user!=null){
							if((role==1)||(author.equals(msg.getAuthor())&&role==0)){
						
					%>
					<li class="func"><img src="images/delete.png" alt="删除" onclick="doDelete(<%=msg.getMessageId()%>)"></li>
					<%
							}
							if(author.equals(msg.getAuthor())){
					%>
					<li class="func"><img src="images/edit.png" alt="编辑" onclick="jump(<%=msg.getMessageId()%>)"></li>
					<%
							}
						}if(!author.equals(msg.getAuthor())){
					%>
					<li class="func"><span class="glyphicon glyphicon-plus"></span></li>
					<%
						}
					%>
					<li class="nav">
						<strong>
							<%=msg.getAuthor() %>
						</strong>
						&nbsp;&nbsp;&nbsp;发表于<%=msg.getDate() %>
					</li>
				</ul>
				<div class="text">
					<p><%=msg.getContext() %></p>
				</div>
			</div>
			<%
					}
				}
			%>
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