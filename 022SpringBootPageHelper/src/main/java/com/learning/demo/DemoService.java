package com.learning.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

	@Autowired
	private DemoMapper demoMapper;

	public List<Demo> likeName(String name) {
		return demoMapper.likeName(name);
	}

	public Demo getById(long id) {
		return demoMapper.getById(id);
	}

	public String getNameById(long id) {
		return demoMapper.getNameById(id);
	}
	
}
