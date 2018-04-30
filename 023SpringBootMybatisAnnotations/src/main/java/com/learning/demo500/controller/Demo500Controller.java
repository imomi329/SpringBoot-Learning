package com.learning.demo500.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.demo.bean.Demo;
import com.learning.demo500.service.Demo500Service;

@RestController
public class Demo500Controller {

	@Autowired
	private Demo500Service demoService;

	/**
	 * 常見錯誤500，分析 
	 * 1. select1-原因：Mapeer中多參數需添加屬性 @Param("XXXX") 
	 * 2. insert1-原因：values缺少
	 * 
	 * @return
	 */
	
	// http://127.0.0.1:8080/select1?name=001926&email=999@gmail.com
	@GetMapping("/select1")
	public List<Demo> select1(String name, String email) {
		return demoService.select1(name, email);
	}

	// http://127.0.0.1:8080/insert1?name=001926
	@GetMapping("/insert1")
	public int insert1(String name) {
		return demoService.insert1(name);
	}

}
