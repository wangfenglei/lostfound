<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>LostInformation.jsp</title>
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <script type="text/javascript" src="js/jquery-2.1.1.js">	
     </script>
    <script type="text/javascript">	
    	function submit() {  
                 with(document.getElementById("queryFunction")) {  
                            action="TheShow.jsp";  
                            method="post";  
                            submit();  
                     }  
           }  
    $(function(){
    	
    	function showPreview(){
    	var str=obj.value;
    	document.getElementById("previewImg").innerHTML="<img src='"+str+"'/>";
    	}
    	
   	 });
   	 

</script >  

  </head>
  
  <body>
  <center>
  
      
       
  <form action="LostInformationServlet" method="post" enctype="multipart/form-data">
  	<table width="500px">
  		<tr>
  			<td align="right">标题：</td>
  			<td><input type="text" name="title" value="限制10个字"></td></tr>
  		<tr>
  		<td align="right">标签：</td>
  		<td><input type="checkbox" name="tips" value="书" id="1">书 
  				<input type="checkbox" name="tips" value="校园卡" id="2">校园卡<br>
  				<input type="checkbox" name="tips" value="钥匙" id="3">钥匙 
  				<input type="checkbox" name="tips" value="数码物品" id="4">数码物品
  		</td>
  		</tr>
  		<tr><td align="right">发布人：</td><td><input type="text" name="publisher" value="请输入用户名！"></td></tr>
  		<tr><td align="right">请上传图片：</td>
  				<td>  
  				<br><!--   <img id="previewImg" src="images/01.png" width="80" height="80">-->
  						<input id="infor" type="file" name="infor" ></td></tr>
  		<tr>
  		<td align="right">失物具体描述：</td>
  		<td> <br> <textarea name="lostdescr" rows="8" style="width:300px; ">请填写备注信息... </textarea> </td>		
  		</tr>
  		<tr>
  		<td colspan="2"><input type="submit" value="上传"></td>
  		</tr>
  	</table>
  <!--<font color="red" size="2"> ${msg }</font>-->
  </form>
  </center>
  </body>
</html>
