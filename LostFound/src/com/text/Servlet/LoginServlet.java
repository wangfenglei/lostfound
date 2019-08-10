package com.text.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.text.Dao.DaoFactory;
import com.text.User.User;

public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost");
		//String path="../../login.jsp";
		
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		List<String> info=new ArrayList<String>();
		
		if(username==null||"".equals(username)){
			info.add(username+"用户名不能为空！");
		}else if(password==null||"".equals(password)){
			info.add("密码不能为空！");
		}else if (info.size()==0) {                                       
			User user=new User();                                     
			user.setName(username);                              
			user.setPassword(password);
			try {
				if (DaoFactory.getIUserDaoInstance().findLogin(user)) {
					info.add("恭喜"+user.getName()+"登陆成功！");
					req.setAttribute("info", info);
					req.getRequestDispatcher("/mainpage.html").forward(req, resp);
				}else {
					info.add("用户不存在!请注册~");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		req.setAttribute("info", info);
		req.getRequestDispatcher("/pages/login.jsp").forward(req, resp);
	}
}
