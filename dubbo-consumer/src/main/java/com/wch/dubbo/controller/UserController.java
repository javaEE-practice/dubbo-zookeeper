package com.wch.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wch.dubbo.bean.User;
import com.wch.dubbo.service.UserProfessional;

/**
 * @author CH W
 * @description
 * @date 2020年5月15日 下午5:03:44
 * @version 1.0
 */
@RestController
@RequestMapping("user/")
public class UserController {
	@Autowired
	private UserProfessional userProfessional;
	
	/**
	 * --注册用户
	 * @param user
	 * @return
	 */
	@PostMapping(value = "regigster")
	public String register(User user) {
		return userProfessional.registerUser(user);
	}
	/**
	 * --用户登录
	 * @param user
	 * @return
	 */
	@GetMapping(value = "login")
	public User login(User user) {
		return userProfessional.login(user);
	}

}
