package com.learning.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.learning.demo.bean.Demo;

/**
 * 解決 not found 問題： 
 * ------------------------- 
 * 1. 使用 @Mapper 註釋： 缺點，未來每一個 Mapper 接口類都需要添加 
 * 2. 使用統一的方式： 使用 @MapperScan，在 App.java 進行配置
 * 
 * @author yuan
 */
//@Mapper
public interface DemoMapper {

	/**
	 * 1. 使用 @Insert 聲明一條添加數據的 SQL 語句 
	 * 2. 使用 #{} 進行變量的綁定
	 * 
	 * @param demo
	 * @return
	 */
	@Insert("INSERT INTO DEMO (NAME) VALUES (#{name})")
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	public long save(Demo demo);

	/**
	 * 修改語句
	 * 
	 * @param demo
	 * @return
	 */
	@Update("UPDATE DEMO SET NAME = #{name} WHERE ID = #{id} ")
	public long update(Demo demo);

	/**
	 * 刪除語句
	 * 
	 * @param demo
	 * @return
	 */
	@Delete("DELETE FROM DEMO WHERE ID = #{id}")
	public int delete(int id);

	@Select("SELECT * FROM DEMO")
	public List<Demo> selectAll();

	@Select("SELECT * FROM DEMO WHERE ID = #{id}")
	public Demo selectById(int id);
	
}
