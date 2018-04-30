package com.learning.demo500.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.demo.bean.Demo;
import com.learning.demo500.mapper.Demo500Mapper;

@Service
public class Demo500Service {

	@Autowired
	private Demo500Mapper demoMapper;

	/**
	 * 常見錯誤500，分析
	 * 
	 * @return
	 */
	public List<Demo> select1(String name, String email) {
		return demoMapper.select1(name, email);
	}

	public int insert1(String name) {
		return demoMapper.insert1(name);
	}

}
