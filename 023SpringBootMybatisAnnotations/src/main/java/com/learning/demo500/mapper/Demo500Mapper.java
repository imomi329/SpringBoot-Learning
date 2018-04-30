package com.learning.demo500.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.learning.demo.bean.Demo;

public interface Demo500Mapper {

	/**
	 * 常見錯誤500，分析
	 * 
	 * @return
	 */
	@Select("SELECT * FROM DEMO WHERE NAME = #{name} AND EMAIL = #{email}")
	public List<Demo> select1(String name, String email);
	// public List<Demo> select1(@Param("name")String name,
	// @Param("email")String email);

	@Insert("INSERT INTO DEMO(NAME, PASSWORD) VALUES (#{name})")
	// @Insert("INSERT INTO DEMO(NAME, PASSWORD) VALUES (#{name}, \"123456\")")
	public int insert1(String name);

	/**
	 * #{} 和 ${} 的區別？
	 * 
	 * @return
	 */
	@Select("SELECT * FROM DEMO WHERE NAME = #{name}")
	public List<Demo> selectByName1(String name);

	@Select("SELECT * FROM DEMO WHERE NAME = ${name}")
	public List<Demo> selectByName2(String name);

}
