package com.learning.demoResult.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.learning.demoResult.bean.DemoNew;

public interface DemoResultMapper {

	@Select("SELECT * FROM DEMO WHERE ID = #{id}")
	@Results({
		@Result(property="updateTime", column="UPDATE_TIME")
	})
	public DemoNew selectById(int id);
	
	@Select("<script>SELECT * FROM DEMO WHERE "
			+ "1=1 "
			+ " <if test='name != null'>AND NAME = #{name} </if>"
			+ " <if test='email != null'>AND EMAIL = #{email} </if>"
			+ "</script>")
	public List<DemoNew> select6(DemoNew demoNew);
	
}
