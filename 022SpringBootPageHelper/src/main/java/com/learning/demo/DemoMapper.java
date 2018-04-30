package com.learning.demo;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface DemoMapper {
	
	// #{name} : 參數佔位符
	@Select("SELECT * FROM DEMO WHERE NAME = #{name}")
	public List<Demo> likeName(String name);
	
	@Select("SELECT * FROM DEMO WHERE ID = #{id}")
	public Demo getById(long id);
	
	@Select("SELECT NAME FROM DEMO WHERE ID = #{id}")
	public String getNameById(long id);

}
