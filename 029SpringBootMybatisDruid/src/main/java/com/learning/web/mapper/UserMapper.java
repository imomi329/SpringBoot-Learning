package com.learning.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.learning.web.model.User;

/**
 * 用戶 DAO 接口類
 * 
 * @author yuan
 */
@Mapper
public interface UserMapper {

	/**
	 * 根据用户名获取用户信息
	 *
	 * @param userName
	 * @return
	 */
	User findByName(@Param("userName") String userName);

}
