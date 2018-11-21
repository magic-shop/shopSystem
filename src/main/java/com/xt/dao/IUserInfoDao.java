package com.xt.dao;

import java.util.List;

import com.xt.common.User;

/**
 * 用户数据访问接口
 * 
 * @author 李岚祺
 */
public interface IUserInfoDao {

	/**
	 * 依据用户名和密码登陆抽象方法
	 * 
	 * @author 李岚祺
	 */
	List<User> login(String userName, String password);
	
	/**
	 * 依据密码和手机号注册抽象方法
	 * 
	 * @author 李岚祺
	 */
	boolean registerByPhone(String password, String phone, String code);
	
	/**
	 * 依据密码和邮箱注册抽象方法
	 * 
	 * @author 李岚祺
	 */
	boolean registerByEmail(String password, String email);
}
