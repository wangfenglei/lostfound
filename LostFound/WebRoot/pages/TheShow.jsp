<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>TheShow.jsp</title>
    

  </head>
  <body>
   <%
    	request.setCharacterEncoding("UTF-8");
     %>
   <center>
   	<table>
   		<tr><td>标题是:</td>
   		<td>
   			<%
   			String title=request.getParameter("title");
   			out.print("title");
   			 %>
   		</td></tr>
   	</table>
   </center>
  </body>
</html>
