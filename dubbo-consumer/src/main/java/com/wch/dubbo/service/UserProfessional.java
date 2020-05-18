package com.wch.dubbo.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wch.dubbo.bean.User;

/**
 * @author CH W
 * @description
 * @date 2020年5月15日 下午4:28:50
 * @version 1.0
 */
@Service
public class UserProfessional implements UserService {
	@Reference
	private UserService userService;

	@Override
	public String registerUser(User user) {
		return userService.registerUser(user);
	}

	@Override
	public User login(User user) {
		return userService.login(user);
	}

}
