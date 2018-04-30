package com.learning.demo666.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.demo666.mapper.Demo666Mapper;
import com.learning.demo666.model.Demo666;

@Service
public class Demo666Service {

	@Autowired
	private Demo666Mapper demoMapper;

	public List<Demo666> select1(Demo666 demo) {
		return demoMapper.select1(demo);
	}

	@Transactional
	public int update1(Demo666 demo) {
		return demoMapper.update1(demo);
	}

	public List<Demo666> select2(Demo666 demo) {
		return demoMapper.select2(demo);
	}

	@Transactional
	public int update2(Demo666 demo) {
		return demoMapper.update2(demo);
	}

	public List<Demo666> select3(Demo666 demo) {
		return demoMapper.select3(demo);
	}

	public List<Demo666> select4(String[] ids) {
		return demoMapper.select4(ids);
	}

	public List<Demo666> select5(List<Integer> list) {
		return demoMapper.select5(list);
	}

}
