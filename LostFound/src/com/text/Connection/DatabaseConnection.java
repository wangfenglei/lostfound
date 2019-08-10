package com.text.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DatabaseConnection {

	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/test";
	private static final String USERNAME="root";
	private static final String PASSWORD="lihuan";
	private Connection conn=null;
	
	public DatabaseConnection() throws Exception{
		try{
			Class.forName(DRIVER);                            
			conn=DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, e);
			throw e;                                                     
		}catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null,e);
			//System.err.println(e);
			throw e; 
		}
	}
	
	
	public  Connection getConnection() {
		if (conn!=null) {
			System.out.println("数据库连接成功！");
			return conn;
		} 
		System.out.println("数据库连接失败！");
		return null;
	}
	 
	/*
	 * public Connection getConnection(){                    
		return this.conn;
	}
	 */
	
	public void close() throws Exception{                     
		if(conn!=null){
			try{
				conn.close();
			}catch(Exception e){
				throw e;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  try {
			(new  DatabaseConnection()).getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println(00);
		
	}

}
