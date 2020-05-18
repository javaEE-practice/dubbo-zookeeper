package com.wch.dubbo.service;

import com.wch.dubbo.bean.User;

/**
 * @author CH W
 * @description
 * @date 2020年5月14日 下午4:39:55
 * @version 1.0
 */
public interface UserService {
	
	/**
	 * --注册用户
	 * @param user
	 * @return
	 */
	String registerUser(User user);
	/**
	 * --登录
	 * @param user
	 * @return
	 */
	User login(User user);

}
