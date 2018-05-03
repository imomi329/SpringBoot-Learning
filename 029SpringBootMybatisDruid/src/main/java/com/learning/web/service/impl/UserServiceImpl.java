package com.learning.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.web.mapper.UserMapper;
import com.learning.web.mapper.cluster.CityMapper;
import com.learning.web.model.City;
import com.learning.web.model.User;
import com.learning.web.service.UserService;

/**
 * 用戶業務邏輯實現層
 * 
 * @author yuan
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper; // 主数据源

	@Autowired
	private CityMapper cityMapper; // 从数据源

	@Override
	public User findByName(String userName) {
		User user = userMapper.findByName(userName);
		City city = cityMapper.findByName("温岭市");
		user.setCity(city);
		return user;
	}

}
