<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="Bean.Applicant"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
    System.out.print(path);
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ page import="Dao.ArmyDao" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<title>主界面</title>
<%    
       if(session.getAttribute("applicant") == null) {      
%>    
       <script type="text/javascript">  
          top.location.href="<%=basePath%>/Register.jsp";  
       </script>   
 <%    
      }    
 %>
<base href="<%=basePath%>">
<link rel="stylesheet" href="MainFrame.css" />
<%
	   ArmyDao a=new ArmyDao();
       int count1=a.getSum("56式半自动步枪");
       int count2=a.getSum("56式冲锋枪");
       int count3=a.getSum("plz-45自行火炮");
       int count4=a.getSum("zh-1自行火炮");
       int count5=a.getSum("VT-2主战坦克");
       int count6=a.getSum("VT-4主战坦克");
%>
</head>
	<div class="head">
		<div class="image1">
			<img src="image/headpicture.png" />
		</div>
		 <form action="RegisterServet" method="post">
		<div class="title">
			<c:if test="${empty applicant}">
			<a href="Register.jsp" target="_parent"><span>登录</span></a>
				 </c:if>
			<c:if test="${!empty applicant}">
			${applicant.getApplicantName() }
			<a href="ApplicantLogoutServet">退出</a>
			</c:if>
		</div>
		</form>
	</div>
	<div class="headmiddle1"></div>
	<div class="title1">
		<a href="javascript:void(null)"
				onclick='javascript:window.open("http://localhost:8080/MyJSP/MainFrame.jsp")'>首页</a>
	</div>
	<div class="title2">
		<a href="">关于我们</a>
	</div>
	<div class="title3">
		<a href="">新闻中心</a>
	</div>
	<div class="headmiddle2">
		<img src="image/headpicture1.jpg" width="1300px" />
	</div>
	<div class="middle">
		<div class="local">
			<h2>新闻公告</h2>
			<br>
			<hr />
		</div>
		<div class="info1">
		           <form action="CountServet" method="post">
			<a href="javascript:void(null)"
				onclick='javascript:window.open("http://localhost:8080/MyJSP/Frame1.jsp")'>北方公司正式发布合规体系建设成果</a><br /> 
				</form><a href="javascript:void(null)"
				onclick='javascript:window.open("http://localhost:8080/MyJSP/Frame2.jsp")'>北方公司宣传作品荣获中央企业微电影大奖</a><br />
			<a href="javascript:void(null)"
				onclick='javascript:window.open("http://localhost:8080/MyJSP/Frame3.jsp")'>公司在第三届进博会上取得丰硕成果</a><br /> <a href="javascript:void(null)"
				onclick='javascript:window.open("http://localhost:8080/MyJSP/Frame4.jsp")'>北方工业公司与阿联酋签署石油和矿产进口合作协议</a><br />
		</div>
		<div class="info2">
			<a href="javascript:void(null)"
				onclick='javascript:window.open("http://norinco.norincogroup.com.cn/col/col5278/index.html")'>
				<img src="image/ydyl.jpg" width="250px" />
			</a><br /> <a href="javascript:void(null)"
				onclick='javascript:window.open("http://norinco.norincogroup.com.cn/col/col5281/index.html")'><img
				src="image/htblh.jpg" width="250px" /></a><br /> <a
				href="javascript:void(null)"
				onclick='javascript:window.open("http://norinco.norincogroup.com.cn/col/col5477/index.html")'><img
				src="image/blh.jpg" width="250px" /></a><br />
		</div>
		<div class="more">
			<a href=""><img src="image/more.png" width="100px"></a>
		</div>
		<div class="shop">
			<div class="hr1">
				<hr />
			</div>
			<div class="background">
			
				<div class="army1">
					<span>枪械</span>
				</div>
				<div class="armypuct1">
					<a href="javascript:void(null)"
				onclick='javascript:window.open("http://localhost:8080/MyJSP/Store1.jsp")'><img src="image/56ban.jpeg" width="200px" /></a>
				</div>
				    <div class="armyname1">
					<span>武器名称：56式半自动步枪</span><br>
					<span>武器数量：<%= count1%></span><br>
					</div>
					<div class="armyname2">
					<span>武器名称：plz-45自行火炮</span><br>
					<span>武器数量：<%= count3%></span><br>
					</div>
					<div class="armyname22">
					<span>武器名称：69式火箭筒</span><br>
					<span>武器数量：<%= count4%></span><br>
					</div>
					<div class="armyname3">
					<span>武器名称：VT-2主战坦克</span><br>
					<span>武器数量：<%= count5%></span><br>
					</div>
					<div class="armyname32">
					<span>武器名称：VT-4主战坦克</span><br>
					<span>武器数量：<%= count6%></span><br>
					</div>
				<div class="armypuct12">
					<a href="javascript:void(null)"
				onclick='javascript:window.open("http://localhost:8080/MyJSP/Store2.jsp")'><img src="image/56chong.jpg" width="200px" /></a>
				</div>
				
				<div class="army2">
					<span>火炮</span>
				</div>
				<div class="armyname12">
					<span>武器名称：56式冲锋枪</span><br>
					<span>武器数量：<%= count2%></span><br>
			    </div>
				<div class="armypuct2">
					<a href="javascript:void(null)"
				onclick='javascript:window.open("http://localhost:8080/MyJSP/Store3.jsp")'><img src="image/plz-45.jpeg" width="200px" /></a>
				</div>
				
					
				<div class="armypuct22">
					<a href="javascript:void(null)"
				onclick='javascript:window.open("http://localhost:8080/MyJSP/Store4.jsp")'><img src="image/69huo.jpeg" width="200px" /></a>
				</div>
				<div class="army3">
					<span>装甲<br />车辆
					</span>
				</div>
			</div>
			<div class="armypuct3">
				<a href="javascript:void(null)"
				onclick='javascript:window.open("http://localhost:8080/MyJSP/Store5.jsp")'><img src="image/VT2.jpeg" width="200px" /></a>
			</div>
			<div class="armypuct32">
				<a href="javascript:void(null)"
				onclick='javascript:window.open("http://localhost:8080/MyJSP/Store6.jsp")'><img src="image/VT4.jpeg" width="200px" /></a>
			</div>
			<div class="hr2">
				<hr />
			</div>
			<div class="hr3">
				<hr />
			</div>
			
		</div>
	</div>
	<div class="tail">
		<div class="background"></div>
		<div class="contain">
			<a href="javascript:void(null)"
				onclick='javascript:window.open("http://norinco.norincogroup.com.cn/col/col5671/index.html")'>法律声明</a>
			| <a href="javascript:void(null)"
				onclick='javascript:window.open("http://norinco.norincogroup.com.cn/col/col5672/index.html")'>常见问题</a>
		</div>
		<div class="contain2">
			<span class="local">copyright@2018 </span><span class="local">中国北方工业有限公司
			</span><span class="local">版权所有 </span><span class="local">京ICP备05049422号
			</span><span class="local">京工网安备11040102700039号</span>
		</div>
	</div>
</body>
</html>