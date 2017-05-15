<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发帖</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"> </script>
<script src="js/script.js" type="text/javascript"> </script>
</head>
<body style="background-color:#FFFFFF;">
	<div id="articleModifyForm">
		<div class="form_title">发帖</div>
		<div class="form_content">
			<ul>
				<li class="input">
					<textarea id="content" name="content"></textarea>
				</li>
			</ul>
		</div>
		<div class="form_foot">
			<input type="submit" value"发表" onclick="doInsert()">
		</div>
	</div>	
</body>
</html>