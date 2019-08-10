package com.text.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.text.User.*;

public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		
		String path="/pages/register.jsp";
		String username=req.getParameter("username");
		String sex=req.getParameter("sex");
		String password=req.getParameter("password");
		String rpsw = req.getParameter("rpsw");
		String department=req.getParameter("department");
		String Classname=req.getParameter("Classname");
		String dormitory=req.getParameter("dormitory");
		String telenum=req.getParameter("telenum");
	    String QQ=req.getParameter("QQ");
		
		
	if(username==null||username.trim().isEmpty()){                               
			req.setAttribute("msg", username+"用户名不能为空！");
			req.getRequestDispatcher(path).forward(req, resp);
			return;
		}
		if(password==null||password.trim().isEmpty()){
			req.setAttribute("msg", "密码不能为空！");
			req.getRequestDispatcher(path).forward(req, resp);
			return;
		}
		if(!password.equals(rpsw)){
			req.setAttribute("msg", "两次输入密码不一样！");
			req.getRequestDispatcher(path).forward(req, resp);
			return;
		}
		
		System.out.println("gbk:"+new String(username.getBytes("gbk")));
		System.out.println("iso:"+new String(username.getBytes("iso-8859-1")));
		System.out.println("utf:"+new String(username.getBytes("utf-8")));
		System.out.println("u8:"+new String(username.getBytes("utf8")));
		
		UserDao u = new UserDao();
		u.addUser(username,sex,password,department,Classname,dormitory,telenum,QQ);
		System.out.println(username+"  "+sex+"  "+password+" "+department+" "+Classname+" "+dormitory+" "+telenum+" "+QQ);
		req.setAttribute("msg", "恭喜你！"+username+"注册成功！");
		req.getRequestDispatcher("/pages/lfMain.jsp").forward(req, resp);
	}
	}