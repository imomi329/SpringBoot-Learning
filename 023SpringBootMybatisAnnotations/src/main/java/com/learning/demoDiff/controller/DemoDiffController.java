package com.learning.demoDiff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.demo.bean.Demo;
import com.learning.demoDiff.service.DemoDiffService;

@RestController
public class DemoDiffController {

	@Autowired
	private DemoDiffService demoService;

	/**
	 * #{} 和 ${} 的區別？
	 * 1. 在 application.properties 中加入 --> logging.level.包名=DEBUG 
	 * 範例：logging.level.com.finsage=DEBUG
	 * 
	 * @return
	 */
	
	// http://127.0.0.1:8080/selectByName1?name=001926
	@GetMapping("/selectByName1")
	public List<Demo> selectByName1(String name) {
		return demoService.selectByName1(name);
	}

	// http://127.0.0.1:8080/selectByName2?name=001926
	@GetMapping("/selectByName2")
	public List<Demo> selectByName2(String name) {
		return demoService.selectByName2(name);
	}

}
