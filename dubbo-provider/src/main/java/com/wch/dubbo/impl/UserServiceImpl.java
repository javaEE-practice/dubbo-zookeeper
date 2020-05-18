package com.wch.dubbo.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.wch.dubbo.bean.User;
import com.wch.dubbo.service.UserService;

/**
 * @author CH W
 * @description
 * @date 2020年5月15日 下午4:21:04
 * @version 1.0
 */
@Service
@Component
public class UserServiceImpl implements UserService {

	@Override
	public String registerUser(User user) {
		System.out.println("用户注册： " + user);
		return "用户账号注册成功，请登录使用";
	}

	@Override
	public User login(User user) {
		System.out.println("用户登录：" + user);
		user.setMobile("18779393508");
		return user;
	}

}
