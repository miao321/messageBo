/**
 * 
 */
//---------------index-------------------------
function doDelete(messageId){
//	function doDeleteDate(messageId){
//		$.ajax({
//			type:"post",
//			url:"DeleteServlet",
//			dataType:'text',
//			data:{
//				'messageId':messageId
//			},
//			success:function(data,textStatus){
//				if(data.replace(/^\s*|\s*$/g,'')=='success'){
//					location.href='SelectServlet';
//					alert(123);
//				}else{
//					alert('删除失败');
//				}
//			},
//			error:function(){
//				alert('请求数据失败！');
//			}
//		});
//	}
	location.href='DeleteServlet?messageId='+messageId;
}

function jump(messageId){
	location.href='OneMsgServlet?messageId='+messageId;
}
function domove(){
	location.href="insert.jsp";
}

//-------------------------adminLogin-----------------
function doAdminLogin(){
	var loginName=$('#loginName').val();
	var password=$('#password').val();
	if(loginName==''||password==''){
		alert('用户名和密码不能为空！');
		return false;
	}
	
	$.ajax({
		type:"post",
		url:"adminLoginServlet",
		dataType:'text',
		data:{
			'loginName':loginName,
			'password':password
		},
		success:function(data,textStatus){
			if(data.replace(/^\s*|\s*$/g,'')=='success'){
				location.href='SelectServlet';
			}else{
				alert('密码错误！');
			}
		},
		error:function(){
			alert('请求数据失败！');
		}
	});
}

//-------------------userLogin-------------------
function doUserLogin(){
	var loginName=$('#loginName').val();
	var password=$('#password').val();
	if(loginName==''||password==''){
		alert('用户名或密码不能为空！');
		return false;
	}
	
	$.ajax({
		type:"post",
		url:"UserLoginServlet",
		dataType:'text',
		data:{
			'loginName':loginName,
			'password':password
		},
		success:function(data,textStatus){
			if(data.replace(/^\s*|\s*$/g,'')=='success'){
				location.href='SelectServlet';
			}else{
				alert('密码错误！');
			}
		},
		error:function(){
			alert('请求数据失败！');
		}
	});
}

//----------------------userRegister--------------
function doUserRegister(){
	var userName=$('#userName').val();
	var password=$('#password').val();
	var confirmPassword=$('#confirmPassword').val();
	
	if(password!=confirmPassword){
		alert('两次输入密码不一致');
		return false;
	}
	$.ajax({
		type:"post",
		url:"RegisterServlet",
		dateType:"text",
		data:{
			'userName':userName,
			'password':password
		},
		success:function(data,textStatus){
			if(data.replace(/^\s*|\s*$/g,'')=='success'){
				location.href='login.jsp';
			}else{
				alert('注册失败');
			}
		},
		error:function(){
			alert('请求数据失败！');
		}
	});
}

//----------------------changePassword----------------

function doChangePassword(){
	var oldPassword=$('#oldPassword').val();
	var newPassword=$('#newPassword').val();
	var repassword=$('#repassword').val();
	
	if(oldPassword==''||newPassword==''||repassword==''){
		alert('密码不能为空！');
		return false;
	}
	if(newPassword!=repassword){
		alert('两次密码不一样！');
		return false;
	}
	
	$.ajax({
		type:"post",
		url:"ChangePasswordServlet",
		dataType:'text',
		data:{
			'oldPassword':oldPassword,
			'newPassword':newPassword
		},
		success:function(data,textStatus){
			if(data.replace(/^\s*|\s*$/g,'')=='success'){
				alert('修改密码成功！');
				location.href='SelectServlet';
			}else{
				alert('旧密码错误！');
			}
		},
		error:function(){
			alert('请求数据失败！');
		}
	});
}

//------------------------insert-------------------

function doInsert(){
	var content=$('#content').val();	
	if(content==''){
		alert('输入内容不能为空！');
		return false;
	}
	
	$.ajax({
		type:"post",
		url:"InsertServlet",
		dataType:'text',
		data:{
			'content':content
		},
		success:function(data,textStatus){
			if(data.replace(/^\s*|\s*$/g,'')=='success'){
				location.href='SelectServlet';
			}else{
				alert('您被禁止发言！');
			}
		},
		error:function(){
			alert('请求数据失败！');
		}
	});
}

//---------------update--------------------

function doUpdate(messageId){
	var context=$('#context').val();
	if(context==''){
		alert('对不起，输入不能为空');
		return;
		
	}
	
	$.ajax({
		type:"post",
		url:"UpdateServlet",
		dataType:'text',
		data:{
			'messageId':messageId,
			'context':context
		},
		success:function(data,textStatus){
			if(data.replace(/^\s*|\s*$/g,'')=='success'){
				location.href='SelectServlet';
			}else{
				alert('修改失败！');
			}
		},
		error:function(){
			alert('请求数据失败！');
		}
	});
}

//---------------------addUser--------------------

function doAddUser(){
	var loginName=$('#loginName').val();
	var password1=$('#password1').val();
	var password2=$('#password2').val();
	
	if(loginName==''||password1==''||password2==''){
		alert('输入信息不完整！');
		return;
	}
	if(password1!=password2){
		alert('密码不一致');
		return;
	}
	
	$.ajax({
		type:"post",
		url:"AddUserServlet",
		dataType:'text',
		data:{
			'loginName':loginName,
			'password':password1
		},
		success:function(data,textStatus){
			if(data.replace(/^\s*|\s*$/g,'')=='success'){
				location.href='SelectUserServlet';
			}else{
				alert('添加失败！');
			}
		},
		error:function(){
			alert('请求数据失败！');
		}
	});
}

