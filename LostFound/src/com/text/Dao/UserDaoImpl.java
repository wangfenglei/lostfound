package com.text.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.text.User.User;

public class UserDaoImpl implements IUserDao{
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	
	public UserDaoImpl(Connection conn){
			this.conn=conn;
	}

	@Override
	public boolean findLogin(User user) throws Exception {
		boolean flag=false;
		try{			
			System.out.println("user:"+user.getName());
			
			String sql="SELECT username FROM user WHERE username=? AND password=?";
			this.pstmt=this.conn.prepareStatement(sql);
			this.pstmt.setString(1, user.getName());                    //得到第一个问号对应的数据？
			this.pstmt.setString(2, user.getPassword());
			ResultSet rs=this.pstmt.executeQuery();
		    if (rs.next()) {
		    	//System.out.println("password:"+rs.getString(2));
				System.out.println("user:"+rs.getString(1));            //这个地方怎么没有与数据库中数据进行对比？
				//user.setName(rs.getString(1));                                 //将id对应的名字放到name里
				System.out.println("user:"+user.getName());       
			   flag=true;
			}
		    
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally {
			if(this.pstmt!=null){
				try {
					this.pstmt.close();
				} catch (Exception e) {
					throw e;
				}
			}
		}
		return flag;
	}

	public static StringBuffer personalSelect(String string, String string2, String string3) {
		return null;
	}
	
}
