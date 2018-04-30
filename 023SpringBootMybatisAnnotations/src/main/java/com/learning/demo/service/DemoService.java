package com.learning.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.demo.bean.Demo;
import com.learning.demo.mapper.DemoMapper;

@Service
public class DemoService {

	@Autowired
	private DemoMapper demoMapper;

	/**
	 * 需要開啟事務，使用註解方式
	 * @param demo
	 * @return
	 */
	@Transactional
	public long save(Demo demo) {
		return demoMapper.save(demo);
	}

	public long update(Demo demo) {
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
