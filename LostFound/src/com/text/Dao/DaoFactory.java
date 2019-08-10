package com.text.Dao;
//import  com.text.Dao.*;
public class DaoFactory {
	public static IUserDao getIUserDaoInstance(){
		return new UserDaoProxy();
	}
}
