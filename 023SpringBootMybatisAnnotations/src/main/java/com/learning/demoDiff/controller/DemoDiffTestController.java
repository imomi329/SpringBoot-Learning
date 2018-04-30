package com.learning.demoDiff.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.demo.bean.Demo;
import com.learning.demoDiff.service.DemoDiffTestService;

@RestController
public class DemoDiffTestController {

	@Autowired
	private DemoDiffTestService demoService;

	/**
	 * #{} 和 ${} 的區別？ 
	 * 小測驗
	 * 
	 * @return
	 */
	
	// 測驗一：查詢 DEMO 表中，ID = X 的紀錄
	// http://127.0.0.1:8080/select3?id=11
	@GetMapping("/select3")
	public Demo select3(int id) {
		return demoService.select3(id);
	}

	// 測驗二：查詢 DEMO 表的數據，並且按照指定字段 id 或者 name 降冪排列
	// SELECT * FROM DEMO ORDER BY id/name(參數參入)
	// http://127.0.0.1:8080/select4?orderField=name
	@GetMapping("/select4")
	public List<Demo> select4(String orderField) {
		return demoService.select4(orderField);
	}

	// 測驗三：查詢 DEMO 表的數據，並且按照
	// 1. 指定字段 id 或者 name
	// 2. 進行 升冪 或者 降冪排列
	// http://127.0.0.1:8080/select5?orderField=name&ascOrDesc=desc
	@GetMapping("/select5")
	public List<Demo> select5(@Param("orderField") String orderField, @Param("ascOrDesc") String ascOrDesc) {
		return demoService.select5(orderField, ascOrDesc);
	}

}
