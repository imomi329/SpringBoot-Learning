package com.learning.web.service;

import com.learning.web.model.User;

/**
 * 用戶業務邏輯接口層
 * 
 * @author yuan
 */
public interface UserService {

	/**
	 * 根据用户名获取用户信息，包括从库的地址信息
	 *
	 * @param userName
	 * @return
	 */
	User findByName(String userName);

}
