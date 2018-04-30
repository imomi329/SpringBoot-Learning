package com.learning.demoResult.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.demoResult.bean.DemoNew;
import com.learning.demoResult.mapper.DemoResultMapper;
import com.learning.demoResult.service.DemoResultService;

@RestController
@RequestMapping("/New")
public class DemoResultController {

	@Autowired
	private DemoResultService demoService;
	
	@Autowired
	private DemoResultMapper demoMapper; // 偷懶使用，開發時不建議

	// http://127.0.0.1:8080/New/selectById?id=18
	@GetMapping("/selectById")
	public DemoNew selectById(int id) {
		return demoService.selectById(id);
	}
	
	// http://127.0.0.1:8080/New/select6
	// http://127.0.0.1:8080/New/select6?name=001926
	@GetMapping("/select6")
	public List<DemoNew> select6(DemoNew demoNew) {
		return demoMapper.select6(demoNew);
	}

}
