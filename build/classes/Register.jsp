<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="Bean.Applicant" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<title>登录</title>
    <link rel="stylesheet" href="Record.css" />
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
function validate() {
    //获取页面上的数据
        function validate() {
		var session = document.getElementById("session");
		var password = document.getElementById("password");
		if (session.value == "") {
			alert("账号不能为空！");
			email.focus();
			return false;
		}
		if (password.value == "") {
			alert("密码不能为空！");
			password.focus();
			return false;
		}
		return true;
	}

    }
    </script>
</head>
<body>
       <div class="image"><img src="image/headpicture.png" /></div>
       <div class="image1">
           <form action="RegisterServet" method="post" onsubmit="return validate();">
         <p>登录账号</p>
         <input type="hidden" name="requestPath" value="${requestScope.requestPath }">
         <p>账号：   <input type="text" name="session" value="" id="session" placeholder="请输入账号"></p>
         <p>密码：   <input type="password" name="password" value="" id="password" placeholder="请输入密码"></p>    
         <input type="submit" value="登录" onClick="window.location.href='http://localhost:8080/MyJSP/MainFrame.jsp'"/> 
         <input type="button" value="注册" onClick="window.location.href='http://localhost:8080/MyJSP/Record.jsp'"/>   
       </form></div>
</body>
</html>