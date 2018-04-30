package com.learning.demoResult.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.demoResult.bean.DemoNew;
import com.learning.demoResult.mapper.DemoResultMapper;

@Service
public class DemoResultService {

	@Autowired
	private DemoResultMapper demoMapper;

	public DemoNew selectById(int id) {
		return demoMapper.selectById(id);
	}
	
}
