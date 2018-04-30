package com.learning.demoDiff.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.demo.bean.Demo;
import com.learning.demoDiff.mapper.DemoDiffTestMapper;

@Service
public class DemoDiffTestService {

	@Autowired
	private DemoDiffTestMapper demoMapper;

	/**
	 * #{} 和 ${} 的區別？
	 * 小測驗
	 * 
	 * @return
	 */
	// 測驗一：查詢 DEMO 表中，ID = X 的紀錄
	public Demo select3(int id) {
		return demoMapper.select3(id);
	}
	
	// 測驗二：查詢 DEMO 表的數據，並且按照指定字段 id 或者 name 降冪排列
	// SELECT * FROM DEMO ORDER BY id/name(參數參入)
	public List<Demo> select4(String orderField) {
		return demoMapper.select4(orderField);
	}
	
	// 測驗三：查詢 DEMO 表的數據，並且按照 
	// 1. 指定字段 id 或者 name 
	// 2. 進行 升冪 或者 降冪排列
	public List<Demo> select5(@Param("orderField")String orderField, @Param("ascOrDesc")String ascOrDesc) {
		return demoMapper.select5(orderField, ascOrDesc);
	}

}
