<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<title>武器库</title>
    <link rel="stylesheet" href="Store1.css" />
</head>
<body>
       <form action="Store1Servet2" method="post">
       <div class="title"><h2>56式冲锋枪</h2></div>
       <div class="image"><img src="image/56chong.jpg" width="250px"/></div>
       <div class="image1">
         <input type="submit" value="添加" /> 
         <input type="reset" value="取消" onClick="window.location.href='http://localhost:8080/MyJSP/MainFrame.jsp'"/>   
       </div>
       <div class="local">该武器数量:  ${number} </div>
       </form>
</body>
</html>