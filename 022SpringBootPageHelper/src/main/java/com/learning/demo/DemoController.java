package com.learning.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/likeName")
	public List<Demo> likeName(String name) {
		/**
		 * (頁數 / 每頁條數)
		 */
		PageHelper.startPage(1, 2);
		return demoService.likeName(name);
	}
	
	@RequestMapping("/getById")
	public Demo getById(long id) {
		return demoService.getById(id);
	}

	@RequestMapping("/getNameById")
	public String getNameById(long id) {
		return demoService.getNameById(id);
	}
	
}
