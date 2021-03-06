package com.learning.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.web.model.User;
import com.learning.web.service.UserService;

/**
 * 城市 Controller 實現 Restful HTTP 服務
 * 
 * @author yuan
 */
@RestController
public class UserRestController {

	@Autowired
	private UserService userService;

	/**
	 * 根据用户名获取用户信息，包括从库的地址信息
	 *
	 * @param userName
	 * @return
	 * 
	 * sample : http://localhost:8080/api/user?userName=%E6%B3%A5%E7%93%A6%E5%8C%A0
	 */
	@RequestMapping(value = "/api/user", method = RequestMethod.GET)
	public User findByName(@RequestParam(value = "userName", required = true) String userName) {
		return userService.findByName(userName);
	}

}
