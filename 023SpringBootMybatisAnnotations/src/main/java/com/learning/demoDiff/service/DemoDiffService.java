package com.learning.demoDiff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.demo.bean.Demo;
import com.learning.demoDiff.mapper.DemoDiffMapper;

@Service
public class DemoDiffService {

	@Autowired
	private DemoDiffMapper demoMapper;

	/**
	 * #{} 和 ${} 的區別？
	 * 
	 * @return
	 */
	public List<Demo> selectByName1(String name) {
		return demoMapper.selectByName1(name);
	}

	public List<Demo> selectByName2(String name) {
		return demoMapper.selectByName2(name);
	}

}
