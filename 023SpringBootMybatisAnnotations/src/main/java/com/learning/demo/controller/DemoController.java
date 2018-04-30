package com.learning.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.learning.demo.bean.Demo;
import com.learning.demo.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;

	// http://127.0.0.1:8080/save?name=001926
	@GetMapping("/save")
	public Demo save(Demo demo) {
		long rs = demoService.save(demo);
		// 保存條數....並非主鍵回傳
		System.out.println("rs = " + rs + "--> ID = " + demo.getId());
		return demo;
	}

	// http://127.0.0.1:8080/update?id=38&name=001120
	@GetMapping("/update")
	public long update(Demo demo) {
		return demoService.update(demo);
	}

	// http://127.0.0.1:8080/delete?id=38
	@GetMapping("/delete")
	public int delete(int id) {
		return demoService.delete(id);
	}

	// http://127.0.0.1:8080/selectAll
	// http://127.0.0.1:8080/selectAll?pageNum=1&pageSize=3
	@GetMapping("/selectAll")
	public List<Demo> selectAll(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return demoService.selectAll();
	}

	// http://127.0.0.1:8080/selectById?id=37
	@GetMapping("/selectById")
	public Demo selectById(int id) {
		return demoService.selectById(id);
	}

}
