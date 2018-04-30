package com.learning.demo666.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.demo666.model.Demo666;
import com.learning.demo666.service.Demo666Service;

@RestController
public class Demo666Controller {

	@Autowired
	private Demo666Service demoService;

	@RequestMapping("/select1")
	public List<Demo666> select1(Demo666 demo) {
		return demoService.select1(demo);
	}
	
	@RequestMapping("/update1")
	public int update1(Demo666 demo) {
		return demoService.update1(demo);
	}
	
	@RequestMapping("/select2")
	public List<Demo666> select2(Demo666 demo) {
		return demoService.select2(demo);
	}

	@RequestMapping("/update2")
	@Transactional
	public int update2(Demo666 demo) {
		return demoService.update2(demo);
	}

	@RequestMapping("/select3")
	public List<Demo666> select3(Demo666 demo) {
		return demoService.select3(demo);
	}

	@RequestMapping("/select4")
	public List<Demo666> select4(String[] ids) {
		return demoService.select4(ids);
	}

	// http://127.0.0.1:8080/select5?id=8&id=9&id=10
	@RequestMapping("/select5")
	public List<Demo666> select5(Integer[] id) {
		return demoService.select5(Arrays.asList(id));
	}

}
