<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<title>注册</title>
    <link rel="stylesheet" href="Record.css" />
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
     <script type="text/javascript">
        function validate() {
		var names = $('#names').val();
		var session = $('#session').val();
		var password = $('#password').val();
		$.ajax({  
            type: "POST",  
            url: "/MyJSP/RecordServet",  
            contentType: 'application/x-www-form-urlencoded;charset=utf-8',  
            data:{"names":names, "session":session,"password":password},  
            success: function(data){ 
            	window.location.href = 'http://localhost:8080/MyJSP/Register.jsp';
                     }, 
        });  
	}
    </script>
</head>
<body>
       <div class="image"><img src="image/headpicture.png" /></div>
       <div class="image1">
         <p>注册账号</p>
         <p>姓名：   <input type="text" name="names" value="" id="names" placeholder="请输入姓名"></p>
         <p>账号：   <input type="text" name="session" value="" id="session" placeholder="请输入账号"></p>
         <p>密码：   <input type="password" name="password" value="" id="password" placeholder="请输入密码"></p>    
         <input type="button" value="确认" onclick="return validate()"/> 
         <input type="button" value="取消" onclick="window.location.href='http://localhost:8080/MyJSP/Register.jsp'"/>   
       </div>
</body>
</html>