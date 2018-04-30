package com.learning.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.learning.demo.model.Demo;
import com.learning.demo.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping("/save")
	public Demo save(Demo demo) {
		int rs = demoService.save(demo);
		// 保存條數....並非主鍵回傳
		System.out.println("rs = " + rs + "--> ID = " + demo.getId());
		return demo;
	}
	
	@RequestMapping("/update")
	public int update(Demo demo) {
		return demoService.update(demo);
	}
	
	@RequestMapping("/delete")
	public int delete(int id) {
		return demoService.delete(id);
	}
	
	@RequestMapping("/selectAll")
	public List<Demo> selectAll() {
		PageHelper.startPage(1,2);
		return demoService.selectAll();
	}
	
	@RequestMapping("/selectById")
	public Demo selectById(int id) {
		return demoService.selectById(id);
	}

}
