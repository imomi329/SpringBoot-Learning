package com.learning.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.demo.model.Demo;
import com.learning.demo.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping("/selectAll1")
	public Map<Integer, Demo> selectAll1() {
		return demoService.selectAll1();
	}
	
	@RequestMapping("/selectAll")
	public List<Map<String, Object>> selectAll() {
		return demoService.selectAll();
	}
	
	@RequestMapping("/selectById")
	public Map<String, Object> selectById(int id) {
		return demoService.selectById(id);
	}
	
}
