package com.text.Dao;

import com.text.User.User;

public interface IUserDao {
	/**
	 * �û���¼��֤
	 * @param user ����VO����
	 * @return ��֤�Ĳ������
	 * @throws Exception
	 */
	
	public boolean findLogin(User user) throws Exception ;

}
