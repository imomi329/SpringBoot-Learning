package com.learning.demo.mapper;

import java.util.List;

import com.learning.demo.model.Demo;

public interface DemoMapper {
	
	public int save(Demo demo);
	
	// 注意方法名和我們 demoMapper.xml 中的 id 要相同
	public int update(Demo demo);
	
	public int delete(int id);
	
	public List<Demo> selectAll();
	
	public Demo selectById(int id);

}
