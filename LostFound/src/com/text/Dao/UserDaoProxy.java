package com.text.Dao;

import com.text.Connection.DatabaseConnection;
import com.text.User.User;

public class UserDaoProxy implements IUserDao{
	
	private DatabaseConnection dbc=null;
	private IUserDao dao=null;
	public UserDaoProxy() {
		try {
			this.dbc=new DatabaseConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.dao=new UserDaoImpl(this.dbc.getConnection());
	}
	
	
	@Override
	public boolean findLogin(User user) throws Exception {
		boolean flag=false;
		try {
			flag=this.dao.findLogin(user);
		} catch (Exception e) {
			throw e;
		}finally {
			this.dbc.close();
		}
		return flag;
	}
}
