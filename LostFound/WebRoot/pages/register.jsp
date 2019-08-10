<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>失物招领注册页面</title>
    <link rel="stylesheet" href="css/register.css" />
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
   <body>
  
    <div id="background" style="position:absolute;z-index:-1;width:100%;height: 100%;top: 0px;left: 0px;">
	<img style="width: 100%;height:100%;" src="img/IMG_4535.JPG"></div>
	<div id="top">
	<center><br><h2><font color="white">注册界面</font></h2></center>
	</div>
	<div id="middle">		
     <div id="warp">
     <div id="box">
	 <div id="opacityMap"></div><br /><br />
       <div id="content">
        <form method="post" action="RegisterServlet" id="form">
        <div id="contentLogin">
        <input type="text" name="username" placeholder="请输入真实姓名" id="user" class="inputBox" /><span class="checkSpan"></span><br>
         <input type="text" name="username" placeholder="请输入密码" id="user" class="inputBox" /><span class="checkSpan"></span><br>
          <input type="text" name="username" placeholder="重复密码" id="user" class="inputBox" /><span class="checkSpan"></span><br>
           <input type="text" name="username" placeholder="请输入用户名" id="user" class="inputBox" /><span class="checkSpan"></span><br>
            <input type="text" name="username" placeholder="请输入用户名" id="user" class="inputBox" /><span class="checkSpan"></span><br>
             <input type="text" name="username" placeholder="请输入班级号" id="user" class="inputBox" /><span class="checkSpan"></span><br>
              <input type="text" name="username" placeholder="请输入寝室号" id="user" class="inputBox" /><span class="checkSpan"></span><br>
               <input type="text" name="username" placeholder="请输入电话号码" id="user" class="inputBox" /><span class="checkSpan"></span><br>
        <input type="password" name="password" placeholder="请输入QQ号" id="password" class="inputBox" /><span class="checkSpan"></span><br/>
        <input type="submit" value="登 录" id="login" name="submitLogin" class="buttonStyle" class="inputBox" />
        <input type="reset" value="重 置" id="reset" name="submitReset" class="buttonStyle" class="inputBox" />
     </div>
      </form>
       </div>
     </div>
     </div>
    </div>
 
  </body>
</html>
