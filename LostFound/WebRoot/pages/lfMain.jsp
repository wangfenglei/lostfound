<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Main</title>
  </head>
  
  <body>
  <center>
  <%
    	request.setCharacterEncoding("UTF-8");
     %>
     <%
     	List<String> info=(List<String>)request.getAttribute("info");
     	if(info!=null){
     		Iterator<String> iter=info.iterator();
     		while(iter.hasNext()){
      %>
      		<h4><%=iter.next()%></h4>
      <%
      		}
      		}
       %>
       <table align="right">
       		<tr>
       				<td>
       <a href="pages/login.jsp" style="margin-left: 50px;"><font size="2">登录</font></a>
       				</td>
       				<td>
       <a href="pages/register.jsp" style="margin-left: 50px;"><font size="2">注册</font></a>
       				</td>
       				<td>
       <a href="pages/LostInformation.jsp" style="margin-left: 50px;"><font size="2">编辑</font></a>
       				</td>
       		</tr>
       </table>
       <br><br><br><br><br><br><br>
      <center>
       <a href="pages/TheShow.jsp">物品1</a><br>
       <a href="pages/TheShow.jsp">物品2</a><br>
       <a href="pages/TheShow.jsp">物品3</a>
       </center>
       <font color="red" size="2"> ${msg }</font>
  </center>
  </body>
</html>
