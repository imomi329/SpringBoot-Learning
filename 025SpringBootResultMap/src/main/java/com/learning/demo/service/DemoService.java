package com.learning.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.demo.mapper.DemoMapper;
import com.learning.demo.model.Demo;

@Service
public class DemoService {

	@Autowired
	private DemoMapper demoMapper;
	
	public Map<Integer, Demo> selectAll1() {
		return demoMapper.selectAll1();
	}

	public List<Map<String, Object>> selectAll() {
		return demoMapper.selectAll();
	}
	
	public Map<String, Object> selectById(int id) {
		return demoMapper.selectById(id);
	}
	
}
