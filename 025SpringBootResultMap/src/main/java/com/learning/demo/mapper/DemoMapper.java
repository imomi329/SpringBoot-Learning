package com.learning.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

import com.learning.demo.model.Demo;

public interface DemoMapper {
	
	@MapKey("ID")
	public Map<Integer, Demo> selectAll1();

	public List<Map<String, Object>> selectAll();
	
	public Map<String, Object> selectById(int id);

}
