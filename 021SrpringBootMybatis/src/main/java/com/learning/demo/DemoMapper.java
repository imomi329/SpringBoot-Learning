package com.learning.demo;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface DemoMapper {

	// #{name} : 參數佔位符
	@Select("SELECT * FROM DEMO")
	public List<Demo> likeName(String name);

	@Select("SELECT * FROM DEMO WHERE ID = #{id}")
	public Demo getById(long id);

	@Select("SELECT NAME FROM DEMO WHERE ID = #{id}")
	public String getNameById(long id);

	/**
	 * 保存數據
	 */
	@Insert("INSERT INTO DEMO (NAME) VALUES (#{name})")
	// // 自增ID返回設置
	// @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
	public long save(Demo demo);

}
