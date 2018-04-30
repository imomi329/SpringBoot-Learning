package com.learning.demoDiff.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.learning.demo.bean.Demo;

public interface DemoDiffTestMapper {

	/**
	 * #{} 和 ${} 的區別？
	 * 小測驗
	 * 
	 * @return
	 */
	// 測驗一：查詢 DEMO 表中，ID = X 的紀錄
	@Select("SELECT * FROM DEMO WHERE ID = #{id}")
	public Demo select3(int id);
	
	// 測驗二：查詢 DEMO 表的數據，並且按照指定字段 id 或者 name 降冪排列
	// SELECT * FROM DEMO ORDER BY id/name(參數參入)
	@Select("SELECT * FROM DEMO ORDER BY ${orderField}")
	public List<Demo> select4(@Param("orderField")String orderField);
	
	// 測驗三：查詢 DEMO 表的數據，並且按照 
	// 1. 指定字段 id 或者 name 
	// 2. 進行 升冪 或者 降冪排列
	@Select("SELECT * FROM DEMO ORDER BY ${orderField} ${ascOrDesc}")
	public List<Demo> select5(@Param("orderField")String orderField, @Param("ascOrDesc")String ascOrDesc);
	
}
