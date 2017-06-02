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
<link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="//cdn.bootcss.com/jquery/3.1.0/jquery.js"> </script>
<script src="//cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"> </script>
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
	<div class="navbar navbar-default navbar-fixed-top" style="background:#272727;color:white" >
		<div class="container">
			<div class="row" style="font-size:20px;margin-top:10px;">
				<div class="col-sm-12">
					留言
					<h3 style="float:right;margin-right:500px;margin-top:0px;">悄悄的来，留下些东西吧~</h3>
				</div>
			</div>
		</div>
	</div>
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
						
						<li><a href="SelectFriendServlet">我的好友</a></li>
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
					<div class="col search">
						<input type="submit" style="width:50px;height: 30px;border-radius:8px;font-size: 14px;font-weight: bold;" value="搜索">
					</div>
					<div class="col"><input type="text" name="author"  placeholder="请输入用户名" style="width:200px;height: 30px;border-radius:8px;padding:2px 4px;"></div>
				</form>
			</div>
			<%--end of id="title" --%>
			
			<%
				if(user!=null){
			%>
			<div id="col1">
				<img src="images/add.jpg" onclick="domove()">
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
						}
					/*  */
							if(!author.equals(msg.getAuthor())){
								/* List<Relation> relations=(List<Relation>)request.getAttribute("relationList");
								if(relations!=null){
									for(Relation rel:relations){ */
					
							
					%>
					
					<li class="func"><a href="AddFriendServlet?author=<%=msg.getAuthor()%>"><span class="glyphicon glyphicon-plus" ></span></a></li>
					<li class="func"><a href="review.jsp"><span class="glyphicon glyphicon-envelope"></span></a></li>
					<%
							}
					 /* 	}	
					}   */
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