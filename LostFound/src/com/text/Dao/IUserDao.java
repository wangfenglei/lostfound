package com.text.Dao;

import com.text.User.User;

public interface IUserDao {
	/**
	 * 用户登录验证
	 * @param user 传入VO对象
	 * @return 验证的操作结果
	 * @throws Exception
	 */
	
	public boolean findLogin(User user) throws Exception ;

}
