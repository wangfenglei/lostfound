package com.text.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.text.Dao.DaoFactory;
import com.text.User.User;
import com.text.User.UserDao;

public class LostInformationServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		String title=req.getParameter("title");
		String [ ] tips=req.getParameterValues("tips");
		String infor=req.getParameter("infor");
		String lostdescr=req.getParameter("lostdescr");
		
		System.out.println(title+"  "+tips+"  "+lostdescr);//+infor+""
		
		List<String> info=new ArrayList<String>();
		
		if(title==null||"".equals(title)){
			info.add("标题不能为空！");
		}
		/*else if(infor==null||"".equals(infor)){
			info.add("上传图片不能为空！");
		}
		*/else if (lostdescr==null||"".equals(lostdescr)) {
			info.add("物品描述不能为空！");
		}else if (info.size()==0) {                                       
			User user=new User();                                     
			user.setTitle(title);                             
			user.setInfor(infor);
			try {
				if (DaoFactory.getIUserDaoInstance().findLogin(user)) {
					info.add(user.getTitle()+"已经上传！");
				}else {
					UserDao u = new UserDao();
					u.addUser(title,tips,infor,lostdescr);
					System.out.println(title+"  "+tips+"  "+infor+" "+lostdescr);
					//req.setAttribute("msg", "恭喜上传成功！");
					info.add("添加成功！");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		req.setAttribute("info", info);
		
		req.getRequestDispatcher("/pages/LostInformation.jsp").forward(req, resp);
	}
		
	}

