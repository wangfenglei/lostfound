package com.text.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

	public void addUser(String username,String sex,String password,String department,String Classname,String dormitory,String telenum,String QQ){
		Connection con = getConnection();
		PreparedStatement pstmt =null;
		
		System.out.println(username+" "+sex );
		String sql1 = "INSERT INTO user(username,sex,password,department,Classname,dormitory,telenum,QQ) VALUES(?,?,?,?,?,?,?,?)";
		String sql2="insert user values(?,?,?,?,?,?,?,?)";
		try {
			//System.out.println("报错");
			pstmt = con.prepareStatement(sql1);
			//System.out.println("报错2");
			pstmt.setString(1, username);
			pstmt.setString(2, sex);
			pstmt.setString(3, password);
			pstmt.setString(4, department);
			pstmt.setString(5, Classname);
			pstmt.setString(6, dormitory);	
			pstmt.setString(7, telenum);
			pstmt.setString(8, QQ);	
			//pstmt.ex
			pstmt.executeUpdate();
			//System.out.println(num);
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			}catch (SQLException e) {	
				e.printStackTrace();
			}
		}
	}

	private Connection getConnection() {
		String driver ="com.mysql.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/test?autoReconnect=true&;useUnicode=true&;characterEncoding=utf8";
		String user ="root";
		String password ="lihuan";
		Connection connection =null;
		try {
			Class.forName(driver);
			connection =DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection; 
	}

	public void addUser(String title, String[] tips, String infor, String lostdescr) {
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		
		String sql1 = "INSERT INTO lostinformation(title,tips,publisher,pictures,describe) VALUES(?,?,?,?)";
		try {
			System.out.println("报错");
			pstmt = conn.prepareStatement(sql1);
			//System.out.println("报错2");
			pstmt.setString(1, title);
			//pstmt.setNString(2, tips);
			pstmt.setString(3, infor);
			pstmt.setString(4, lostdescr);
			
			pstmt.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch (SQLException e) {	
				e.printStackTrace();
			}
		}
	}

}
