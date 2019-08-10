<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
   
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">   
    <title>江农失物招领</title>
    <link rel="stylesheet" href="css/login_in.css" type="text/css"/>
  </head>
  
  <body style="overflow:-Scroll;overflow-y:hidden">
  
    <div id="background" style="position:absolute;z-index:-1;width:100%;height: 100%;top: 0px;left: 0px;">
	<img style="width: 100%;height:100%;" src="img/IMG_4535.JPG"></div>
	<div id="top">
	<center><br><h2><font color="white">登陆界面</font></h2></center>
	</div>
	<div id="middle">		
     <div id="warp">
     <div id="box">
	 <div id="opacityMap"></div><br /><br />
       <div id="content">
        <form method="post" action="LoginServlet" id="form">
        <div id="contentLogin">
        <input type="text" name="username" placeholder="请输入用户名" id="user" class="inputBox" /><span class="checkSpan"></span>
        <input type="password" name="password" placeholder="请输入密码" id="password" class="inputBox" /><span class="checkSpan"></span><br/>
        <input type="submit" value="登 录" id="login" name="submitLogin" class="buttonStyle" class="inputBox" />
      &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<a href="pages/register.jsp" style="margin-left: 80px;" ><font size="2"><i>没有账号？点击注册</i></font></a>     
        </div>
         </form>
       </div>
     </div>
     </div>
    </div>
    </div>
  </body>
</html>

