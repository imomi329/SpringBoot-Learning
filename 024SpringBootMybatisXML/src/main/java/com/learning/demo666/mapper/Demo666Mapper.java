package com.learning.demo666.mapper;

import java.util.List;

import com.learning.demo666.model.Demo666;

public interface Demo666Mapper {
	
	public List<Demo666> select1(Demo666 demo);
	
	public int update1(Demo666 demo);
	
	public List<Demo666> select2(Demo666 demo);
	
	public int update2(Demo666 demo);
	
	public List<Demo666> select3(Demo666 demo);
	
	public List<Demo666> select4(String[] ids);
	
	public List<Demo666> select5(List<Integer> list);
	
}
