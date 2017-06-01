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

<link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="//cdn.bootcss.com/jquery/3.1.0/jquery.js"> </script>
<script src="//cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"> </script>
</head>
<body style="background-color:#FFFFFF;">
<div class="navbar navbar-default navbar-fixed-top" style="background:#272727;color:white" >
		<div class="container">
			<div class="row" style="font-size:20px;margin-top:10px;">
				<div class="col-sm-12">
					留言
				</div>
			</div>
		</div>
	</div>
	<div id="articleModifyForm">
		
		<div class="form_content">
			<ul>
				<li class="input">
					<textarea id="content" name="content" style="width:560px;margin-left:20px;resize:none;border-radius:4px;box-shadow:5px 5px 5px #333"></textarea>
				</li>
			</ul>
		</div>
		<div class="form_foot">
			<input type="submit" style="width:60px;height:30px;margin-left:50px;padding:2px 4px;margin-top:10px;margin-bottom:10px;font-weight: bold;" value"发表" onclick="doInsert()">
		</div>
	</div>	
</body>
</html>