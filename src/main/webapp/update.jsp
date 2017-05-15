<%@ page import="com.xxx.messageBo.bean.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改留言</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"> </script>
<script src="js/script.js" type="text/javascript"> </script>
</head>
<body style="background-color:#FFFFFF">
	<div id="articleModifyForm">
		<div class="form_title">修改帖子</div>
		<%
			Message msg=(Message)request.getAttribute("oneMessage");
		%>
		<div class="form_content">
			<ul>
				<li class="input">
					<textarea id="context" name="context"><%=msg.getContext() %></textarea>
				</li>
			</ul>
		</div>
		<div class="form_foot">
			<input type="submit" value="提交" onclick="doUpdate(<%=msg.getMessageId()%>)">
		</div>
	</div>

</body>
</html>