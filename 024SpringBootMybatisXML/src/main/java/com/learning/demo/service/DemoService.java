package com.learning.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.demo.mapper.DemoMapper;
import com.learning.demo.model.Demo;

@Service
public class DemoService {

	@Autowired
	private DemoMapper demoMapper;

	@Transactional // 添加事務
	public int save(Demo demo) {
		return demoMapper.save(demo);
	}
	
	public int update(Demo demo) {
		return demoMapper.update(demo);
	}
	
	public int delete(int id) {
		return demoMapper.delete(id);
	}
	
	public List<Demo> selectAll() {
		return demoMapper.selectAll();
	}
	
	public Demo selectById(int id) {
		return demoMapper.selectById(id);
	}
	
}
