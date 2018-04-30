package com.learning.demoDiff.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.learning.demo.bean.Demo;

public interface DemoDiffMapper {

	/**
	 * #{} 和 ${} 的區別？
	 * 
	 * @return
	 */
	@Select("SELECT * FROM DEMO WHERE NAME = #{name}")
	public List<Demo> selectByName1(String name);

	@Select("SELECT * FROM DEMO WHERE NAME = '${name}'")
	public List<Demo> selectByName2(@Param("name")String name);

}
